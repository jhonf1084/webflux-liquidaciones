package com.webflux.liquidaciones.infraestructura.adapters;

import com.webflux.liquidaciones.infraestructura.adapters.entity.EmpleadoDBO;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface EmpleadoDBORepository extends ReactiveCrudRepository<EmpleadoDBO, Integer> {

    public Mono<EmpleadoDBO> findByIdDocumento(Integer idDocumento);

}
