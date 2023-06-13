package com.webflux.liquidaciones.domain.model.dto;

import com.webflux.liquidaciones.domain.model.Empleado;

import java.util.Date;

public class EmpleadoDTO  {

    private Integer documento;
    private String nombresApellidos;
    private Date fechaContratacion;

    public Empleado toDomain() {
        return new Empleado(documento, nombresApellidos, fechaContratacion);
    }

    public static EmpleadoDTO fromDomain(Empleado empleado) {
        return new EmpleadoDTO(empleado.getIdDocumento(), empleado.getNombresApellidos(), empleado.getFechaContratacion());
    }

    public EmpleadoDTO(Integer documento, String nombresApellidos, Date fechaContratacion) {
        this.documento = documento;
        this.nombresApellidos = nombresApellidos;
        this.fechaContratacion = fechaContratacion;
    }

    public Integer getDocumento() {
        return documento;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public EmpleadoDTO() {
    }
}
