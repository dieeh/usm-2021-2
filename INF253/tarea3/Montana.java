package INF253.tarea3;

public class Montana extends Tierra{
    public boolean accion(Jugador jugador){
        if (jugador.energia == 0){
            return false;
        }
        if (jugador.energia > 3){
            int cobro = jugador.energia - 3;
            if (cobro < 0){
                jugador.vida += cobro;
            }
        }
        return true;
    }
}
