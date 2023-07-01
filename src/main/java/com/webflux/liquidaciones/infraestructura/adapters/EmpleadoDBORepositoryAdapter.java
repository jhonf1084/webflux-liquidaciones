package com.webflux.liquidaciones.infraestructura.adapters;


import com.webflux.liquidaciones.domain.model.Empleado;
import com.webflux.liquidaciones.domain.model.gateways.EmpleadoRepository;
import com.webflux.liquidaciones.infraestructura.adapters.entity.EmpleadoDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Repository
@AllArgsConstructor
public class EmpleadoDBORepositoryAdapter implements EmpleadoRepository {

    private final EmpleadoDBORepository empleadoDBORepository;


    @Override
    public Mono<Empleado> guardar(Empleado empleado) {
        return empleadoDBORepository.save(EmpleadoDBO.fromDomain(empleado)).map(EmpleadoDBO::toDomain);
    }

    @Override
    public Mono<Empleado> actualizarByDocumento(Empleado empleado) {
        EmpleadoDBO empleadoDBO = EmpleadoDBO.fromDomain(empleado);
        return empleadoDBORepository.save(empleadoDBO).map(EmpleadoDBO::toDomain);
    }

    @Override
    public Mono<Empleado> eliminar(Integer id) {
        return empleadoDBORepository.findById(id)
                .flatMap(E -> empleadoDBORepository
                        .delete(E)
                        .then(Mono.just(E.toDomain())));
    }

    @Override
    public Mono<Empleado> consultarByDocumento(Integer documento) {

        return empleadoDBORepository.findById(documento).map(EmpleadoDBO::toDomain);
    }

//    @Override
//    public Mono<Empleado> consultarPorIdOrNombresApellidos(Integer id, String nombresApellidos) {
//        return null;
//    }

    @Override
    public Flux<Empleado> consultarTodos() {

        return empleadoDBORepository.findAll().map(EmpleadoDBO::toDomain);
    }
}
