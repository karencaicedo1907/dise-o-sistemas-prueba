package com.corhuila.easyPark_Backend.models.service;

import com.corhuila.easyPark_Backend.models.entity.Tarifa;
import java.util.List;

public interface ITarifaService {

    public List<Tarifa> findAll();

    public Tarifa findById(Long id);

    public Tarifa save(Tarifa tarifa);

    public void delete(Long id);
}
