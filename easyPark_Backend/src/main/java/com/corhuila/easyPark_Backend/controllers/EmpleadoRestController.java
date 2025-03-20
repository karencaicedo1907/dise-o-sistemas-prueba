package com.corhuila.easyPark_Backend.controllers;

import com.corhuila.easyPark_Backend.models.entity.Empleado;
import com.corhuila.easyPark_Backend.models.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/empleado")
    public List<Empleado> index(){
        return empleadoService.findAll();
    }

    @GetMapping("/empleado/{id}")
    public Empleado show(@PathVariable Long id){
        return empleadoService.findById(id);
    }

    @PostMapping("/empleado")
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado create(@RequestBody Empleado empleado){
        return empleadoService.save(empleado);
    }

    @PutMapping("/empleado/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado update(@RequestBody Empleado empleado, @PathVariable Long id){
        Empleado empleadoActual = empleadoService.findById(id);
        empleadoActual.setNombreEmpleado(empleado.getNombreEmpleado());
        empleadoActual.setTelefonoEmpleado(empleado.getTelefonoEmpleado());
        empleadoActual.setNit(empleado.getNit());
        return empleadoService.save(empleadoActual);
    }

    @DeleteMapping("/empleado/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        empleadoService.delete(id);
    }
}
