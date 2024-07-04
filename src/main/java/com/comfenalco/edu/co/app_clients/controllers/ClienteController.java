package com.comfenalco.edu.co.app_clients.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comfenalco.edu.co.app_clients.repositories.models.Cliente;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/clientes")
@RestController
public class ClienteController {

    @PostMapping("/crear")
    public String crear(@RequestBody Cliente cliente) {

        return "Esta es la información de: "+cliente.nombre+" "+cliente.apellido+" "+"email:"+" "+cliente.email;
        
    }
    

}
