package com.webflux.liquidaciones.infraestructura.adapters;

import com.webflux.liquidaciones.infraestructura.adapters.entity.EmpleadoDBO;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.Date;


@Repository
public interface EmpleadoDBORepository extends ReactiveCrudRepository<EmpleadoDBO, Integer> {

//    @Query("INSERT INTO empleados (id_documento, nombre_apellidos, fecha_contrato) VALUES (:id_documento, :nombre_apellidos, :fecha_contrato)")
//    Mono<EmpleadoDBO> save(Integer id_documento, String nombre_apellidos, Date fecha_contrato);

}
