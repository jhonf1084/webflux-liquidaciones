package com.webflux.liquidaciones.infraestructura.adapters;


import com.webflux.liquidaciones.domain.model.gateways.EmpleadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@AllArgsConstructor
public class EmpleadoDBORepositoryAdapter implements EmpleadoRepository {

    private final EmpleadoDBORepository repository;


}
