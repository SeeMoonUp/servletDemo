package com.javalemon.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-11-26
 * @desc
 */

public class User {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("ccc");
        ts.add("aaa");
        ts.add("ddd");
        ts.add("bbb");

        System.out.println(ts); // [aaa, bbb, ccc, ddd]
        System.out.println(6 >> 1);
        List<User> user = new ArrayList<User>();

        List<? super User> list1 = user;
        list1.add(new User());

    }
}
