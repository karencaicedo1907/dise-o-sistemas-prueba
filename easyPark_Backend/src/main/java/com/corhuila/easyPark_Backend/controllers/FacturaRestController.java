package com.corhuila.easyPark_Backend.controllers;

import com.corhuila.easyPark_Backend.models.entity.Factura;
import com.corhuila.easyPark_Backend.models.service.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FacturaRestController {

    @Autowired
    private IFacturaService facturaService;

    @GetMapping("/factura")
    public List<Factura> index(){
        return facturaService.findAll();
    }

    @GetMapping("/factura/{id}")
    public Factura show(@PathVariable Long id){
        return facturaService.findById(id);
    }

    @PostMapping("/factura")
    @ResponseStatus(HttpStatus.CREATED)
    public Factura create(@RequestBody Factura factura){
        return facturaService.save(factura);
    }

    @PutMapping("/factura/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Factura update(@RequestBody Factura factura, @PathVariable Long id){
        Factura facturaActual = facturaService.findById(id);
        facturaActual.setNumeroFactura(factura.getNumeroFactura());
        facturaActual.setEmpleado(factura.getEmpleado());
        return facturaService.save(facturaActual);
    }

    @DeleteMapping("/factura/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        facturaService.delete(id);
    }
}
