package com.javalemon.model.staticDemo;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-12-09
 * @desc
 */

public class Children extends Parent{
    static {
        System.out.println("Children static module");
    }

    private static final String a = "Children static vali";

    public Children(){
        System.out.println("Children constru");
    }

    public boolean testMethod() {
        System.out.println("Children testMethod");
        return false;
    }

    public static void main(String[] args) {
        System.out.println("main");
        Children c = new Children();
        c.testMethod();
    }
}
