package INF253.tarea3;

public class Bosque extends Tierra {
    public boolean accion(Jugador jugador){
        if (jugador.GetMana() < 3) {
            System.out.println("¡No tienes maná suficiente para llegar al bosque!");
            return false;
        }
        if (jugador.GetMana() > 3) {
            int cobro = jugador.GetMana() - 3;
            if (cobro < 0){
                jugador.SetVida(jugador.GetVida() + cobro);
            }else{
                jugador.SetMana(jugador.GetMana() - cobro);
            }
            if (GetNPC() != null) {
                GetNPC().interaccion(jugador);
            }
            SetPosi((float) ((Math.random() * (1.0 - 0.0)) + 0.0));
            if(GetPosi() > 0.5){
                if (GetMonstruo() != null) {
                    System.out.println("¡Ha aparecido un monstruo!");
                    GetMonstruo().combate(jugador);
                } else if (GetJefe() != null){
                    System.out.println("¡Te has encontrado al Jefe Final!");
                    GetJefe().combate(jugador);
                }
            }
        }
        return true;
    }

    public Bosque(Monstruo mons){
        SetMonstruo(mons);
        SetNPC(null);
    }
    public Bosque(Jefe_Final mons){
        SetJefe(mons);
        SetNPC(null);
    }
    public Bosque(Monstruo mons, NPC we ){
        SetMonstruo(mons);
        SetNPC(we);
    }
    public Bosque(Jefe_Final mons, NPC we ){
        SetJefe(mons);
        SetNPC(we);
    }
}
