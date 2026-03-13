package Backtracking;

public class Principal {
public static void main(String[] args) {
        Tablero T = new Tablero(5);
        T.anotar(1,0,0);
        boolean exito = T.ensayar (1,0,0);
        if (exito){
            System.out.println("solucion encontrada");
            System.out.println(T.toString());
        }
        else {
            System.out.println("no se encontró solución");
        }
    }   
}
