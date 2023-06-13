package com.webflux.liquidaciones.domain.model;

import java.util.Date;

public class Salario {

    private Integer idSalario;
    private Integer idEmpleado;
    private Float salario;
    private Float auxilioTransporte;
    private Integer idCargo;
    private Date fechaFechaModificacion;


    public Integer getIdSalario() {
        return idSalario;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public Float getSalario() {
        return salario;
    }

    public Float getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public Date getFechaFechaModificacion() {
        return fechaFechaModificacion;
    }

    public Salario(Integer idSalario, Integer idEmpleado, Float salario, Float auxilioTransporte, Integer idCargo, Date fechaFechaModificacion) {
        this.idSalario = idSalario;
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.auxilioTransporte = auxilioTransporte;
        this.idCargo = idCargo;
        this.fechaFechaModificacion = fechaFechaModificacion;
    }

    public Salario() {
    }
}
