package com.iai.hfnu.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Author indinner
 * @Date 2023/12/28 14:42
 * @Version 1.0
 * @Doc:
 */
@RestController
@RequestMapping("user")
@CrossOrigin(origins = "*")
public class LoginController {



    @GetMapping("login")
    public Boolean login(@RequestParam String id,@RequestParam String password){
        if(id.equals("user")&&password.equals("123")){
            return true;
        }else {
            return false;
        }
    }


}
