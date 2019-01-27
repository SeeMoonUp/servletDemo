package com.javalemon.model.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-12-12
 * @desc vm:-Xms10M -Xmx10M
 */

public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
