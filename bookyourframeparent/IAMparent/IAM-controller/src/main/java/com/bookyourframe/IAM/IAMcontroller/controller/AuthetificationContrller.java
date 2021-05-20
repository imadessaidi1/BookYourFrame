package com.bookyourframe.IAM.IAMcontroller.controller;

import com.bookyourframe.IAM.IAMservice.dto.CredentialsDTO;
import com.bookyourframe.IAM.IAMservice.dto.UserDTO;
import com.bookyourframe.IAM.IAMservice.exception.UserNotFoundException;
import com.bookyourframe.IAM.IAMservice.helpers.MD5Utils;
import com.bookyourframe.IAM.IAMservice.service.IamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by mac on 29/03/2020.
 */
@RestController
@ConfigurationProperties(prefix="app")
@RequestMapping("/IAM/v1")
public class AuthetificationContrller {

    private IamService iamService;

    @Value("${message:Hello default}")
    private String message;

    @Autowired
    public AuthetificationContrller(IamService iamService){
        this.iamService = iamService;
    }

    @PostMapping("/authentify")
    public UserDTO authetifyUser(@RequestBody CredentialsDTO credentialsDTO) {
        try {
            return iamService.authetifyUser(credentialsDTO.getLogging(), MD5Utils.getEncodedPassword(credentialsDTO.getPassword()));
        } catch (UserNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    @GetMapping(value = "/check")
    public String check(){
        return message;
    }

    @GetMapping("/resource")
    public String resource(@AuthenticationPrincipal Jwt jwt) {
        return String.format("Resource accessed by: %s (with subjectId: %s)" ,
                jwt.getClaims().get("user_name"),
                jwt.getSubject());
    }


}
