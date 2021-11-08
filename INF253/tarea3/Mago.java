package INF253.tarea3;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Jugador {
    private int level = 1;
    private List<Mision> lista_misiones = new ArrayList<Mision>();
    public int ataque(){
        if (GetEnergia() == 0) {
            return 0;
        }
        int v_int = GetInteligencia()/4;
        int retorno = (GetFuerza() * v_int) + GetEnergia();
        SetEnergia(GetEnergia() - 3);
        return retorno;
    }
    public int hechizo(){
        if (GetMana() == 0) {
            return 0;
        }
        int v_fuer = GetFuerza()/4;
        int retorno2 = (GetInteligencia() * v_fuer) + GetMana();
        SetMana(GetMana() - 5);
        return retorno2;
    }
    public void subir_experiencia(int xp){
        if ((level == 1)&&((25>xp)&&(xp>=10)) ) {
            level +=1;
            SetVidaMax(GetVidaMax() + 2*level);
            SetFuerza(GetFuerza() + 1);
            SetInteligencia(GetInteligencia() + 3*level);
            SetEnergiaMax(GetEnergiaMax() + 1);
            SetManaMax(GetManaMax() + 3*level);
            System.out.println("¡Haz subido al nivel 2!");
        } else if ((level == 2)&&((50>xp)&&(xp>=25))){
            level +=1;
            SetVidaMax(GetVidaMax() + 2*level);
            SetFuerza(GetFuerza() + 1);
            SetInteligencia(GetInteligencia() + 3*level);
            SetEnergiaMax(GetEnergiaMax() + 1);
            SetManaMax(GetManaMax() + 3*level);
            System.out.println("¡Haz subido al nivel 3!");
        } else if ((level == 3)&&((100>xp)&&(xp>=50))){
            level +=1;
            SetVidaMax(GetVidaMax() + 2*level);
            SetFuerza(GetFuerza() + 1);
            SetInteligencia(GetInteligencia() + 3*level);
            SetEnergiaMax(GetEnergiaMax() + 1);
            SetManaMax(GetManaMax() + 3*level);
            System.out.println("¡Haz subido al nivel 4!");
        } else if ((level == 4)&&((200>xp)&&(xp>=100))){
            level +=1;
            SetVidaMax(GetVidaMax() + 2*level);
            SetFuerza(GetFuerza() + 1);
            SetInteligencia(GetInteligencia() + 3*level);
            SetEnergiaMax(GetEnergiaMax() + 1);
            SetManaMax(GetManaMax() + 3*level);
            System.out.println("¡Haz subido al nivel 5!");
        } else if ((level == 5)&&((350>xp)&&(xp>=200))){
            level +=1;
            SetVidaMax(GetVidaMax() + 2*level);
            SetFuerza(GetFuerza() + 1);
            SetInteligencia(GetInteligencia() + 3*level);
            SetEnergiaMax(GetEnergiaMax() + 1);
            SetManaMax(GetManaMax() + 3*level);
            System.out.println("¡Haz subido al nivel 6!");
        } else if ((level == 6)&&((600>xp)&&(xp>=350))){
            level +=1;
            SetVidaMax(GetVidaMax() + 2*level);
            SetFuerza(GetFuerza() + 1);
            SetInteligencia(GetInteligencia() + 3*level);
            SetEnergiaMax(GetEnergiaMax() + 1);
            SetManaMax(GetManaMax() + 3*level);
            System.out.println("¡Haz subido al nivel 7!");
        } else if ((level == 7)&&((900>xp)&&(xp>=600))){
            level +=1;
            SetVidaMax(GetVidaMax() + 2*level);
            SetFuerza(GetFuerza() + 1);
            SetInteligencia(GetInteligencia() + 3*level);
            SetEnergiaMax(GetEnergiaMax() + 1);
            SetManaMax(GetManaMax() + 3*level);
            System.out.println("¡Haz subido al nivel 8!");
        }
    }

    public Mago(String x){
        SetNombre(x);
        SetVida(10);
        SetXP(0);
        SetFuerza(3);
        SetInteligencia(10);
        SetEnergia(6);
        SetMana(15);
        SetVidaMax(10);
        SetEnergiaMax(6);
        SetManaMax(15);

    }
}
