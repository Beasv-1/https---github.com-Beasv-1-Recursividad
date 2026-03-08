package Modelo;
import java.io.*;
import java.util.function.Function;
import java.util.function.BiFunction;



public class Analizador {
    /**
     * @param data: Dato de prueba para correr el análisis
     * @param F: función a analizar
     * @param out: Fichero de salida para el tiempode ejecución
     * @return resultado de la función a analizar
     */
    public static long [] analiza(long[] data, Function <long[],long[]> F,  PrintWriter out) {
        long[] aux = data.clone();
        long inicio=System.nanoTime();
        F.apply(aux);
        long duracion=System.nanoTime()-inicio;
        out.print(duracion+"\t");
        return aux;
    }
    public static long  analizaBusqueda(long[] data,long e, BiFunction <long[],Long,Long> F,  PrintWriter out) {
        long inicio=System.nanoTime();
        long p=F.apply(data,e);
        long duracion=System.nanoTime()-inicio;
        out.print(duracion+"\t");
        return p;
    }
}

