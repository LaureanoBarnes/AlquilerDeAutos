
package com.mycompany.trabajoprogramacion;


public class Agencia {
    private String nombre;
    private String direccion;
public Agencia() {
    System.out.println("Se ha creado una agencia");
}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
