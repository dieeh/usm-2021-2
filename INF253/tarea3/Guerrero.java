package INF253.tarea3;

public class Guerrero extends Jugador {
    private int level;
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
        if ((level == 1)&&(xp>=10) ) {
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 2!"); //ARREGLAR ESTA WEA
        } else if ((level == 2)&&(xp>=25)){
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 3!");
        } else if ((level == 3)&&(xp>=50)){
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 4!");
        } else if ((level == 4)&&(xp>=100)){
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 5!");
        } else if ((level == 5)&&(xp>=200)){
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 6!");
        } else if ((level == 6)&&(xp>=350)){
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 7!");
        } else if ((level == 7)&&(xp>=600)){
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 8!");
        } else if ((level == 8)&&(xp>=900)){
            level +=1;
            SetVidaMax(GetVidaMax() + 3*level);
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            SetEnergiaMax(GetEnergiaMax() + 2*level);
            SetManaMax(GetManaMax()+ 1);
            System.out.println("¡Haz subido al nivel 9!");
        }
    }

    public Guerrero(String x){
        SetNombre(x);
        SetFuerza(20);
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
