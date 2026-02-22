package dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Streams {
    public static int [] filtrar (int [] lista, Predicate condicion){
       return Arrays.stream(lista).filter(x -> condicion.test(x)).map(x -> (int)x).toArray();

    }

    public static void main(String[] args) {
         int a [] = {3, -2,4,8,4,-5,7};
    ArrayList<Integer> lista  = new ArrayList<>(Arrays.asList(3, -2,4,8,4,-5,7));
    lista.stream().map(x -> x*2).forEach(x -> System.out.println(x));//.forEach(system.out::println);
   //System.out.println("Suma: " + suma);

   System.out.println(Arrays.toString(Streams.filtrar(a, x-> (int)x < 0 )));//deepToString para matrices, toString para arrays.

}
}