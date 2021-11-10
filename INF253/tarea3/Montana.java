package INF253.tarea3;

import java.util.Random;

public class Montana extends Tierra{
    
    public boolean accion(Jugador jugador){
        if (jugador.GetEnergia() <= 0){
            System.out.println("¡No tienes energía suficiente para llegar a las montañas!");
            return false;
        }
        if (jugador.GetEnergia() > 0){
            int cobro = jugador.GetEnergia() - 3;
            if (cobro < 0){
                jugador.SetVida(jugador.GetVida() + cobro);
            }else{
                jugador.SetEnergia(jugador.GetEnergia() - cobro);
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

    public Montana(Monstruo mons, float prob){
        SetPosi(prob);
        SetMonstruo(mons);
        SetNPC(null);
    }
    public Montana(Jefe_Final mons, float prob){
        SetPosi(prob);
        SetJefe(mons);
        SetNPC(null);
    }
    public Montana(Monstruo mons, NPC we, float prob ){
        SetPosi(prob);
        SetMonstruo(mons);
        SetNPC(we);
    }
    public Montana(Jefe_Final mons, NPC we, float prob ){
        SetPosi(prob);
        SetJefe(mons);
        SetNPC(we);
    }
}
