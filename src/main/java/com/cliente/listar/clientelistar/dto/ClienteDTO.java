package com.cliente.listar.clientelistar.dto;

import com.cliente.listar.clientelistar.entities.Cliente;

public class ClienteDTO {

    private Long id;
    private String cpf;
    private String nome;

    public ClienteDTO() { }

    public ClienteDTO(Cliente entity) {
        id = entity.getId();
        cpf = entity.getCpf();
        nome = entity.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
