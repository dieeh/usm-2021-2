package INF253.tarea3;

import java.util.ArrayList;
import java.util.List;

public class Guerrero extends Jugador {
    private int level;
    private List<Mision> lista_misiones = new ArrayList<Mision>();
    public int ataque(){
        if (GetEnergia() == 0) {
            return 0;
        }
        int retorno = 2*GetFuerza() + GetEnergia();
        SetEnergia(GetEnergia() - 5);
        return retorno;
    }
    public int hechizo(){
        if (GetMana() == 0) {
            return 0;
        }
        int v_fuer = GetFuerza()/4;
        int retorno2 = (GetInteligencia() * v_fuer) + GetMana();
        SetMana(GetMana() - 3);
        return retorno2;
    }
    public void subir_experiencia(int xp){
        if ((level == 1)&&((25>xp)&&(xp>=10)) ) {
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 2!");
            SetVida(GetVidaMax());
            SetEnergia(GetEnergiaMax());
            SetMana(GetManaMax());
        } else if ((level == 2)&&((50>xp)&&(xp>=25))){
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 3!");
            SetVida(GetVidaMax());
            SetEnergia(GetEnergiaMax());
            SetMana(GetManaMax());
        } else if ((level == 3)&&((100>xp)&&(xp>=50))){
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 4!");
            SetVida(GetVidaMax());
            SetEnergia(GetEnergiaMax());
            SetMana(GetManaMax());
        } else if ((level == 4)&&((200>xp)&&(xp>=100))){
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 5!");
            SetVida(GetVidaMax());
            SetEnergia(GetEnergiaMax());
            SetMana(GetManaMax());
        } else if ((level == 5)&&((350>xp)&&(xp>=200))){
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 6!");
            SetVida(GetVidaMax());
            SetEnergia(GetEnergiaMax());
            SetMana(GetManaMax());
        } else if ((level == 6)&&((600>xp)&&(xp>=350))){
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 7!");
            SetVida(GetVidaMax());
            SetEnergia(GetEnergiaMax());
            SetMana(GetManaMax());
        } else if ((level == 7)&&((900>xp)&&(xp>=600))){
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 8!");
            SetVida(GetVidaMax());
            SetEnergia(GetEnergiaMax());
            SetMana(GetManaMax());
        }
    }

    public Guerrero(String x){
        SetNombre(x);
        SetVida(20);
        SetXP(0);
        this.level = 1;
        SetFuerza(9);
        SetInteligencia(1);
        SetEnergia(10);
        SetMana(2);
        SetVidaMax(20);
        SetEnergiaMax(10);
        SetManaMax(2);
    }

}
