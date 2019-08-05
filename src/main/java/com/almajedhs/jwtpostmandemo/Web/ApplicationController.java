package com.almajedhs.jwtpostmandemo.Web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApplicationController {

    @RequestMapping(value = "/secured/app",method = RequestMethod.GET)
    public Map<String, String> verifyApplicationAccess() {

        final Map<String, String> messageObject = new HashMap<>();

        messageObject.put("secured", "true");


        return messageObject;
    }
}
