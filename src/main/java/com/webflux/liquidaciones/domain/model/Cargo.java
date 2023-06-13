package com.webflux.liquidaciones.domain.model;

public class Cargo {

    private Integer idCargo;
    private String cargo;

    public Integer getIdCargo() {
        return idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public Cargo(Integer idCargo, String nombreCargo) {
        this.idCargo = idCargo;
        this.cargo = nombreCargo;
    }

    public Cargo() {
    }

}
