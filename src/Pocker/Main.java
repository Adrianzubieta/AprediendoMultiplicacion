package Pocker;

public class Main {
    public static void main(String[] args) {

        Baraja baraja = new Baraja();
        baraja.iniciarBaraja();
        baraja.mostrarMaso();
        System.out.println("\n\n\n");
        baraja.barajearMaso();
        baraja.mostrarMaso();
    }
}