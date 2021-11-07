package INF253.tarea3;

import java.util.Scanner;

public class Monstruo implements Enemigo {
    private int vida;
    private int dano;
    public void combate(Jugador jugador){
        System.out.println("¡Te haz topado con un monstruo!");
        while ((jugador.GetVida() != 0)||(vida != 0)) {
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
            System.out.println("¡Le haz realizado " + Integer.toString(dmg) + " puntos de daño al monstruo!");
            System.out.println("Ahora atacará el monstruo...");
            jugador.SetVida(jugador.GetVida() - dano);
            System.out.println("¡El monstruo ha realizado "+ Integer.toString(dano) +" puntos de daño!");
        }
    }

    public Monstruo(int x, int y){
        this.vida = x;
        this.dano = y;
    }

    public Monstruo(){
        this.vida = 15;
        this.dano = 5;
    }
}
