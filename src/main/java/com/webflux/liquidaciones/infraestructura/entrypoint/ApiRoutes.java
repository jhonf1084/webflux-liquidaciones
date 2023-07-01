package com.webflux.liquidaciones.infraestructura.entrypoint;

import com.webflux.liquidaciones.infraestructura.entrypoint.empleado.EmpleadoHandler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;


@Configuration
public class ApiRoutes {

    @Value("${PATH_BASE}")
    private String pathBase;
    @Bean
    public RouterFunction<ServerResponse> empleadoFunctionalEndpoints(EmpleadoHandler empleadoHandler) {
        String param = "/{idDocumento} || /{nombresApellidos}";
   
        return RouterFunctions
                .route(POST(pathBase.concat("/guardar")).and(accept(MediaType.APPLICATION_JSON)), empleadoHandler::guardar)
                .andRoute(PUT(pathBase.concat(param)).and(accept(MediaType.APPLICATION_JSON)), empleadoHandler::actualizar)
                .andRoute(DELETE(pathBase.concat(param)).and(accept(MediaType.APPLICATION_JSON)), empleadoHandler::eliminar)
                .andRoute(GET(pathBase.concat(param)).and(accept(MediaType.APPLICATION_JSON)), empleadoHandler::consultarByDocumento)
                //.andRoute(GET(pathBase.concat(param)).and(accept(MediaType.APPLICATION_JSON)), empleadoHandler::consultarPorIdOrNombresApellidos)
                .andRoute(GET(pathBase).and(accept(MediaType.APPLICATION_JSON)), empleadoHandler::consultarTodos);
    }
}
