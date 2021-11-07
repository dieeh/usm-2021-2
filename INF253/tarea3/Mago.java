package INF253.tarea3;

public class Mago extends Jugador {
    int vida = 10;
    int xp = 0;
    int level = 1;
    int fuerza = 3;
    int inteligencia = 10;
    int energia = 6;
    int mana = 15;
    int vida_max = 10;
    int energia_max = 6;
    int mana_max = 15;
    public int ataque(){
        if (energia == 0) {
            return 0;
        }
        int v_int = inteligencia/4;
        int retorno = (fuerza * v_int) + energia;
        energia = energia - 3;
        return retorno;
    }
    public int hechizo(){
        if (mana == 0) {
            return 0;
        }
        int v_fuer = fuerza/4;
        int retorno2 = (inteligencia * v_fuer) + mana;
        mana = mana - 5;
        return retorno2;
    }
    public void subir_experiencia(int xp){
        if ((level == 1)&&(xp>=10) ) {
            level +=1;
            vida_max += 2*level;
            fuerza += 1;
            inteligencia += 3*level;
            energia_max += 1;
            mana_max += 3*level;
        } else if ((level == 2)&&(xp>=25)){
            level +=1;
            vida_max += 2*level;
            fuerza += 1;
            inteligencia += 3*level;
            energia_max += 1;
            mana_max += 3*level;
        } else if ((level == 3)&&(xp>=50)){
            level +=1;
            vida_max += 2*level;
            fuerza += 1;
            inteligencia += 3*level;
            energia_max += 1;
            mana_max += 3*level;
        } else if ((level == 4)&&(xp>=100)){
            level +=1;
            vida_max += 2*level;
            fuerza += 1;
            inteligencia += 3*level;
            energia_max += 1;
            mana_max += 3*level;
        } else if ((level == 5)&&(xp>=200)){
            level +=1;
            vida_max += 2*level;
            fuerza += 1;
            inteligencia += 3*level;
            energia_max += 1;
            mana_max += 3*level;
        } else if ((level == 6)&&(xp>=350)){
            level +=1;
            vida_max += 2*level;
            fuerza += 1;
            inteligencia += 3*level;
            energia_max += 1;
            mana_max += 3*level;
        } else if ((level == 7)&&(xp>=600)){
            level +=1;
            vida_max += 2*level;
            fuerza += 1;
            inteligencia += 3*level;
            energia_max += 1;
            mana_max += 3*level;
        } else if ((level == 8)&&(xp>=900)){
            level +=1;
            vida_max += 2*level;
            fuerza += 1;
            inteligencia += 3*level;
            energia_max += 1;
            mana_max += 3*level;
        }
    }
}
