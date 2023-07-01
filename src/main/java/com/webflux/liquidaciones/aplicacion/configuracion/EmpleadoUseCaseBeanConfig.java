package com.webflux.liquidaciones.aplicacion.configuracion;

import com.webflux.liquidaciones.domain.model.gateways.EmpleadoRepository;
import com.webflux.liquidaciones.domain.usecase.EmpleadoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpleadoUseCaseBeanConfig {

    @Bean
    public EmpleadoUseCase empleadoUseCase(EmpleadoRepository empleadoRepository) {
        return new EmpleadoUseCase(empleadoRepository);
    }

}
