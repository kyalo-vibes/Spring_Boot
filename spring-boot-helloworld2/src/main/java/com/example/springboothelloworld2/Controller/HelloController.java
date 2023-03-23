package com.example.springboothelloworld2.Controller;

import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;
@Controller
public class HelloController {
    private Map<String, Object> result = new HashMap<>();
@RequestBody("/hello")
@RequestMapping
    public Map<String, Object> hello() {
        result.put("name", "Stephen");
        result.put("city", "San Jose");
        return result;
    }
}
