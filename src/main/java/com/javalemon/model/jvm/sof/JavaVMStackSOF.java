package com.javalemon.model.jvm.sof;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-12-12
 * @desc vm: -Xss160k
 */

public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF sof = new JavaVMStackSOF();
        try {
            sof.stackLeak();
        } catch (Throwable e) {
            System.out.println(sof.stackLength);
            e.printStackTrace();
        }
    }
}
