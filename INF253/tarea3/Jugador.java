package INF253.tarea3;

//import java.util.ArrayList;
import java.util.List;

public abstract class Jugador {
    private String nombre;
    private int vida;
    private int xp;
    private int fuerza;
    private int inteligencia;
    private int energia;
    private int mana;
    private int vida_max;
    private int energia_max;
    private int mana_max;
    private List<Mision> lista_misiones;
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
    public int GetVidaMax(){
        return vida_max;
    }
    public void SetVidaMax(int x){
        vida_max = x;
    }
    public int GetEnergiaMax(){
        return energia_max;
    }
    public void SetEnergiaMax(int x){
        energia_max = x;
    }
    public int GetManaMax(){
        return mana_max;
    }
    public void SetManaMax(int x){
        mana_max = x;
    }
    public List<Mision> GetMisiones(){
        return lista_misiones;
    }
    public void AddMisiones(Mision mision){
        lista_misiones.add(mision);
    }
}
