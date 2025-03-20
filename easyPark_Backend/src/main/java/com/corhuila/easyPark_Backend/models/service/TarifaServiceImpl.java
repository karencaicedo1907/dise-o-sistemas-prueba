package com.corhuila.easyPark_Backend.models.service;

import com.corhuila.easyPark_Backend.models.dao.IPagoDao;
import com.corhuila.easyPark_Backend.models.dao.ITarifaDao;
import com.corhuila.easyPark_Backend.models.entity.Pago;
import com.corhuila.easyPark_Backend.models.entity.Tarifa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TarifaServiceImpl implements ITarifaService{

    @Autowired
    private ITarifaDao tarifaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Tarifa> findAll(){
        return (List<Tarifa>) tarifaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Tarifa findById(Long id){
        return tarifaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Tarifa save(Tarifa tarifa){
        return tarifaDao.save(tarifa);
    }

    @Override
    @Transactional
    public void delete(Long id){
        tarifaDao.deleteById(id);
    }
}
