package INF253.tarea3;

public class Montana extends Tierra{
    Monstruo monstruo = new Monstruo();
    public boolean accion(Jugador jugador){
        if (jugador.GetEnergia() == 0){
            return false;
        }
        if (jugador.GetEnergia() > 3){
            int cobro = jugador.GetEnergia() - 3;
            if (cobro < 0){
                jugador.SetVida(jugador.GetVida() + cobro);
            }else{
                jugador.SetEnergia(jugador.GetEnergia() - cobro);
            }
        }
        return true;
    }
}
