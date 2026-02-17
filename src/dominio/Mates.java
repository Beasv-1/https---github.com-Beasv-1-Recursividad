package dominio;

public class Mates {
    public static int factorial (int n ){
        if (n == 0 )
            return 1;
        else 
            return n * factorial(n-1);
    }

    public static int laberinto (String digito, String numero) {
        
        if (numero.length() == 0){
            return 0;
        }

        else if(numero.startsWith(digito)){
            return 1 + laberinto(digito, numero.substring(1));
        }
        
        else {
        return laberinto(digito, numero.substring(1));
        }
        
    
    }      
      

   
        
      
    }




