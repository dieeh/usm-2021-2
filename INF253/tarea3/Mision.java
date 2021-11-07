package INF253.tarea3;

public class Mision {
    char requisito;
    int valor;
    int cantidad;
    int recompensa;
    public boolean verificar_requisito(){
        if (cantidad == valor) {
            return true;
        }else{
            return false;
        }
    }

}
