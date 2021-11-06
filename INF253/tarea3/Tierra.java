package INF253.tarea3;

public abstract class Tierra {
    float probabilidad_enemigo;
    Monstruo monstruo;
    Jefe_Final jefe_final;
    NPC npc;
    public abstract boolean accion(Jugador jugador);
}
