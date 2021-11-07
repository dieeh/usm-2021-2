package INF253.tarea3;

public class Neutro extends NPC {
    private char requisito; 
    private int valor;
    private int recompensa;
    private int ya_dio_mision;
    public void interaccion(Jugador jugador){
        
    }

    public Neutro(String v, char x, int y, int z, int w){
        SetNombre(v);
        this.requisito = x;
        this.valor = y;
        this.recompensa = z;
        this.ya_dio_mision = w;
    }
}
