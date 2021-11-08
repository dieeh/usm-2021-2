package INF253.tarea3;

public abstract class Tierra {
    private float probabilidad_enemigo;
    private Monstruo monstruo;
    private Jefe_Final jefe_final;
    private NPC npc;
    public abstract boolean accion(Jugador jugador);

    public void SetNPC(NPC temp){
        npc = temp;
    }
    public NPC GetNPC(){
        return npc;
    }

    public void SetPosi(float prob){
        probabilidad_enemigo = prob;
    }
    public float GetPosi(){
        return probabilidad_enemigo;
    }

    public void SetMonstruo(Monstruo mons){
        monstruo = mons;
    }
    public Monstruo GetMonstruo(){
        return monstruo;
    }
    public void SetJefe(Jefe_Final jefe){
        jefe_final = jefe;
    }
    public Jefe_Final GetJefe(){
        return jefe_final;
    }
}
