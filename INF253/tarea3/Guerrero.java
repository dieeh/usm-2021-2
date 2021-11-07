package INF253.tarea3;

public class Guerrero extends Jugador {
    int vida = 20;
    int xp = 0;
    int level = 1;
    int fuerza = 9;
    int inteligencia = 1;
    int energia = 10;
    int mana = 2;
    int vida_max = 20;
    int energia_max = 10;
    int mana_max = 2;
    public int ataque(){
        if (energia == 0) {
            return 0;
        }
        int retorno = 2*fuerza + energia;
        energia = energia - 5;
        return retorno;
    }
    public int hechizo(){
        if (mana == 0) {
            return 0;
        }
        int v_fuer = fuerza/4;
        int retorno2 = (inteligencia * v_fuer) + mana;
        mana = mana - 3;
        return retorno2;
    }
    public void subir_experiencia(int xp){
        if ((level == 1)&&(xp>=10) ) {
            level +=1;
            vida_max += 3*level;
            fuerza += 5*level;
            inteligencia +=1;
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 2)&&(xp>=25)){
            level +=1;
            vida_max += 3*level;
            fuerza += 5*level;
            inteligencia +=1;
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 3)&&(xp>=50)){
            level +=1;
            vida_max += 3*level;
            fuerza += 5*level;
            inteligencia +=1;
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 4)&&(xp>=100)){
            level +=1;
            vida_max += 3*level;
            fuerza += 5*level;
            inteligencia +=1;
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 5)&&(xp>=200)){
            level +=1;
            vida_max += 3*level;
            fuerza += 5*level;
            inteligencia +=1;
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 6)&&(xp>=350)){
            level +=1;
            vida_max += 3*level;
            fuerza += 5*level;
            inteligencia +=1;
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 7)&&(xp>=600)){
            level +=1;
            vida_max += 3*level;
            fuerza += 5*level;
            inteligencia +=1;
            energia_max += 2*level;
            mana_max +=1;
        } else if ((level == 8)&&(xp>=900)){
            level +=1;
            vida_max += 3*level;
            fuerza += 5*level;
            inteligencia +=1;
            energia_max += 2*level;
            mana_max +=1;
        }
    }
}
