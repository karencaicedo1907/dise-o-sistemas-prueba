package com.corhuila.easyPark_Backend.models.dao;

import com.corhuila.easyPark_Backend.models.entity.Tarifa;
import org.springframework.data.repository.CrudRepository;

public interface ITarifaDao extends CrudRepository <Tarifa, Long> {
}
