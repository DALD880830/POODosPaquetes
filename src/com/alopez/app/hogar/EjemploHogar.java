package com.alopez.app.hogar;

import com.alopez.app.jardin.Perro;

public class EjemploHogar {

    public static void main(String[] args) {

        Persona persona = new Persona();
        Perro perrito = new Perro();
        //Podemos crear el objeto perro en el paquete hogar porque la clase perro es public, sin embargo como el metodo
        //jugar esta en default, no puede utilizarse en el paquete de hogar, solo puede usarse en el paquete jardin

        Gato g = new Gato(); //Creamos el objeto gato de la clase gato del subpaquete hogar

        g.nombre = "Grafito";//Usando la clase gato, asignamos un nombre
        System.out.println("g.nombre = " + g.nombre);

        String saludo = Persona.saludar(); //No es necesario importar de Persona, porque está dentro del mismo paquete
        //Sin embargo, si solo colocamos String saludo = saludar(); si debemos importar el metodo estatico

    }

}