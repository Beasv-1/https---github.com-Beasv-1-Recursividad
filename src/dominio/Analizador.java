package dominio;
import java.util.Random;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Analizador {

    private static int[] generarArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    // Burbuja con conteo de comparaciones
    public static long burbuja(int[] array) {
        long comparaciones = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                comparaciones++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return comparaciones;
    }

    // Selección con conteo de comparaciones
    public static long seleccion(int[] array) {
        long comparaciones = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                comparaciones++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return comparaciones;
    }

    // Comparaciones teóricas n(n-1)/2
    private static long comparacionesTeoricas(int n) {
        return (long) n * (n - 1) / 2;
    }

    public static void main(String[] args) {

        int[] tamaños = {100, 1000, 10000};

        System.out.println("N        Algoritmo     Comp.Teoricas     Comp.Reales     Tiempo(ms)");
        System.out.println("---------------------------------------------------------------------");

        for (int n : tamaños) {

            int[] base = generarArray(n);

            // Burbuja
            int[] copia1 = base.clone();
            long inicioB = System.nanoTime();
            long compB = burbuja(copia1);
            long tiempoB = System.nanoTime() - inicioB;

            System.out.println(
                n + "     Burbuja       " +
                comparacionesTeoricas(n) + "            " +
                compB + "            " +
                (tiempoB / 1e6)
            );

            // Selección
            int[] copia2 = base.clone();
            long inicioS = System.nanoTime();
            long compS = seleccion(copia2);
            long tiempoS = System.nanoTime() - inicioS;

            System.out.println(
                n + "     Seleccion     " +
                comparacionesTeoricas(n) + "            " +
                compS + "            " +
                (tiempoS / 1e6)
            );
        }
    }
}
