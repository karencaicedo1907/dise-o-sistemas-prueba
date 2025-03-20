package com.corhuila.easyPark_Backend.models.service;

import com.corhuila.easyPark_Backend.models.dao.IEmpleadoDao;
import com.corhuila.easyPark_Backend.models.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

    @Autowired
    private IEmpleadoDao empleadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> findAll(){
        return (List<Empleado>) empleadoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado findById(Long id){
        return empleadoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Empleado save(Empleado empleado){
        return empleadoDao.save(empleado);
    }

    @Override
    @Transactional
    public void delete(Long id){
        empleadoDao.deleteById(id);
    }
}
