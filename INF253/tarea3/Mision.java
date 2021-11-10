package INF253.tarea3;


public class Mision {
    private char requisito;
    private int valor;
    private int cantidad;
    private int recompensa;
    public boolean verificar_requisito(){
        if (cantidad == valor) {
            if (requisito == 'v') {
                String text1 = "llegar a la casilla ";
                String text2 = " del mundo ";
                System.out.println("<<<< ¡Has completado la mision de "+text1+Integer.toString(valor)+text2+"y has ganado "+Integer.toString(recompensa)+" de experiencia! >>>>") ;
            } else{
                String text1 = "matar una cantidad de ";
                String text2 = " Monstruos ";
                System.out.println("<<<< ¡Has completado la mision de "+text1+Integer.toString(valor)+text2+"y has ganado "+Integer.toString(recompensa)+" de experiencia! >>>>") ;
            }
            return true;
        }else{
            return false;
        }
    }

    public Mision(char requisito, int valor, int cantidad, int recompensa){
        this.requisito = requisito;
        this.valor = valor;
        this.cantidad = cantidad;
        this.recompensa = recompensa;
    }

    public int GetRecompensa(){
        return recompensa;
    }

    public char GetRequi(){
        return requisito;
    }
    public int GetValor(){
        return valor;
    }
    public void SetCantidad(int ca){
        cantidad = ca;
    }
    public int GetCantidad(){
        return cantidad;
    }

}
