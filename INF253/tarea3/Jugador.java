package INF253.tarea3;

import java.util.ArrayList;
import java.util.List;

public abstract class Jugador {
    private String nombre;
    private int vida;
    private int xp;
    private int fuerza;
    private int inteligencia;
    private int energia;
    private int mana;
    private List<?> lista_misiones = new ArrayList<Mision>();
    public abstract int ataque();
    public abstract int hechizo();
    public abstract void subir_experiencia(int xp);

    public String GetNombre(){
        return nombre;
    }
    public void SetNombre(String x){
        nombre = x;
    }

    public int GetVida(){
        return vida;
    }
    public void SetVida(int x){
        vida = x;
    }

    public int GetXP(){
        return xp;
    }
    public void SetXP(int x){
        xp = x;
    }

    public int GetFuerza(){
        return fuerza;
    }
    public void SetFuerza(int x){
        fuerza = x;
    }

    public int GetInteligencia(){
        return inteligencia;
    }
    public void SetInteligencia(int x){
        inteligencia = x;
    }
    public int GetEnergia(){
        return energia;
    }
    public void SetEnergia(int x){
        energia = x;
    }
    public int GetMana(){
        return mana;
    }
    public void SetMana(int x){
        mana = x;
    }
}
