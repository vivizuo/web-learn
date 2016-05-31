package com.github.vivizuo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/data")
public class DataController {

    @RequestMapping("/ajax")
    @ResponseBody
    public Map<String, Object> ajax() {
        Map<String, Object> result = new HashMap<>();
        result.put("ajax", "test");
        return result;
    }

    @RequestMapping("/{category_1}/{category_2}")
    @ResponseBody
    public Map<String, Object> ajax1(@PathVariable String category_1, @PathVariable String category_2) {
        Map<String, Object> result = new HashMap<>();
        result.put("category_1", category_1);
        result.put("category_2", category_2);
        return result;
    }

}
