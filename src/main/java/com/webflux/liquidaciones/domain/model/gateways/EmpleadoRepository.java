package com.webflux.liquidaciones.domain.model.gateways;


import com.webflux.liquidaciones.domain.model.Empleado;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmpleadoRepository {

    Mono<Empleado> guardar(Empleado empleado);
    Mono<Empleado> actualizarByDocumento(Empleado empleado);
    Mono<Empleado> eliminar(Integer id_documento);
    Mono<Empleado> consultarByDocumento(Integer id_documento);

    //Mono<Empleado> consultarPorIdOrNombresApellidos(Integer id, String nombresApellidos);
    Flux<Empleado> consultarTodos();

}
