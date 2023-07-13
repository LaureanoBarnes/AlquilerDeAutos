
package com.mycompany.trabajoprogramacion;


public class Cliente {
    private String codigoCliente;
    private String DNI;
    private String nombre;
    private String dirección;
    private String teléfono;
    private Cliente avalador;

     public Cliente(String codigoCliente, String DNI, String nombre, String dirección, String teléfono) {
        this.codigoCliente = codigoCliente;
        this.DNI = DNI;
        this.nombre = nombre;
        this.dirección = dirección;
        this.teléfono = teléfono;
        System.out.println("Se ha creado un cliente: " + nombre);
    }
    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public Cliente getAvalador() {
        return avalador;
    }

    public void setAvalador(Cliente avalador) {
        this.avalador = avalador;
    }
    
}
