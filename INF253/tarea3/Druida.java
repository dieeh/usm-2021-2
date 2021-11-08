package INF253.tarea3;

import java.util.ArrayList;
import java.util.List;
//import java.util.Set;

public class Druida extends Jugador {
    private int level = 1;
    private List<Mision> lista_misiones = new ArrayList<Mision>();

    public int ataque(){
        if (GetEnergia() == 0) {
            return 0;
        }
        int v_fyi = (GetFuerza() + GetInteligencia()) / 3;
        int v_em = Math.max(GetEnergia()/3, GetMana()/2);
        int retorno = v_fyi * v_em;
        SetEnergia(GetEnergia() - 3);
        return retorno;
    }
    public int hechizo(){
        if (GetMana() == 0) {
            return 0;
        }
        int v_fyi = (GetFuerza() + GetInteligencia()) / 3;
        int v_em = Math.max(GetEnergia()/2, GetMana()/3);
        int retorno = v_fyi * v_em;
        SetMana(GetMana() - 3);;
        return retorno;
    }
    public void subir_experiencia(int xp){
        if ((level == 1)&&((25>xp)&&(xp>=10)) ) {
            level +=1;
            SetVidaMax(GetVidaMax() + level);
            SetFuerza(GetFuerza() + level);
            SetInteligencia(GetInteligencia() + level);
            SetEnergiaMax(GetEnergiaMax() + level);
            SetManaMax(GetManaMax() + level);
            System.out.println("¡Haz subido al nivel 2!");
        } else if ((level == 2)&&((50>xp)&&(xp>=25))){
            level +=1;
            SetVidaMax(GetVidaMax() + level);
            SetFuerza(GetFuerza() + level);
            SetInteligencia(GetInteligencia() + level);
            SetEnergiaMax(GetEnergiaMax() + level);
            SetManaMax(GetManaMax() + level);
            System.out.println("¡Haz subido al nivel 3!");
        } else if ((level == 3)&&((100>xp)&&(xp>=50))){
            level +=1;
            SetVidaMax(GetVidaMax() + level);
            SetFuerza(GetFuerza() + level);
            SetInteligencia(GetInteligencia() + level);
            SetEnergiaMax(GetEnergiaMax() + level);
            SetManaMax(GetManaMax() + level);
            System.out.println("¡Haz subido al nivel 4!");
        } else if ((level == 4)&&((200>xp)&&(xp>=100))){
            level +=1;
            SetVidaMax(GetVidaMax() + level);
            SetFuerza(GetFuerza() + level);
            SetInteligencia(GetInteligencia() + level);
            SetEnergiaMax(GetEnergiaMax() + level);
            SetManaMax(GetManaMax() + level);
            System.out.println("¡Haz subido al nivel 5!");
        } else if ((level == 5)&&((350>xp)&&(xp>=200))){
            level +=1;
            SetVidaMax(GetVidaMax() + level);
            SetFuerza(GetFuerza() + level);
            SetInteligencia(GetInteligencia() + level);
            SetEnergiaMax(GetEnergiaMax() + level);
            SetManaMax(GetManaMax() + level);
            System.out.println("¡Haz subido al nivel 6!");
        } else if ((level == 6)&&((600>xp)&&(xp>=350))){
            level +=1;
            SetVidaMax(GetVidaMax() + level);
            SetFuerza(GetFuerza() + level);
            SetInteligencia(GetInteligencia() + level);
            SetEnergiaMax(GetEnergiaMax() + level);
            SetManaMax(GetManaMax() + level);
            System.out.println("¡Haz subido al nivel 7!");
        } else if ((level == 7)&&((900>xp)&&(xp>=600))){
            level +=1;
            SetVidaMax(GetVidaMax() + level);
            SetFuerza(GetFuerza() + level);
            SetInteligencia(GetInteligencia() + level);
            SetEnergiaMax(GetEnergiaMax() + level);
            SetManaMax(GetManaMax() + level);
            System.out.println("¡Haz subido al nivel 8!");
        }
    }

    public Druida(String x){
        SetNombre(x);
        SetVida(15);
        SetXP(0);
        this.level = 1;
        SetFuerza(5);
        SetInteligencia(5);
        SetEnergia(5);
        SetMana(5);
        SetVidaMax(5);
        SetEnergiaMax(5);
        SetManaMax(5);
    }
}
