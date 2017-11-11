package Pocker;

public class Carta {
    private final Palo palo ;
    private  String nombreCarta;


    public Carta ( Palo palo, String nombreCarta)
    {
        this.palo = palo;
        this.nombreCarta = nombreCarta ;

    }



    public Palo getPalo()
    {
        return palo;
    }

    public String getNombreCarta() {
        return nombreCarta;
    }

    @Override
    public String toString() {
        return getNombreCarta()+" "+getPalo();
    }
}
