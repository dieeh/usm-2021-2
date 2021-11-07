package INF253.tarea3;

import java.util.Scanner;

public class Jefe_Final implements Enemigo {
    private String nombre;
    private int vida;
    private int vida_i;
    private int dano_base;
    private int fase;
    public void combate(Jugador jugador){
        System.out.println("¡¡Te haz topado con el Jefe Final!!");
        System.out.println("¡Este Jefe Final se llama " + nombre + "!");
        while ((jugador.GetVida()!= 0)||(vida != 0)){
            Scanner input = new Scanner(System.in);
            System.out.println("¡Jugador, elige hacer un ataque o un hechizo contra el Jefe Final!");
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
            jugador.SetVida(jugador.GetVida() - (dano_base + 2*fase));
            System.out.println("¡El Jefe Final te ha provocado "+ Integer.toString(dano_base + 2*fase) +" puntos de daño!");
        }
        if (jugador.GetVida() <= 0) {
            System.out.println("Haz perdido...");
        } else if (vida <= 0){
            System.out.println("¡Haz vencido al Jefe Final!");
        }
    }

    public Jefe_Final(String x){
        this.nombre = x;
        this.vida = 50;
        this.vida_i = this.vida;
        this.dano_base = 15;
        this.fase = 2;
    }

    public Jefe_Final(String x, int y, int z){
        this.nombre = x;
        this.vida = y;
        this.vida_i = this.vida;
        this.dano_base = z;
        this.fase = 2;
    }
}

