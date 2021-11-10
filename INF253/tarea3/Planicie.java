package INF253.tarea3;

import java.util.Random;

public class Planicie extends Tierra {
    public boolean accion(Jugador jugador){
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
        return true;
    }

    public Planicie(Monstruo mons, float prob){
        SetPosi(prob);
        SetMonstruo(mons);
        SetNPC(null);
    }
    public Planicie(Jefe_Final mons, float prob){
        SetPosi(prob);
        SetJefe(mons);
        SetNPC(null);
    }
    public Planicie(Monstruo mons, NPC we, float prob){
        SetPosi(prob);
        SetMonstruo(mons);
        SetNPC(we);
    }
    public Planicie(Jefe_Final mons, NPC we, float prob ){
        SetPosi(prob);
        SetJefe(mons);
        SetNPC(we);
    }
}
