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
import java.util.Random;

import javax.swing.JOptionPane;

public class Desarrollo {

    private Random numAleatorio = new Random();

    public int numAleatorio(int desde, int hasta) {
        int num1 = desde + numAleatorio.nextInt(hasta);
        return num1;
    }

    public int porcentaje(int respCor, int respInc) {
        int porcentaje;
        int totalResp;

        totalResp = respCor + respInc;
        porcentaje = (respCor * 100) / totalResp;

        return porcentaje;
    }// fin de Porcentaje

    public void respuestas(boolean respuesta) {

        int numRespuesta;
        String mensaje;
        
        String[] resp = {" Muy bien!", "Excelente!", "Buen Trabajo!", 
            "Sigue asi", " No, Por favor intentelo de nuevo",
            "Incorrecto, Intenta una vez mas", "No te rindas! Vuelve a intentar.",
            "No, sigue intentando"};

        if (respuesta) {
            numRespuesta = numAleatorio.nextInt(3);
            mensaje = resp[numRespuesta];
        } else {
            numRespuesta = 4 + numAleatorio.nextInt(3);
            mensaje = resp[numRespuesta];
        }

        mensaje(mensaje);

    }

    public void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static String mensajeEntrada(String mensaje) {
        String entrada = JOptionPane.showInputDialog(null, mensaje);
        return entrada;
    }

}
