package INF253.tarea3;

public class Druida extends Jugador {
    int vida = 15;
    int xp = 0;
    int level = 1;
    int fuerza = 5;
    int inteligencia = 5;
    int energia = 5;
    int mana = 5;
    int vida_max = 5;
    int energia_max = 5;
    int mana_max = 5;
    public int ataque(){
        if (energia == 0) {
            return 0;
        }
        int v_fyi = (fuerza + inteligencia) / 3;
        int v_em = Math.max(energia/3, mana/2);
        int retorno = v_fyi * v_em;
        energia = energia - 3;
        return retorno;
    }
    public int hechizo(){
        if (mana == 0) {
            return 0;
        }
        int v_fyi = (fuerza + inteligencia) / 3;
        int v_em = Math.max(energia/2, mana/3);
        int retorno = v_fyi * v_em;
        mana = mana - 3;
        return retorno;
    }
    public void subir_experiencia(int xp){
        if ((level == 1)&&(xp>=10) ) {
            level +=1;
            vida_max += level;
            fuerza += level;
            inteligencia +=level;
            energia_max += level;
            mana_max +=level;
        } else if ((level == 2)&&(xp>=25)){
            level +=1;
            vida_max += level;
            fuerza += level;
            inteligencia +=level;
            energia_max += level;
            mana_max +=level;
        } else if ((level == 3)&&(xp>=50)){
            level +=1;
            vida_max += level;
            fuerza += level;
            inteligencia +=level;
            energia_max += level;
            mana_max +=level;
        } else if ((level == 4)&&(xp>=100)){
            level +=1;
            vida_max += level;
            fuerza += level;
            inteligencia +=level;
            energia_max += level;
            mana_max +=level;
        } else if ((level == 5)&&(xp>=200)){
            level +=1;
            vida_max += level;
            fuerza += level;
            inteligencia +=level;
            energia_max += level;
            mana_max +=level;
        } else if ((level == 6)&&(xp>=350)){
            level +=1;
            vida_max += level;
            fuerza += level;
            inteligencia +=level;
            energia_max += level;
            mana_max +=level;
        } else if ((level == 7)&&(xp>=600)){
            level +=1;
            vida_max += level;
            fuerza += level;
            inteligencia +=level;
            energia_max += level;
            mana_max +=level;
        } else if ((level == 8)&&(xp>=900)){
            level +=1;
            vida_max += level;
            fuerza += level;
            inteligencia +=level;
            energia_max += level;
            mana_max +=level;
        }
    }
}
