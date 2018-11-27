package com.javalemon.common;

import com.javalemon.model.entity.User;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-11-26
 * @desc
 */

public class QiniuConfImpl implements QiniuConf {
    public static final User user = new User();

    public static void main(String[] args) {
//        QiniuConfImpl qiniuConfI = new QiniuConfImpl();
        System.out.println(QiniuConfImpl.user);
        System.out.println(QiniuConf.user);
    }
}
