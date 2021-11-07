package INF253.tarea3;

import java.util.Scanner;

public class Jefe_Final implements Enemigo {
    String nombre;
    int vida;
    int vida_i;
    int dano_base;
    int fase;
    public void combate(Jugador jugador){
        System.out.println("¡¡Te haz topado con el Jefe Final!!");
        System.out.println("¡Este Jefe Final se llama " + nombre + "!");
        while ((jugador.vida != 0)||(vida != 0)){
            Scanner input = new Scanner(System.in);
            System.out.println("¡Jugador, elige hacer un ataque o un hechizo contra el monstruo!");
            System.out.println("1: Ataque");
            System.out.println("2: Hechizo");
            int eleccion = input.nextInt();
            int dmg = 0;
            if (eleccion == 1) {
                dmg = jugador.ataque();
                System.out.println("¡Haz realizado un ataque!");
            } else if (eleccion == 2){
                dmg = jugador.hechizo();
                System.out.println("¡Haz lanzado un hechizo!");
            }
            vida = vida - dmg;
            System.out.println("¡Le haz realizado " + Integer.toString(dmg) + " puntos de daño al Jefe Final!");
            System.out.println("Ahora atacará el Jefe Final...");
            if (vida <= vida_i/2){
                fase = 1;
            }
            jugador.vida = jugador.vida - (dano_base + 2*fase);
            System.out.println("¡El Jefe final te ha provocado "+ Integer.toString(dano_base + 2*fase) +" puntos de daño!");
        }
    }

    public Jefe_Final(String x){
        this.nombre = x;
        this.vida = 50;
        this.vida_i = this.vida;
        this.dano_base = 15;
    }

    public Jefe_Final(String x, int y, int z){
        this.nombre = x;
        this.vida = y;
        this.vida_i = this.vida;
        this.dano_base = z;
    }
}

