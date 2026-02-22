package dominio;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.*;
import java.util.ArrayList;




public class Semana2 {
    public static String [] filtrar (String [] lecturaSensor, Predicate condicion){
       return Arrays.stream(lecturaSensor).filter(x -> condicion.test(x)).map(x -> (String)x).toArray(String[]::new);

    }

    public static void main(String[] args) {
       String a []= {"id", "valor", "tipo", "timestamp"};
    
    ArrayList<Object> lecturaSensor = new ArrayList<Object>();
    lecturaSensor.add("id");
    lecturaSensor.add("valor");
    lecturaSensor.add("tipo");
    lecturaSensor.add("timestamp");
    lecturaSensor.stream().map(x -> x.toString().length()).forEach(x -> System.out.println(x));//.forEach(system.out::println);
   //System.out.println("Suma: " + suma);

   System.out.println(Arrays.toString(Semana2.filtrar(a, x-> (String)x.equals("tipo"))));//
    //filtrar lecturas por un tipo especifico.
     System.out.println(Arrays.toString(Semana2.filtrar(lecturaSensor, x-> (String)x.equals("tipo"))));//
    }
}
