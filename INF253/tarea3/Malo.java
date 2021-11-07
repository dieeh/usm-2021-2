package INF253.tarea3;

public class Malo extends NPC {
    private int cantidad_energia;
    private int cantidad_mana;
    public void interaccion(Jugador jugador){
        System.out.println(GetNombre() +": ¡¡SOY MALO, TE VOY A DISMINUIR TU ENERGÍA Y MANA EN "+Integer.toString(cantidad_energia)+" Y "+Integer.toString(cantidad_mana)+"!!");
        int r = (int) ((Math.random() * (10 - 1)) + 1);
        if (r <= 6 ) {
            jugador.SetEnergia(jugador.GetEnergia() - cantidad_energia);
            if (jugador.GetEnergia() < 0) {
                jugador.SetEnergia(0);
            }
        }
        int p = (int) ((Math.random() * (10 - 1)) + 1);
        if (p <= 6 ) {
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
