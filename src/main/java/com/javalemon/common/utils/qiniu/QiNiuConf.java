/**
 *
 */
package com.javalemon.common.utils.qiniu;

import java.nio.charset.Charset;

/**
 * @author lemon(lemon@javalemon.com)
 * @date 2018年11月23日
 * @desc 七牛配置
 */
public interface QiNiuConf {

	Charset UTF_8 = Charset.forName("UTF-8");

	String ACCESS_KEY = "SPMEgc1PbHuY39zMht0yFJBNZ2dOUlWxbS_geoyN";
	String SECRET_KEY = "lrubqnyUQ0DPTRVRBcDuMTkrlrXAF28tKrG-xurv";

	String BUCKET_IMAGE = "seemoonup";
	String BUCKET_AUDIO = "lemon-mp3";

	String IMAGE_DOMAIN = "img.javalemon.com";

}
