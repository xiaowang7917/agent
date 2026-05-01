package com.lab.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ApiController {

    private List<Map<String,String>> logs = new ArrayList<>();

    @PostMapping("/chat")
    public Map<String,String> chat(@RequestBody Map<String,String> req){
        String q = req.get("message");
        String reply = "AI: 已收到问题 -> " + q;

        Map<String,String> res = new HashMap<>();
        res.put("reply", reply);

        logs.add(req);
        return res;
    }

    @GetMapping("/logs")
    public List<Map<String,String>> logs(){
        return logs;
    }
}