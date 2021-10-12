package com.DigitalHouse.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostagemController {

    @GetMapping
    public  String getPosts(){

        return " Acesso Válido";
    }

}
