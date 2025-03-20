package com.corhuila.easyPark_Backend.models.dao;

import com.corhuila.easyPark_Backend.models.entity.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoDao extends CrudRepository <Empleado, Long> {
}
