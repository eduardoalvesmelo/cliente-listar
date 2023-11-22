package com.cliente.listar.clientelistar.services;

import com.cliente.listar.clientelistar.dto.ClienteDTO;
import com.cliente.listar.clientelistar.entities.Cliente;
import com.cliente.listar.clientelistar.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        List<Cliente> result = clienteRepository.findAll();
        return result;
    }

}
