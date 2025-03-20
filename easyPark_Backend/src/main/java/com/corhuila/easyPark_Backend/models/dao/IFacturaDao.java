package com.corhuila.easyPark_Backend.models.dao;

import com.corhuila.easyPark_Backend.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository <Factura, Long> {
}
