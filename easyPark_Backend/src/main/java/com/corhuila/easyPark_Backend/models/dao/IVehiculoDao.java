package com.corhuila.easyPark_Backend.models.dao;

import com.corhuila.easyPark_Backend.models.entity.Vehiculo;
import org.springframework.data.repository.CrudRepository;

public interface IVehiculoDao extends CrudRepository <Vehiculo, Long> {
}
