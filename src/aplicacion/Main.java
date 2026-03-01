package aplicacion;
import dominio.*;

import java.util.ArrayList;

import java.util.stream.Collectors;

import javax.sound.sampled.SourceDataLine;

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


        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", "Pérez", "15/04/1950", "Madrid", "Profesor"));

        personas.add(new Persona("María", "García", "22/08/1980", "Barcelona", "Ingeniera"));

        personas.add(new Persona("Carlos", "López", "30/12/1945", "Valencia", "Médico"));

        personas.add(new Persona("Ana", "Martínez", "10/02/1990", "Sevilla", "Abogada"));

        personas.add(new Persona("Pedro", "Sánchez", "05/06/1955", "Zaragoza", "Arquitecto"));

        personas.add(new Persona("Sofía", "Gómez", "18/11/1985", "Bilbao", "Diseñadora"));

        personas.add(new Persona("Miguel", "Díaz", "25/03/1970", "Granada", "Chef"));

        personas.add(new Persona("Laura", "Fernández", "12/09/1995", "Málaga", "Periodista"));

        personas.add(new Persona("Angel", "Ruiz", "28/07/2010", "Alicante", "Empresario"));

        personas.add(new Persona("David", "Ruiz", "08/01/1960", "Alicante", "Empresario"));

        personas.add(new Persona("Elena", "Hernández", "20/07/1988", "Córdoba", "Psicóloga"));

        personas.add(new Persona("Javier", "González", "02/05/2019", "Valladolid", "Contador"));

        personas.add(new Persona("Luis", "Sánchez", "05/06/2010", "Zaragoza", "Arquitecto"));  

        personas.add(new Persona("Sofía", "Gómez", "18/11/1985", "Bilbao", "Diseñadora"));

        personas.add(new Persona("Miguel", "Díaz", "25/03/1970", "Granada", "Chef"));

        personas.add(new Persona("Laura", "Fernández", "12/09/1995", "Málaga", "Periodista"));

        personas.add(new Persona("Andrés", "Alarcón", "28/07/2010", "Alicante", "Empresario"));

        personas.add(new Persona("David", "Ruiz", "08/01/1960", "Alicante", "Empresario"));

        personas.add(new Persona("Elena", "Hernández", "20/07/1988", "Córdoba", "Psicóloga"));

        personas.add(new Persona("Javier", "González", "02/05/2019", "Valladolid", "Contador"));
        personas.stream()//nombre de los jubilados
        .filter(x->x.jubilado())
        .map(x->x.getNombre())
        .forEach(x->System.out.println(x));

       int cuenta =  personas.stream()
        .filter(x->x.edad()>12 && x.edad()<19)
        .map(x-> 1)   
        .reduce(0, (c,x)->c+1);
        System.out.println("Número de personas entre 13 y 18 años: " + cuenta);
        System.out.println(personas.stream()
        .peek(x->System.out.println(" edad de " + x.getNombre()))
        .filter(x->x.edad()>12 && x.edad()<19)
        .peek(x->System.out.println("concatenado " + x.getNombre()))
        .map(x->x.getNombre() + " " + x.getApellidos() + " edad: " + x.edad())
        .collect(Collectors.toList()));

    }
}
