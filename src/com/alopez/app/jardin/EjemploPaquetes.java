package com.alopez.app.jardin;

//import com.alopez.app.hogar.Gato; //Se pueden utilizar los import de esta forma, uno a uno
//import com.alopez.app.hogar.Persona; //Los import habilitan las clases para que puedan utilizarse
import com.alopez.app.hogar.*; //De esta forma hace el import de todas las clases dentro del paquete
import static com.alopez.app.hogar.Persona.saludar; //Importamos el metodo estatico de la clase Persona
//import static com.alopez.app.hogar.Persona.GENERO_FEMENINO; //De esta forma importamos una constante específica
import static com.alopez.app.hogar.Persona.*; //De esta forma importamos todo lo que está en Persona
import static com.alopez.app.hogar.ColorPelo.*; //Hacemos la importacion de todo de la clase ColorPelo

public class EjemploPaquetes {

    public static void main(String[] args) {

        Persona p = new Persona(); //Creamos el objeto persona de la clase persona del subpaquete hogar

        /*p.nombre = "Alejandro"; //Usando la clase persona, asignamos un nombre
        System.out.println("p.nombre = " + p.nombre);*/ //Al cambiar los atributos de persona a private, es necesario utilizar los getter and setter

        p.setNombre("Alejandro"); //setNombre() para asignar un valor al atributo
        System.out.println("p.nombre = " + p.getNombre()); //getNombre() para obtener el valor del atributo asignado
        //p.setColorPelo(ColorPelo.CAFE); //Esta forma es la que no cuenta con el import static
        p.setColorPelo(CAFE); //Esta forma si cuenta con el import static
        System.out.println(p.getColorPelo());


        /*Gato g = new Gato(); //Creamos el objeto gato de la clase gato del subpaquete hogar
        //Como la clase ya esta en Default, no podemos acceder porque no nos enconrtramos en el mismo paquete
        g.nombre = "Grafito";//Usando la clase gato, asignamos un nombre
        System.out.println("g.nombre = " + g.nombre);*/


        Perro perro = new Perro(); //Este objeto nop necesita de importacion, ya que se encuentra en el mismo contexto com.alopez.app;

        perro.nombre = "Hades";
        perro.raza = "Husky";
        System.out.println("perro.nombre = " + perro.nombre);

        String jugando = perro.jugar(p); //Invocamos jugar de la clase perro y por instancia le pasamos la persona
        System.out.println("jugando = " + jugando);


        //String saludo = Persona.saludar(); //Si no importamos el metodo static con import static, entonces debemos declararlo así
        String saludo = saludar(); //Metodo saludar de la clase Persona, al tener el import static, ya no es necesario definir la clase aquí, solo el metodo
        System.out.println("saludo = " + saludo);

        //String generoMujer = Persona.GENERO_FEMENINO; //Si no importamos el atributo static con import static, entonces debemos declararlo así
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;


    }

}