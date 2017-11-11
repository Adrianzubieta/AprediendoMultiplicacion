package Pocker;

import java.util.Random;

public class Baraja {
    private Carta carta;
    private final int num_Max_Cartas;
    private final int num_Palo;
    private Carta [] baraja ;

    private Palo palo;

    public Baraja()
    {
        num_Palo = 4;
        num_Max_Cartas = 52;

        baraja = new Carta[num_Max_Cartas];


    }//fin de construcctor


    public void iniciarBaraja()
    {
        String [] NombreCarta= {"UNO","DOS","TRES","CUATRO","CINCO","SEIS",
                "SIETE","OCHO","NUEVE","DIES","ONCE","DOCE","TRECE"};

        int numMaxDeCartasPorPalo = 13;
        int numCarta = 0;

        for(int i = 0;i<numMaxDeCartasPorPalo;i++)
        {
            this.baraja[numCarta]= new Carta (Palo.CORAZONES,NombreCarta[i]);
            numCarta++;
        }
        for(int i = 0;i<numMaxDeCartasPorPalo;i++)
        {
            baraja[numCarta]= new Carta (Palo.DIAMANTES,NombreCarta[i]);
            numCarta++;
        }
        for(int i = 0;i<numMaxDeCartasPorPalo;i++)
        {
            baraja[numCarta]= new Carta (Palo.TREBOL,NombreCarta[i]);
            numCarta++;
        }
        for(int i = 0;i<numMaxDeCartasPorPalo;i++)
        {
            baraja[numCarta]= new Carta (Palo.ESPADAS,NombreCarta[i]);
            numCarta++;
        }
    }//fin de iniciarBaraja


    public void mostrarMaso ()
    {
        for (int i = 0; i<num_Max_Cartas;i++)
        {
            System.out.println(baraja[i].toString());
        }

    }//fin de mostrarMaso



    private boolean estaEnElArays(int[] arrays,int numero)
    {
        for (int i = 0 ; i < arrays.length; i++)
        {
            if(arrays[i] == numero)
            {
                return true;
            }
        }

        return false;
    }//fin de estaEnElArrays


    public void barajearMaso()
    {
        Random numAleat = new Random();
        Carta [] barajaBarajeada;

        barajaBarajeada = new Carta[num_Max_Cartas];
        int [] numhechos = new int[num_Max_Cartas];


        int num = numAleat.nextInt(num_Max_Cartas);



        for (int i = 0;i<num_Max_Cartas;i++)
        {

            while ( !(estaEnElArays(numhechos,num)) )
            {

                num = numAleat.nextInt(num_Max_Cartas);

                System.err.println(num);

            }
            System.err.println(num);

            barajaBarajeada[i]= baraja[num];

            numhechos[i]= num;

        }

        for (int i = 0; i <baraja.length;i++)
        {
            this.baraja[i] = barajaBarajeada[i];

        }


    }//fin de barajear maso


}