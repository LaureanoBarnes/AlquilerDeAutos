
package com.mycompany.trabajoprogramacion;


public class Automovil {
    private String matricula;
    private String modelo;
    private String color;
    private String marca;
    private Garaje garaje;
public Automovil(String matricula, String modelo, String color, String marca, Garaje garaje) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.garaje = garaje;
        System.out.println("Se ha creado un automóvil: " + marca + " " + modelo);
    }
    public Garaje getGaraje() {
        return garaje;
    }

    public void setGaraje(Garaje garaje) {
        this.garaje = garaje;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }
    
}
