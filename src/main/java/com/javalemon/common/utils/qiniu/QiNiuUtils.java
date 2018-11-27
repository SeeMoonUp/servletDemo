package com.javalemon.common.utils.qiniu;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @author lemon(lemon@javalemon.cc)
 * @date 2018年11月23日
 * @desc
 */
public class QiNiuUtils {
	
	private static final Log GCW_LOG = LogFactory.getLog(QiNiuUtils.class.getName());
	
	public static Auth createAuth() {
		return Auth.create(QiNiuConf.ACCESS_KEY, QiNiuConf.SECRET_KEY);
	}
	

	// 上传，使用默认策略
	public static String getUpToken(Auth auth, String bucket){
		//return auth.uploadToken(bucket);
		return auth.uploadToken(bucket, null, 60*60*3, new StringMap()
	            .putNotEmpty("returnBody", "{\"key\": $(key), \"hash\": $(etag)}"));
	}
	

    /**
     * 处理 file类型的图片上传
     * @param imgInputStream
     * @param key 在七牛上的存储路径 + 文件名
     * @param bucket 七牛存储空间名称
     * @return 外链
     */
    public static String uploadImage(InputStream imgInputStream, String key, String bucket) {

		if (imgInputStream == null) {
			return null;
		}

		Configuration cfg = new Configuration(Zone.zone1());
		UploadManager uploadManager = new UploadManager(cfg);

		String upToken = getUpToken(bucket);
		try {
			Response response = uploadManager.put(imgInputStream, key,upToken,null, null);
			//解析上传成功的结果
			DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
			System.out.println(putRet.key);
			System.out.println(putRet.hash);
			return "http://" + QiNiuConf.IMAGE_DOMAIN + "/" + putRet.key;
		} catch (QiniuException ex) {
			Response r = ex.response;
			System.err.println(r.toString());
			try {
				System.err.println(r.bodyString());
			} catch (QiniuException ex2) {
				//ignore
			}
		}

		return null;

    }

    /**
     * 将 spring mvc文件上传的默认类型 MultipartFile 转成 java.io.File
     * @param multipartFile spring mvc file upload default type
     * @return java.io.File
     */
//    private static File toFile(MultipartFile multipartFile) {
//
//        if (multipartFile != null && multipartFile instanceof CommonsMultipartFile) {
//            CommonsMultipartFile cf = (CommonsMultipartFile) multipartFile;
//            FileItem item = cf.getFileItem();
//            if (item instanceof DiskFileItem) {
//                DiskFileItem fileItem = (DiskFileItem) item;
//                File file = fileItem.getStoreLocation();
//                if (file != null) {
//                    return file;
//                }
//            }
//        }
//        return null;
//    }

    /**
     * 根据 空间名称获取 upToken (accessKey和 secretKey是公用的)
     * @param bucket bucket name
     * @return upToken
     */
    private static String getUpToken(String bucket) {
        return createAuth().uploadToken(bucket);
    }


	/**
	 * 将图片地址转换为流
	 * @param imageUrl 图片地址
	 * @return
	 */
	private static InputStream getImageInputStream(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.setConnectTimeout(5 * 1000);
			InputStream inStream = conn.getInputStream();//通过输入流获取图片数据
			return inStream;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 上传第三方图片地址至七牛
	 * @param imageUrl
	 * @return
	 */
	public static String uploadImageToQiniu(String imageUrl) {
		InputStream inputStream = getImageInputStream(imageUrl);
		return uploadImage(inputStream, null, QiNiuConf.BUCKET_IMAGE);
	}

	public static void main(String[] args) {
		String imageUrl = "https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTKZrDGxPW2b1XnQp8sAMjtz9ic8wX7icsw5ZBAGvu6GkXt9rhvr0N04QGTfDK4B97NHPhrdGUkicoicZA/132";
		String qiniuUrl = QiNiuUtils.uploadImageToQiniu(imageUrl);
		System.out.println(qiniuUrl);
	}

}