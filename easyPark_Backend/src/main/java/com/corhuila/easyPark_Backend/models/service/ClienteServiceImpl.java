package com.corhuila.easyPark_Backend.models.service;

import com.corhuila.easyPark_Backend.models.dao.IClienteDao;
import com.corhuila.easyPark_Backend.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll(){
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id){
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente save(Cliente cliente){
        return clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id){
        clienteDao.deleteById(id);
    }
}
