package com.comfenalco.edu.co.app_clients.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class IndexController {

    @GetMapping("/hello/{nombre}")
    public String hello(@PathVariable String nombre){
        return "Get Hola, cómo estas, "+nombre+"?";
    }

    @GetMapping("/chao")
    public String chao(){
        return "Get Chao, amigo";
    }

    @PostMapping("/hello")
    public String enviarHello(){
        return "Post Hola, cómo estas?";
    }

    @DeleteMapping("/")
    public void delete(){
        System.out.println("delete en acción");
    }

    @PutMapping("/{id}")
    public String putMethodName(@PathVariable String id) {
        return id;
    }

    

    

}
