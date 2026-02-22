package aplicacion;
import dominio.*; 

public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial(5)" + Mates.factorial(5));
        System.out.println("Laberinto(3, 132343539)" + Mates.laberinto("3", "132343539"));
        if (Laberinto.buscar(1, 1)){
            Laberinto.mostrarlab();
        }
        else {
            System.out.println("No se encontró la salida del laberinto.");
        }

       // int [] numeros = {3, -2,4,8,4,-5,7};
        //System.out.println("lista de numero"+ numeros);
        //System.out.println("numeros pares"+ Mates2.Filtrar(numeros, x -> x%2 == 0));
        //System.out.println("numeros negativos"+ Mates2.Filtrar(numeros, x -> x < 0));

    }
}
