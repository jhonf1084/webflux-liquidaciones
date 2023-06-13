package com.webflux.liquidaciones.domain.model;

import java.util.Date;

public class Empleado {

    private Integer idDocumento;
    private String nombresApellidos;

    private Date fechaContratacion;

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public Empleado(Integer idDocumento, String nombresApellidos, Date fechaContratacion) {
        this.idDocumento = idDocumento;
        this.nombresApellidos = nombresApellidos;
        this.fechaContratacion = fechaContratacion;
    }

    public Empleado() {
    }
}
