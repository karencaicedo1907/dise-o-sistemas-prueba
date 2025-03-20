package com.corhuila.easyPark_Backend.models.service;

import com.corhuila.easyPark_Backend.models.dao.IVehiculoDao;
import com.corhuila.easyPark_Backend.models.entity.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

    @Autowired
    private IVehiculoDao vehiculoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Vehiculo> findAll(){
        return (List<Vehiculo>) vehiculoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Vehiculo findById(Long id){
        return vehiculoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Vehiculo save(Vehiculo vehiculo){
        return vehiculoDao.save(vehiculo);
    }

    @Override
    @Transactional
    public void delete(Long id){
        vehiculoDao.deleteById(id);
    }
}
