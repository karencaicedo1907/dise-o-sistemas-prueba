package com.corhuila.easyPark_Backend.controllers;

import com.corhuila.easyPark_Backend.models.entity.Vehiculo;
import com.corhuila.easyPark_Backend.models.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VehiculoRestController {

    @Autowired
    private IVehiculoService vehiculoService;

    @GetMapping("/vehiculo")
    public List<Vehiculo> index(){
        return vehiculoService.findAll();
    }

    @GetMapping("/vehiculo/{id}")
    public Vehiculo show(@PathVariable Long id){
        return vehiculoService.findById(id);
    }

    @PostMapping("/vehiculo")
    @ResponseStatus(HttpStatus.CREATED)
    public Vehiculo create(@RequestBody Vehiculo vehiculo){
        return vehiculoService.save(vehiculo);
    }

    @PutMapping("/vehiculo/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Vehiculo update(@RequestBody Vehiculo vehiculo, @PathVariable Long id){
        Vehiculo vehiculoActual = vehiculoService.findById(id);
        vehiculoActual.setTipoVehiculo(vehiculo.getTipoVehiculo());
        vehiculoActual.setPlaca(vehiculo.getPlaca());
        vehiculoActual.setCliente(vehiculo.getCliente());
        return vehiculoService.save(vehiculoActual);
    }

    @DeleteMapping("/vehiculo/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        vehiculoService.delete(id);
    }
}
