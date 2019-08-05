package com.almajedhs.jwtpostmandemo.Web;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class LoginController {

    @RequestMapping(value = "/authenticate",method = RequestMethod.GET, produces = "application/json")
    public Map<String, String> registeruser(Client client) {

        String tokenTmp = Jwts.builder().setSubject(client.getClientName()).setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, "123#&*zcvAWEE999").compact();

        final Map<String, String> messageObject = new HashMap<>();
        String token = "Bearer ".concat(tokenTmp);
        messageObject.put("token", token);

        return messageObject;

    }
}
