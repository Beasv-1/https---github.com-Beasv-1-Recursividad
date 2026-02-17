package aplicacion;
import dominio.*; 

public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial(5)" + Mates.factorial(5));
        System.out.println("Laberinto(3, 132343539)" + Mates.laberinto("3", "132343539"));
        System.out.println(Mates.laberinto1(new char [][] {

            { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },

            { '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },

            { '#', ' ', '#', '#', '#', '#', '#', '#', ' ', '#' },

            { '#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#' },

            { '#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#' },

            { '#', ' ', '#', ' ', '#', 'S', ' ', '#', ' ', '#' },

            { '#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#' },

            { '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#' },

            { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },

 

    } , 5,5));
        
        }

}
