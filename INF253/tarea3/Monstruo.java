package INF253.tarea3;

import java.util.Scanner;

public class Monstruo implements Enemigo {
    private int vida;
    private int dano;
    public void combate(Jugador jugador){
        System.out.println("¡Te has topado con un monstruo!");
        while ((jugador.GetVida() > 0)&&(vida > 0)) {
            Scanner input = new Scanner(System.in);
            System.out.println("¡Jugador, elige hacer un ataque o un hechizo contra el monstruo!");
            System.out.println("1: Ataque");
            System.out.println("2: Hechizo");
            int eleccion = input.nextInt();
            int dmg = 0;
            if (eleccion == 1) {
                dmg = jugador.ataque();
                System.out.println("¡Has realizado un ataque!");
            } else if (eleccion == 2){
                dmg = jugador.hechizo();
                System.out.println("¡Has lanzado un hechizo!");
            }
            
            System.out.println("¡Le has realizado " + Integer.toString(dmg) + " puntos de daño al monstruo!");
            if (vida <= 0) {
                vida = 0;
                System.out.println("¡Has ganado esta batalla!");
                for (int i = 0; i < jugador.GetMisiones().size()  ; i++) {
                    if (jugador.GetMisiones().get(i).GetRequi() == 'm' ){
                        jugador.GetMisiones().get(i).SetCantidad(jugador.GetMisiones().get(i).GetCantidad() + 1);
                        boolean requi = jugador.GetMisiones().get(i).verificar_requisito();
                        if (requi == true){
                            jugador.SetXP(jugador.GetXP() + jugador.GetMisiones().get(i).GetRecompensa());
                            jugador.GetMisiones().remove(i);
                            i = 0;
                        }
                    }
                }
                break;
            }
            System.out.println("Ahora atacará el monstruo...");
            jugador.SetVida(jugador.GetVida() - dano);
            System.out.println("¡El monstruo ha realizado "+ Integer.toString(dano) +" puntos de daño!");
            if (jugador.GetVida() <= 0) {
                //System.out.println("Has sido derrotado por el monstruo...");
                jugador.SetVida(0);
            }
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
