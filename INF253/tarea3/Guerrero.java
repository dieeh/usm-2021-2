package INF253.tarea3;

public class Guerrero extends Jugador {
    private int level;
    private int vida_max;
    private int energia_max;
    private int mana_max;

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
            vida_max += 3*level;
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 2)&&(xp>=25)){
            level +=1;
            vida_max += 3*level;
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 3)&&(xp>=50)){
            level +=1;
            vida_max += 3*level;
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 4)&&(xp>=100)){
            level +=1;
            vida_max += 3*level;
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 5)&&(xp>=200)){
            level +=1;
            vida_max += 3*level;
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 6)&&(xp>=350)){
            level +=1;
            vida_max += 3*level;
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 7)&&(xp>=600)){
            level +=1;
            vida_max += 3*level;
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 8)&&(xp>=900)){
            level +=1;
            vida_max += 3*level;
            SetFuerza(GetFuerza() + 5*level);
            SetInteligencia(GetInteligencia() + 1);
            energia_max += 2*level;
            mana_max +=1;
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
        this.vida_max = 20;
        this.energia_max = 10;
        this.mana_max = 2;
    }
}
