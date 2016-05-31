package com.zuowei.controller;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangwei on 16/5/28.
 */
@Controller
@RequestMapping("/data")
public class DataController {

    @RequestMapping("/ajax")
    @ResponseBody
    public Map<String, Object> ajax() {
        Map<String, Object> result = new HashMap<>();
        result.put("zuowei", "doubi");
        return result;
    }

    @RequestMapping("/{category_1}/{category_2}")
    @ResponseBody
    public Map<String, Object> ajax1(@RequestParam String category_1, @RequestParam String category_2) {
        Map<String, Object> result = new HashMap<>();
        result.put("zuowei", "doubi");
        return result;
    }

}
