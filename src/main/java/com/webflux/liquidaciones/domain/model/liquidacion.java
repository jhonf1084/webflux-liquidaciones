package com.webflux.liquidaciones.domain.model;

import java.util.Date;

public class liquidacion {

    private Integer idLiquidacion;
    private Integer idEmpleado;
    private Date fechaFinalContrato;
    private String motivoRetiro;
    private Integer totalDiasLaborados;
    private Integer diasLaboradosAno;
    private Integer diasPendientesVacaciones;
    private Integer diasLaboradosUltimoSemestre;
    private Float liquidacionCesantias;
    private Float liquidacionVacaciones;
    private Float interesesCesantias;
    private Float primaServicios;
    private Float nominaPendiente;
    private Float totalLiquidacion;

    public Integer getIdLiquidacion() {
        return idLiquidacion;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public Date getFechaFinalContrato() {
        return fechaFinalContrato;
    }

    public String getMotivoRetiro() {
        return motivoRetiro;
    }

    public Integer getTotalDiasLaborados() {
        return totalDiasLaborados;
    }

    public Integer getDiasLaboradosAno() {
        return diasLaboradosAno;
    }

    public Integer getDiasPendientesVacaciones() {
        return diasPendientesVacaciones;
    }

    public Integer getDiasLaboradosUltimoSemestre() {
        return diasLaboradosUltimoSemestre;
    }

    public Float getLiquidacionCesantias() {
        return liquidacionCesantias;
    }

    public Float getLiquidacionVacaciones() {
        return liquidacionVacaciones;
    }

    public Float getInteresesCesantias() {
        return interesesCesantias;
    }

    public Float getPrimaServicios() {
        return primaServicios;
    }

    public Float getNominaPendiente() {
        return nominaPendiente;
    }

    public Float getTotalLiquidacion() {
        return totalLiquidacion;
    }

    public liquidacion(Integer idLiquidacion, Integer idEmpleado, Date fechaFinalContrato, String motivoRetiro, Integer totalDiasLaborados, Integer diasLaboradosAno, Integer diasPendientesVacaciones, Integer diasLaboradosUltimoSemestre, Float liquidacionCesantias, Float liquidacionVacaciones, Float interesesCesantias, Float primaServicios, Float nominaPendiente, Float totalLiquidacion) {
        this.idLiquidacion = idLiquidacion;
        this.idEmpleado = idEmpleado;
        this.fechaFinalContrato = fechaFinalContrato;
        this.motivoRetiro = motivoRetiro;
        this.totalDiasLaborados = totalDiasLaborados;
        this.diasLaboradosAno = diasLaboradosAno;
        this.diasPendientesVacaciones = diasPendientesVacaciones;
        this.diasLaboradosUltimoSemestre = diasLaboradosUltimoSemestre;
        this.liquidacionCesantias = liquidacionCesantias;
        this.liquidacionVacaciones = liquidacionVacaciones;
        this.interesesCesantias = interesesCesantias;
        this.primaServicios = primaServicios;
        this.nominaPendiente = nominaPendiente;
        this.totalLiquidacion = totalLiquidacion;
    }

    public liquidacion() {
    }
}
