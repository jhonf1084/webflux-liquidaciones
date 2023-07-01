package com.webflux.liquidaciones.domain.usecase;

import com.webflux.liquidaciones.domain.model.Empleado;
import com.webflux.liquidaciones.domain.model.gateways.EmpleadoRepository;
import com.webflux.liquidaciones.infraestructura.entrypoint.empleado.dto.EmpleadoDTO;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class EmpleadoUseCase {

    private final EmpleadoRepository empleadoRepository;

    public Mono<Empleado> guardar(EmpleadoDTO empleadoDTO) {
        Empleado empleado = empleadoDTO.toDomain();
        return empleadoRepository.guardar(empleado);
    }

    public Mono<Empleado> actualizarByDocumento(EmpleadoDTO empleadoDTO) {
        Empleado empleado = empleadoDTO.toDomain();
        return empleadoRepository.actualizarByDocumento(empleado);
    }

    public Mono<Empleado> eliminar(Integer id) {
        return empleadoRepository.eliminar(id);
    }

    public Mono<Empleado> consultarByDocumento(Integer documento) {
        return empleadoRepository.consultarByDocumento(documento);
    }

//    public Mono<Empleado> consultarPorIdOrNombresApellidos(Integer id, String nombresApellidos) {
//        return empleadoRepository.consultarPorIdOrNombresApellidos(id, nombresApellidos);
//    }

    public Flux<Empleado> consultarTodos() {
        return empleadoRepository.consultarTodos();
    }


}
