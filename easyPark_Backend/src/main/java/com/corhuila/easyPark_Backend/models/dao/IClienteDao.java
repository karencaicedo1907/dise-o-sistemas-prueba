package com.corhuila.easyPark_Backend.models.dao;

import com.corhuila.easyPark_Backend.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository <Cliente, Long> {
}
