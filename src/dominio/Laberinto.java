package dominio;

public class Laberinto {

    public static char[][] laberinto = {
        { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
        { '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
        { '#', ' ', '#', '#', '#', '#', '#', '#', ' ', '#' },
        { '#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#' },
        { '#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#' },
        { '#', ' ', '#', ' ', '#', 'S', ' ', '#', ' ', '#' },
        { '#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#' },
        { '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#' },
        { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
    };
    public static int [] incrementox = {1, 0, -1, 0};
    public static int [] incrementoy = { 0, 1, 0,-1};

    public static void mostrarlab(){
        for(int i = 0; i < laberinto.length; i++){
            for(int j = 0; j < laberinto[i].length; j++){
                System.out.print(laberinto[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean buscar(int x, int y) {
        
        for ( int i=0; i < 4; i++) {
            int nuevoX = x + incrementox[i];
            int nuevoY = y + incrementoy[i];
            if (laberinto[nuevoX][nuevoY] == 'S') {
            return true;
            }
            if(laberinto[nuevoX][nuevoY] == ' ') {
                laberinto[nuevoX][nuevoY] = 'x';
            if (buscar(nuevoX, nuevoY)) {
                laberinto[nuevoX][nuevoY] = '*';
                return true;
            }
            }
            
        }
            return false;

    }
}
