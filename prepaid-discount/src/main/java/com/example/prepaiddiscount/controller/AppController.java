package com.example.prepaiddiscount.controller;

import com.example.prepaiddiscount.util.PrepaidInActive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private PrepaidInActive prepaidInActive;

    @GetMapping
    public void removeItem(){
        prepaidInActive.removeItemInCart();
    }
}
