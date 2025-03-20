package com.corhuila.easyPark_Backend.models.service;

import com.corhuila.easyPark_Backend.models.entity.Pago;

import java.util.List;

public interface IPagoService {

    public List<Pago> findAll();

    public Pago findById(Long id);

    public Pago save(Pago pago);

    public void delete(Long id);
}
