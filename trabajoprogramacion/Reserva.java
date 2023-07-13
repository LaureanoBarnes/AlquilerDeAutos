
package com.mycompany.trabajoprogramacion;

public class Reserva {
    private String codigoReserva;
    private Cliente cliente;
    private double precioTotal;
    private Automovil automovil;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Reserva(String codigoReserva, Cliente cliente, Automovil automovil) {
        this.codigoReserva = codigoReserva;
        this.cliente = cliente;
        this.automovil = automovil;
        System.out.println("Se ha creado una reserva: " + codigoReserva);
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
   
}

