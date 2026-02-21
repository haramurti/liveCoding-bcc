import java.util.Scanner;

public class cilok{
    
    static int kordinat_x  ;
    static int kordinat_y  ;
    static int panas ;
    
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        
        // System.out.println("test");
        int n = in.nextInt();
        int m = in.nextInt();
        
        int array [] [] = new int [n] [m];
        
        for (int i = 0; i<n ; i++){
            for (int j = 0; j<m ; j++){
                array [i] [j] = in.nextInt();
            }
        }
    
        //cek panas
        
        
      
        for (int i = 0; i<n ; i++){
            for (int j = 0; j<m ; j++){
                if (array [i] [j] > panas ){
                    panas = array  [i] [j]; 
                    kordinat_x = i+1;
                    kordinat_y = j+1;
                    
                }
            }
        }
        
        System.out.println("Zona terpanas di: "+ kordinat_x + " " + kordinat_y );
        System.out.println("Jumlah cilok: " + panas );
    
    
        
    }
}
