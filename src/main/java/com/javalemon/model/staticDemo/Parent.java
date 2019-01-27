package com.javalemon.model.staticDemo;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-12-09
 * @desc
 */

public class Parent {
    static {
        System.out.println("parent static module");
    }

    private static final String a = "parent static vali";

    public Parent(){
        System.out.println("parent constru");
    }

    public boolean testMethod() {
        System.out.println("parent testMethod");
        return false;
    }


}
