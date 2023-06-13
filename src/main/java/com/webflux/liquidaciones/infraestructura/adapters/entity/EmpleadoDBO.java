package com.webflux.liquidaciones.infraestructura.adapters.entity;


import com.webflux.liquidaciones.domain.model.Empleado;
import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@Table(name = "empleados")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoDBO {

    @Id
    private Integer idDocumento;
    private String nombresApellidos;
    private Date fechaContratacion;

   public static EmpleadoDBO fromDomain(Empleado empleado){
         return EmpleadoDBO.builder()
                .idDocumento(empleado.getIdDocumento())
                .nombresApellidos(empleado.getNombresApellidos())
                .fechaContratacion(empleado.getFechaContratacion())
                .build();
   }

    public static Empleado toDomain(EmpleadoDBO empleadoDBO){
         return new Empleado(empleadoDBO.getIdDocumento(),empleadoDBO.getNombresApellidos(),empleadoDBO.getFechaContratacion());
    }

     public Integer getIdDocumento() {
          return idDocumento;
     }

     public String getNombresApellidos() {
          return nombresApellidos;
     }

     public Date getFechaContratacion() {
          return fechaContratacion;
     }

}
