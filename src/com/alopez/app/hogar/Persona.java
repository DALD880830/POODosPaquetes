package com.alopez.app.hogar;

public class Persona {

    //public String nombre; //Atributo de la clase persona
    //String apellido; //De esta forma, se encuentra en Default, no se puede acceder a este atributo fuera del paquete com.alopez.app.hogar;
    private String nombre;
    private String apellido;

    private ColorPelo colorPelo; //Creamos el atributo que viene del enum


    //Creamos constantes
    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";


    //Generamos los getter and setter de ambos atributos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String lanzarPelota(){ //Metodo public,
        return "lanza la pelota al perro";
    }


    public static String saludar(){
        return "hola, que tal :)";
    }


    //Getter and Setter del atributo privado ColorPelo
    public ColorPelo getColorPelo() {
        return colorPelo;
    }
    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }
}