package com.webflux.liquidaciones.infraestructura.entrypoint.empleado.dto;

import com.webflux.liquidaciones.domain.model.Empleado;
import org.springframework.data.annotation.Id;


import java.util.Date;

public class EmpleadoDTO  {

    @Id
    private Integer id_documento;
    private String nombre_apellidos;
    private Date fecha_contrato;

    public Empleado toDomain() {

        return new Empleado(id_documento, nombre_apellidos, fecha_contrato);
    }

    public static EmpleadoDTO fromDomain(Empleado empleado) {
        return new EmpleadoDTO(empleado.getId_documento(), empleado.getNombre_apellidos(), empleado.getFecha_contrato());
    }

    public EmpleadoDTO(Integer id_documento, String nombre_apellidos, Date fecha_contrato) {
        this.id_documento = id_documento;
        this.nombre_apellidos = nombre_apellidos;
        this.fecha_contrato = fecha_contrato;
    }

    public Integer getId_documento() {
        return id_documento;
    }

    public String getNombre_apellidos() {
        return nombre_apellidos;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public EmpleadoDTO() {
    }
}
