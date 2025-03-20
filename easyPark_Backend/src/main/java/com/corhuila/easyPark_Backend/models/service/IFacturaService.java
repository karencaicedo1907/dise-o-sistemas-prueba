package com.corhuila.easyPark_Backend.models.service;

import com.corhuila.easyPark_Backend.models.entity.Factura;

import java.util.List;

public interface IFacturaService {

    public List<Factura> findAll();

    public Factura findById(Long id);

    public Factura save(Factura factura);

    public void delete(Long id);
}
