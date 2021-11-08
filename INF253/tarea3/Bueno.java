package INF253.tarea3;

public class Bueno extends NPC {
    private String atributo;
    private int cantidad;
    public void interaccion(Jugador jugador){
        System.out.println(GetNombre() +": Creo que necesitas un poco de ayuda, ¡te subiré "+Integer.toString(cantidad)+" puntos a tu "+atributo+"!");
        if (atributo == "vida") {
            jugador.SetVida(jugador.GetVida() + cantidad);
        } else if (atributo == "xp"){
            jugador.SetXP(jugador.GetXP() + cantidad);
            jugador.subir_experiencia(jugador.GetXP());
        } else if (atributo == "energia"){
            jugador.SetEnergia(jugador.GetEnergia() + cantidad);
        } else if (atributo == "mana"){
            jugador.SetMana(jugador.GetMana() + cantidad);
        }

        if (jugador.GetVida() > jugador.GetVidaMax()) {
            jugador.SetVida(jugador.GetVidaMax());
        }
        if (jugador.GetEnergia() > jugador.GetEnergiaMax()){
            jugador.SetEnergia(jugador.GetEnergiaMax());
        }
        if (jugador.GetMana() > jugador.GetManaMax()) {
            jugador.SetMana(jugador.GetManaMax());
        }
    }

    public Bueno(String w, String x, int y){
        SetNombre(w);
        this.atributo = x;
        this.cantidad = y;
    }
}
