package com.corhuila.easyPark_Backend.models.service;

import com.corhuila.easyPark_Backend.models.dao.IPagoDao;
import com.corhuila.easyPark_Backend.models.entity.Pago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PagoServiceImpl implements IPagoService{

    @Autowired
    private IPagoDao pagoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pago> findAll(){
        return (List<Pago>) pagoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Pago findById(Long id){
        return pagoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Pago save(Pago pago){
        return pagoDao.save(pago);
    }

    @Override
    @Transactional
    public void delete(Long id){
        pagoDao.deleteById(id);
    }
}
