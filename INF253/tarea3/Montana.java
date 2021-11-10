package INF253.tarea3;

public class Montana extends Tierra{
    
    public boolean accion(Jugador jugador){
        if (jugador.GetEnergia() < 3){
            System.out.println("¡No tienes energía suficiente para llegar a las montañas!");
            return false;
        }
        if (jugador.GetEnergia() > 3){
            int cobro = jugador.GetEnergia() - 3;
            if (cobro < 0){
                jugador.SetVida(jugador.GetVida() + cobro);
            }else{
                jugador.SetEnergia(jugador.GetEnergia() - cobro);
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

    public Montana(Monstruo mons){
        SetMonstruo(mons);
        SetNPC(null);
    }
    public Montana(Jefe_Final mons){
        SetJefe(mons);
        SetNPC(null);
    }
    public Montana(Monstruo mons, NPC we ){
        SetMonstruo(mons);
        SetNPC(we);
    }
    public Montana(Jefe_Final mons, NPC we ){
        SetJefe(mons);
        SetNPC(we);
    }
}
