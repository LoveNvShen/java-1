package com.lcg.test;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //ע���������ΪController
public class Test1 {

    /**
     * ���ط������ݵ�ַ ��
     * http://localhost:8080/hello
     * @param map
     * @return
     */
    @RequestMapping("/hello")
    public String helloHtml(HashMap<String, Object> map) {
        map.put("hello", "���ƣ���ӭ����HTMLҳ��");
        return "/login";
    }
}