package com.webflux.liquidaciones.infraestructura.adapters.entity;


import com.webflux.liquidaciones.domain.model.Empleado;
import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.util.Date;


@Table(name = "empleados")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoDBO {

    @Id
    private Integer id_documento;

    private String nombre_apellidos;

    private Date fecha_contrato;

   public static EmpleadoDBO fromDomain(Empleado empleado){
         return EmpleadoDBO.builder()
                .id_documento(empleado.getId_documento())
                .nombre_apellidos(empleado.getNombre_apellidos())
                .fecha_contrato(empleado.getFecha_contrato())
                .build();
   }

    public Empleado toDomain(){
         return new Empleado(builder().id_documento, builder().nombre_apellidos, builder().fecha_contrato);
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

}
