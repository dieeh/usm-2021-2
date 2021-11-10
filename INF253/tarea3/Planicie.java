package INF253.tarea3;

public class Planicie extends Tierra {
    public boolean accion(Jugador jugador){
        if (GetNPC() != null) {
            GetNPC().interaccion(jugador);
        }
        SetPosi((float) ((Math.random() * (1.0 - 0.0)) + 0.0));
        if(GetPosi() > 0.5){
            if (GetMonstruo() != null) {
                //System.out.println("¡Ha aparecido un monstruo!");
                GetMonstruo().combate(jugador);
            } else if (GetJefe() != null){
                //System.out.println("¡Te has encontrado al Jefe Final!");
                GetJefe().combate(jugador);
            }
        }
        return true;
    }

    public Planicie(Monstruo mons){
        SetMonstruo(mons);
        SetNPC(null);
    }
    public Planicie(Jefe_Final mons){
        SetJefe(mons);
        SetNPC(null);
    }
    public Planicie(Monstruo mons, NPC we ){
        SetMonstruo(mons);
        SetNPC(we);
    }
    public Planicie(Jefe_Final mons, NPC we ){
        SetJefe(mons);
        SetNPC(we);
    }
}
