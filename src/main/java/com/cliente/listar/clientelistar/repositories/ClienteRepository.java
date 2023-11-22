package com.cliente.listar.clientelistar.repositories;

import com.cliente.listar.clientelistar.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
