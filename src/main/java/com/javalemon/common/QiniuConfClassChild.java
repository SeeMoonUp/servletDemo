package com.javalemon.common;

import com.javalemon.model.entity.User;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-11-26
 * @desc
 */

public class QiniuConfClassChild extends QiniuConfClass {
    public static final User user = new User();
    public static void main(String[] args) {

        System.out.println(QiniuConfClass.user);
        System.out.println(QiniuConfClassChild.user);

    }
}
