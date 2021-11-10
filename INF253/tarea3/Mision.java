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

    public Mision(char requisito, int valor, int cantidad, int recompensa){
        this.requisito = requisito;
        this.valor = valor;
        this.cantidad = cantidad;
        this.recompensa = recompensa;
    }

    public int GetRecompensa(){
        return recompensa;
    }
}
