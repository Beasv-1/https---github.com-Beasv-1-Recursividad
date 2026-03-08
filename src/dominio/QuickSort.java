package dominio;

public class QuickSort {
    public static long [] quicksort(long []A,int izq, int der){
        long aux;
        int i=izq, j=der;
        long pivote=A[(izq+der)/2];
        while (i<j){
            while (A[i]<pivote) i++;
            while (A[j]>pivote) j--;
            if (i<=j){
                aux=A[i];
                A[i]=A[j];
                A[j]=aux;
                i++; j--;
            }
        }
        if (izq<j) quicksort(A,izq,j);          // ordenamos subarray izquierdo
        if (i<der) quicksort(A,i,der);          // ordenamos subarray derecho
        return A;
    }
    public static long [] quicksort(long []A){
        return quicksort(A,0,A.length-1);
    }
    public static long [] quicksort2(long []A,int izq, int der){
        if (izq>=der) return A; // caso base: el array se ha ordenado
        long pivote=A[(izq+der)/2]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        long aux;

        while(i<j){                          // mientras no se crucen las búsquedas
            while(A[i]<pivote) i++; // busca elemento mayor que pivote
            while(A[j]>pivote) j--;           // busca elemento menor que pivote
            if (i<=j){                        // si no se han cruzado
                aux=A[i];                      // los intercambia
                A[i]=A[j];
                A[j]=aux;
            }
        }
        quicksort2(A,izq,j-1);          // ordenamos subarray izquierdo
        quicksort2(A,j+1,der);          // ordenamos subarray derecho
        return A;
    }
}