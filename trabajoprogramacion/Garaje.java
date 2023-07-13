
package com.mycompany.trabajoprogramacion;


public class Garaje {
    private int maxCoche;
    private String codigoGaraje;
    
public Garaje() {
    System.out.println("Se ha creado un garaje");
}
    public int getMaxCoche() {
        return maxCoche;
    }

    public void setMaxCoche(int maxCoche) {
        this.maxCoche = maxCoche;
    }

    public String getCodigoGaraje() {
        return codigoGaraje;
    }

    public void setCodigoGaraje(String codigoGaraje) {
        this.codigoGaraje = codigoGaraje;
    }
    
}
