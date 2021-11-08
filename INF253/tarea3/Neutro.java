package INF253.tarea3;

import java.util.Scanner;

public class Neutro extends NPC {
    private char requisito; 
    private int valor;
    private int recompensa;
    private int ya_dio_mision;
    public void interaccion(Jugador jugador){
        if (ya_dio_mision == 0) {
            Scanner input = new Scanner(System.in);
            String tipo1 = "llegar a la casilla ";
            String tipo2 = "matar una cantidad de ";
            String tipo3 = " del mundo ";
            String tipo4 = " Monstruos ";
            String text1 = "";
            String text2 = "";
            if (requisito == 'v') {
                text1 = tipo1;
                text2 = tipo3;
            } else if (requisito == 'm'){
                text1 = tipo2;
                text2 = tipo4;
            }
            System.out.println(GetNombre() +": ¡Hola!, ¿Quieres cumplir esta misión? Deberás "+text1+Integer.toString(valor)+text2+"y recibirás "+Integer.toString(recompensa)+ " de experiencia.");
            System.out.println(GetNombre() +": Entonces, ¿aceptas? (Y/n)");
            String elecc = input.nextLine();
            if (elecc == "Y") {
                Mision temp = new Mision(requisito, 0, valor, recompensa);
                jugador.AddMisiones(temp);
                ya_dio_mision = 1;
                System.out.println(GetNombre() +": ¡Bien! He añadido la misión a tu lista de misiones, ¡adios!");
            } else if (elecc == "n"){
                System.out.println(GetNombre() +": Oh, es una lastima entonces, adios.");
            }
        } else if (ya_dio_mision != 0){
            System.out.println(GetNombre() +": Ya te di una misión, saludos.");
        }
    }

    public Neutro(String v, char x, int y, int z, int w){
        SetNombre(v);
        this.requisito = x;
        this.valor = y;
        this.recompensa = z;
        this.ya_dio_mision = 0;
    }
}
