package com.corhuila.easyPark_Backend.models.dao;

import com.corhuila.easyPark_Backend.models.entity.Pago;
import org.springframework.data.repository.CrudRepository;

public interface IPagoDao extends CrudRepository <Pago, Long> {
}
