
package com.mycompany.trabajoprogramacion;

import java.time.LocalDate;
public class ReservaDetalle {
    private Reserva reserva;
    private Automovil automovil;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double litrosGasolina;
   
public ReservaDetalle() {
    System.out.println("Se ha creado un detalle de reserva");
}
    public Reserva getReserva() {
        return reserva;
    }
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public Automovil getAutomovil() {
        return automovil;
    }
    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    public double getLitrosGasolina() {
        return litrosGasolina;
    }
    public void setLitrosGasolina(double litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }}
