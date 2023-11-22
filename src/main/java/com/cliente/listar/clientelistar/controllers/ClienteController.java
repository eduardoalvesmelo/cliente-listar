package com.cliente.listar.clientelistar.controllers;

import com.cliente.listar.clientelistar.entities.Cliente;
import com.cliente.listar.clientelistar.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> findAll(){
        List<Cliente> result = clienteService.findAll();
        return result;
    }
}
