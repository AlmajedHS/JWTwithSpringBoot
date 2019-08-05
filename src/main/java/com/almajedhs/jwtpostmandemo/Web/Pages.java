package com.almajedhs.jwtpostmandemo.Web;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class Pages {


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String  login() {
    return "login";
    }
    @RequestMapping(value = "/result",method = RequestMethod.GET)
    public String  result() {
        return "result";
    }
}
