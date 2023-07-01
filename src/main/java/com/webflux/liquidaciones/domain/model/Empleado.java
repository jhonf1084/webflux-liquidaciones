package com.webflux.liquidaciones.domain.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Date;

public class Empleado {
    @Id
    private Integer id_documento;
    private String nombre_apellidos;

    private Date fecha_contrato;

    public Integer getId_documento() {
        return id_documento;
    }

    public String getNombre_apellidos() {
        return nombre_apellidos;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public Empleado(Integer id_documento, String nombre_apellidos, Date fecha_contrato) {
        this.id_documento = id_documento;
        this.nombre_apellidos = nombre_apellidos;
        this.fecha_contrato = fecha_contrato;
    }

    public Empleado() {
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id_documento=" + id_documento +
                ", nombre_apellidos='" + nombre_apellidos + '\'' +
                ", fecha_contrato=" + fecha_contrato +
                '}';
    }
}
