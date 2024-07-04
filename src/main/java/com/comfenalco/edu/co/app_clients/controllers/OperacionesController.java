package com.comfenalco.edu.co.app_clients.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operaciones-matematicas")
public class OperacionesController  {

    @GetMapping("/suma/{valor1}/{valor2}")
    public int sumar(@PathVariable int valor1,@PathVariable int valor2){
        return valor1+valor2;
    }


    @GetMapping("/resta")
    public int resta(@RequestParam int valor1,@RequestParam int valor2){
        if(valor1-valor2<0){
            return 0;
        }else{
            return valor1-valor2;
        }
    }

    @GetMapping("/multiplicar")
    public int multiplicar(@RequestBody Map<String,Object> datos){
            
        int valor1=(Integer)datos.get("valor1");
        int valor2=(Integer)datos.get("valor2");
        return valor1*valor2;


    }


}
