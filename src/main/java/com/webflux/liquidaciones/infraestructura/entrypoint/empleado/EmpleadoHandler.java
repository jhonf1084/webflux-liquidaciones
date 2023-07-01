package com.webflux.liquidaciones.infraestructura.entrypoint.empleado;

import com.webflux.liquidaciones.domain.usecase.EmpleadoUseCase;
import com.webflux.liquidaciones.infraestructura.entrypoint.empleado.dto.EmpleadoDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class EmpleadoHandler {

    private final EmpleadoUseCase empleadoUseCase;

    public Mono<ServerResponse> guardar(ServerRequest request) {
        return request
                .bodyToMono(EmpleadoDTO.class)
                .flatMap(empleadoDTO -> empleadoUseCase
                        .guardar(empleadoDTO)
                .flatMap(empleado -> ServerResponse
                        .status(HttpStatus.CREATED)
                        .bodyValue(empleado))
                .onErrorResume(exception -> ServerResponse
                        .badRequest()
                        .bodyValue(exception.getMessage())));
    }


    public Mono<ServerResponse> actualizar(ServerRequest request) {

        return empleadoUseCase
                .consultarByDocumento(Integer.valueOf(request.pathVariable("idDocumento")))
                .flatMap(empleado -> request.bodyToMono(EmpleadoDTO.class))
                .flatMap(empleadoDTO -> empleadoUseCase
                        .actualizarByDocumento(empleadoDTO)
                .flatMap(empleado -> ServerResponse.status(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(empleado))
                .switchIfEmpty(ServerResponse.notFound().build()));
    }

    public Mono<ServerResponse> eliminar(ServerRequest request) {
        return empleadoUseCase.eliminar(Integer.valueOf(request.pathVariable("id")))
                .flatMap(empleado -> ServerResponse.status(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(empleado))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> consultarByDocumento(ServerRequest request) {
        return empleadoUseCase.consultarByDocumento(Integer.valueOf(request.pathVariable("id")))
                .flatMap(empleado -> ServerResponse.status(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(empleado))
                .switchIfEmpty(ServerResponse.notFound().build());
    }


//    public Mono<ServerResponse> consultarPorIdOrNombresapellidos (ServerRequest request) {
//        return empleadoUseCase.consultarPorIdOrNombresapellidos(Integer.valueOf(request.pathVariable("id")))
//                .flatMap(empleado -> ServerResponse.status(HttpStatus.OK)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .bodyValue(empleado))
//                .switchIfEmpty(ServerResponse.notFound().build());
//    }


    public Mono<ServerResponse> consultarTodos(ServerRequest request) {
        return empleadoUseCase.consultarTodos()
                .collectList()
                .flatMap(empleado -> ServerResponse
                        .ok()
                        .bodyValue(empleado))
                .switchIfEmpty(ServerResponse
                        .notFound()
                        .build());
    }


}
