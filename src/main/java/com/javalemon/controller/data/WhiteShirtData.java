package com.javalemon.controller.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2019-01-27
 * @desc
 */

public class WhiteShirtData {
    public static List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

    public static boolean addData(String content) {
        Map<String, Object> one = new HashMap<String, Object>();
        one.put("id", 5);
        one.put("nickname", "lemon");
        one.put("avatarUrl", "");
        one.put("time", "");
        one.put("text", content);
        one.put("original_pic", "");
        one.put("comment_count", 12);
        one.put("like_count", 12);
        data.add(0, one);
        return true;
    }
}
