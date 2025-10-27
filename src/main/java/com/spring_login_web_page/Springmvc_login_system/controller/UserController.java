package com.spring_login_web_page.Springmvc_login_system.controller;
import com.spring_login_web_page.springmvc_login_system.model.ApplicationUser;
import com.spring_login_web_page.springmvc_login_system.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
@Controller
public class UserController {
    @Autowired
    public  UserServices userServices;
    @GetMapping("/user")
    public String AccessUserPage() {return "User Page Is Successfully Accessed";}
   @GetMapping("/saveAll/{Authorities]")
    public String getAllBYAuthorities(@RequestParam List<SecurityProperties.User> Authorities, @RequestBody ApplicationUser applicationUser){
        return  userServices.getAllBYAuthorities(Authorities);
    }
    @GetMapping("/saveAll/{Password}")
    public String getAllByPassword(String Password){
        return userServices.getAllByPassword(Password);
    }
}
