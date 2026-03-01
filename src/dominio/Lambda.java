package dominio;
import java.util.stream.*;

public class Lambda {

    public static int factorial(int n){
        return Stream.iterate(1, x->x+1).limit(n).reduce(1, (c,x)->c*x);
    }
    public static int potencia(int a, int b){
        return Stream.iterate(a, x->a).limit(b).reduce(1, (c,x)->c*x);// c es lo que llevomultiplicado, x es el actual
    }
    public static int fibbonacci(int n){
        if ( n==0) return 1;
        return Stream.iterate(new int[]{0, 1}, x->new int[]{x[1], x[0]+x[1]})
        .limit(n)
        .reduce(new int[]{0}, (c,x)->x)[1];
    }
    public static void main(String[] args) {
        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("Potencia de 2 elevado a 3: " + potencia(2, 3));
        System.out.println("Fibbonacci de 5: " + fibbonacci(5));

    }
}
