package Backtracking;

public class Tablero {
    private int n;
    private int x,y;
    private int[][] tablero;
    private static int [] incrementox = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static int [] incrementoy = {1, 2, 2, 1, -1, -2, -2, -1};


    public boolean ensayar(int paso, int x, int y ){
        if ( paso == n*n)//salida
            return true;

       for (int i = 0; i < 8; i++){
         int nx= incrementox[i]+x;
         int ny= incrementoy[i]+y;
         
            if( aceptable(nx, ny)== true ){
              anotar(paso+1, nx, ny);
       
               if(ensayar(paso+1, nx, ny))
                  return true;
              else desanotar(paso+1, nx, ny);
            }      
    }
         return false;
 
    }

    public boolean aceptable(int nx, int ny){
        if (nx>=0 && nx< n && ny>=0 && ny<n && tablero[nx][ny]==0){
            return true;
        }
        else 
        return false;
    }
    
    public void anotar(int paso, int x, int y){
        tablero[x][y]=paso;
    }

    public Tablero(int n){
        this.n=n;
        tablero=new int[n][n];
    }

    public String toString(){
        for (int i = 0 ; i <n ; i++){
            for(int j = 0 ; j<n ; j++){
                System.out.print(tablero[i][j]+ "\t");
            }
            System.out.println();
        }
        return "";

    }

    private void desanotar(int paso, int x, int y){
        tablero[x][y]=0;
    }

    
}

