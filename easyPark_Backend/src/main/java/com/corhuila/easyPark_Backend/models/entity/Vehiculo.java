package com.corhuila.easyPark_Backend.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "vehiculo")
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = (10), nullable = false)
    private String placa;
    @Column(length = (100), nullable = false)
    private String tipoVehiculo;

    @Column(name = "Fecha creación")
    @Temporal(TemporalType.DATE)
    private Date created_at;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false) // Clave foránea
    private Cliente cliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String nit) {
        this.tipoVehiculo = nit;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}
