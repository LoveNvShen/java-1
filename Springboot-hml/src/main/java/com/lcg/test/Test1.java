package com.lcg.test;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //注意这里必须为Controller
public class Test1 {

    /**
     * 本地访问内容地址 ：
     * http://localhost:8080/hello
     * @param map
     * @return
     */
    @RequestMapping("/hello")
    public String helloHtml(HashMap<String, Object> map) {
        map.put("hello", "王菲！欢迎进入HTML页面");
        return "/login";
    }
}