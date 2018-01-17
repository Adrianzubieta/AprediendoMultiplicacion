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
public class Multiplicacion extends Desarrollo {

    public void bienvenida() {
        mensaje("Bienvenido a  Multiplicacion");

        mensaje("La multiplicacion es solo sumar numero! \n   Muy facil no?");

        mensaje("Ejemplo: \n \"2+2+2+2\" es lo mismo que 2 X 4 ");

    }// fin de metodo bienvenida

    public int multiplicandoNum(int num1, int num2) {
        int numUsuario;
        try {
            numUsuario = Integer.parseInt(mensajeEntrada("Cuanto es " + num1 + " X " + num2 + " ?"));
        } catch (NumberFormatException e) {
            numUsuario = 0;
        }

        return numUsuario;
    }

    public int niveles(int desde, int hasta) {

        int respCorrectas = 0;
        int respIncorrectas = 0;
        int porcentaje;
        int numDePreguntas = 10;

        for (int i = 1; i <= numDePreguntas; i++) {

            int num1 = numAleatorio(desde, hasta);
            int num2 = numAleatorio(desde, hasta);

            int numUsuario = multiplicandoNum(num1, num2);

            if (numUsuario == num1 * num2) {
                respCorrectas++;
            } else {
                respIncorrectas++;
            }

            while (numUsuario != num1 * num2) {
                respuestas(false);
                try {
                    numUsuario = Integer.parseInt(mensajeEntrada("Cuanto es " + num1 + " X " + num2 + " ?"));
                } catch (NumberFormatException e) {
                    numUsuario = 0;
                } // fin de try-catch

            } // fin de while

            respuestas(true);

        } // fin de for

        porcentaje = porcentaje(respCorrectas, respIncorrectas);

        mensaje("El porcentaje de sus respuestas correctas es: "
                + porcentaje + "%");

        return porcentaje;
    }// fin de niveles

    public void mensajeNivel(int numNivel) {
        mensaje(" Empezemos con el " + numNivel + "° nivel\n"
                + "(multiplicaciones de " + numNivel + " digito)");
    }

    public void seleccion() {

        int porc_nivel_1;
        int porc_nivel_2;

        String seleccion = mensajeEntrada("Porfavor eliga el Modo de Juego:\n"
                + " Opcion 1 : Multiplicaciones de 1 Digito.\n"
                + " Opcion 2 : Multiplicaciones de 2 Digito.\n"
                + " Opcion 3 : Multiplicaciones de 3 Digito.\n"
                + " Opcion 4 : Pasar por cada nivel.\n");

        switch (seleccion) {

            case "1":
                niveles(2, 8);
                break;

            case "2":
                niveles(10, 98);
                break;
            case "3":
                niveles(100, 998);
                break;
            case "4":
                mensajeNivel(1);

                porc_nivel_1 = niveles(2, 9);

                if (porc_nivel_1 >= 75) {
                    mensaje("Felicidades, estas listo para pasar al siguiente nivel! ");
                    mensajeNivel(2);
                    porc_nivel_2 = niveles(11, 99);
                    if (porc_nivel_2 >= 75) {
                        mensaje("Felicidades, estas listo para pasar al siguiente nivel! ");
                        mensajeNivel(3);
                        niveles(101, 999);
                    }

                } else {
                    mensaje("No llego a 75% de respuestas correctas sin equivocarse \n"
                            + "Porfavor pida ayuda adicional a un intructor! ");
                }
                break;
            default:
                mensaje("Ingreso una opcion incorrecta!");

        }// fin de switch
    }// fin de seleccion

}// fin de class

