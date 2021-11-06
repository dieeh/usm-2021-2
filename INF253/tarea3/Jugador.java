package INF253.tarea3;

public abstract class Jugador {
    String nombre;
    int vida;
    int xp;
    int fuerza;
    int inteligencia;
    int energia;
    int mana;
    List<?> lista_misiones = new List<Mision>();
    public abstract int ataque();
    public abstract int hechizo();
    public abstract void subir_experiencia();
}
