package INF253.tarea3;

import java.util.Random;

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
            int temp = (int) GetPosi()*100;
            boolean probabilidad = new Random().nextInt(100) < temp ;
            if(probabilidad == true){
                if (GetMonstruo() != null) {
                    //System.out.println("¡Ha aparecido un monstruo!");
                    GetMonstruo().combate(jugador);
                } else if (GetJefe() != null){
                    //System.out.println("¡Te has encontrado al Jefe Final!");
                    GetJefe().combate(jugador);
                }
            }
        }
        return true;
    }

    public Bosque(Monstruo mons, float prob){
        SetPosi(prob);
        SetMonstruo(mons);
        SetNPC(null);
    }
    public Bosque(Jefe_Final mons, float prob){
        SetPosi(prob);
        SetJefe(mons);
        SetNPC(null);
    }
    public Bosque(Monstruo mons, NPC we, float prob ){
        SetPosi(prob);
        SetMonstruo(mons);
        SetNPC(we);
    }
    public Bosque(Jefe_Final mons, NPC we, float prob ){
        SetPosi(prob);
        SetJefe(mons);
        SetNPC(we);
    }
}
