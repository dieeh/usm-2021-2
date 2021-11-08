package INF253.tarea3;

public class Mision {
    private char requisito;
    private int valor;
    private int cantidad;
    private int recompensa;
    public boolean verificar_requisito(){
        if (cantidad == valor) {
            return true;
        }else{
            return false;
        }
    }

    public Mision(char x, int y, int z, int w){
        this.requisito = x;
        this.valor = y;
        this.cantidad = z;
        this.recompensa = w;
    }
}
