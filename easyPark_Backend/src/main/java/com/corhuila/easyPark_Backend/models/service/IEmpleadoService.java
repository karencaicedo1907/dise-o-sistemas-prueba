package com.corhuila.easyPark_Backend.models.service;

import com.corhuila.easyPark_Backend.models.entity.Empleado;
import java.util.List;

public interface IEmpleadoService {

    public List<Empleado> findAll();

    public Empleado findById(Long id);

    public Empleado save(Empleado empleado);

    public void delete(Long id);
}
