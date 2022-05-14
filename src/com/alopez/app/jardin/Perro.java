package com.alopez.app.jardin;

import com.alopez.app.hogar.Persona;

public class Perro { //Si quitamos el public de la clase, entonces ahora el perro solo puede usarse en el paquete jardin

    /*public String nombre; //Atributo de la clase perro
    String raza; //Atributo de la clase perro en Default, solo se puede acceder si esta en el mismo paquete com.alopez.app;
    protected int edad; //Protected, se puede acceder a ella dentro del mismo paquete, o tambien, si es una clase hija de esta clase (Perro)
    private String color; //Solo se puede acceder a ellos en la misma clase*/

    protected String nombre;
    protected String raza;

    String jugar(Persona persona){ //Metodo en default
        return persona.lanzarPelota();
    }

}