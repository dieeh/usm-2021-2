package INF253.tarea3;

public abstract class NPC {
    private String nombre;
    public abstract void interaccion(Jugador jugador);

    public String GetNombre(){
        return nombre;
    }
    public void SetNombre(String x){
        nombre = x;
    }
}
