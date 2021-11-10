package INF253.tarea3;

import java.util.Random;

public class Malo extends NPC {
    private int cantidad_energia;
    private int cantidad_mana;
    public void interaccion(Jugador jugador){
        System.out.println("<"+GetNombre() +">: ¡¡SOY MALO, DISMINUIRÉ TU ENERGÍA Y MANA EN "+Integer.toString(cantidad_energia)+" Y "+Integer.toString(cantidad_mana)+"!!");
        boolean probabilidad1 = new Random().nextInt(100) <= 60;
        if (probabilidad1 == true ) {
            jugador.SetEnergia(jugador.GetEnergia() - cantidad_energia);
            if (jugador.GetEnergia() < 0) {
                jugador.SetEnergia(0);
            }
        }
        boolean probabilidad2 = new Random().nextInt(100) <= 60;
        if (probabilidad2 == true) {
            jugador.SetMana(jugador.GetMana() - cantidad_mana);
            if (jugador.GetMana() < 0) {
                jugador.SetMana(0);
            }
        }
    }

    public Malo(String x, int y, int z){
        SetNombre(x);
        this.cantidad_energia = y;
        this.cantidad_mana = z;
    }
}
