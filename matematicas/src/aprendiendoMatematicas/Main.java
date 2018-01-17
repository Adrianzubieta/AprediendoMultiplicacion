/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendiendoMatematicas;

/**
 *
 * @author Adrian Zubieta
 */
public class Main {

    public static void main(String[] args) {

        Multiplicacion multi = new Multiplicacion();

        String repeticion = "si";

        while (repeticion.equalsIgnoreCase("si")) {

            multi.bienvenida();

            multi.seleccion();

            repeticion = Desarrollo.mensajeEntrada(
                    "Gracias por Jugar =) \n" + "<SI> Para volver a empezar \n" 
                            + "<NO> para terminar. ");

        } // fin de while

    }// fin de Main
}// fin de class

