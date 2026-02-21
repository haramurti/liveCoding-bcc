import java.util.Scanner;
import java.util.*;



public class test {
    
    static int sumPegawai_1 = 0 ; 
    static int sumPegawai_2 = 0 ; 
    static int sumPegawai_3 = 0 ; 
    static int sumPegawai_4 = 0 ; 
    static int sumPegawai_5 = 0 ; 
    static int sumPegawai_6 = 0 ; 
    static int sumPegawai_7 = 0 ; 
    static int sumPegawai_8 = 0 ; 
    static int sumPegawai_9 = 0 ; 
    static int sumPegawai_10 = 0 ; 
    
    public static class pegawai{
        int nomor;
        int jumlah;
        
        public pegawai(int nomor, int jumlah){
            this.nomor = nomor;
            this.jumlah = jumlah;
        }
        
    }
    
    
    public static void main ( String [] args) {
        System.out.println("test");
        
        Scanner in = new Scanner(System.in);
        
        int m = in.nextInt();
        int n = in.nextInt();
        
        
        
        // System.out.println(m);
        // System.out.println(n);
       
    
        
        int array [] [] = new int [m] [n];
        
        
        
        
        for (int i = 0; i <m ; i++){
            for (int j = 0 ; j<n ; j++){
                array [i] [j] = in.nextInt();
                // System.out.println(array [i][j] );
                
            }
        }
        
        
        // for (int i = 0; i<m ; i++){
        //     for (int j = 0 ; j<n ; j++){
        //         System.out.print(array [i] [j]);
        //     }
        // }
        
        
        //pegawai 1
        
        if (m==1){
            for (int i = 0; i<1 ; i++){
            for (int j = 0 ; j<n ; j++){
                sumPegawai_1 += array [i] [j] ;
            }
        }
        
        
        System.out.println(sumPegawai_1);
            
        }
        
        //pegawai 2
        
        if (m==2){
                    for (int i = 0; i<1 ; i++){
                         for (int j = 0 ; j<n ; j++){
                            sumPegawai_1 += array [i] [j] ;
                        }
                    }
        
            System.out.println(sumPegawai_1);
            
        
            
            
                for (int i = 1; i<2 ; i++){
                    for (int j = 0 ; j<n ; j++){
                        sumPegawai_1 += array [i] [j] ;
                    }
                }
        
        System.out.println(sumPegawai_2);
            
        }
        
        
        //pegawai 3
        
        if (m==3){
            
            for (int i = 0; i<1 ; i++){
                         for (int j = 0 ; j<n ; j++){
                            sumPegawai_1 += array [i] [j] ;
                        }
                    }
                    
                    
            
            
        
            
            
                for (int i = 1; i<2 ; i++){
                    for (int j = 0 ; j<n ; j++){
                        sumPegawai_2 += array [i] [j] ;
                    }
                }
        
        
        
            for (int i = 2; i<3 ; i++){
            for (int j = 0 ; j<n ; j++){
                sumPegawai_3 += array [i] [j] ;
            }
        }
        pegawai p1 = new pegawai(1,sumPegawai_1);
        pegawai p2 = new pegawai(2,sumPegawai_2);
        pegawai p3 = new pegawai(3,sumPegawai_3);
        
        
        
        System.out.println("Pegawai ke-1 melakukan penjualan sebanyak " + sumPegawai_1);
        System.out.println("Pegawai ke-2 melakukan penjualan sebanyak " + sumPegawai_2);
        System.out.println("Pegawai ke-3 melakukan penjualan sebanyak " + sumPegawai_3);
        
        
        //max
        int max = p1.jumlah;
        if (sumPegawai_2 > max ){
            max = sumPegawai_2;
        }
        if (sumPegawai_3 > max ){
            max = sumPegawai_3;
        }
        
        System.out.println(max);
        
        
        //min
        int min = sumPegawai_1;
        if (sumPegawai_2 < max ){
            min = sumPegawai_2;
        }
        if (sumPegawai_3 > max ){
            min = sumPegawai_3;
        }
        
        // System.out.println("Penjualan terburuk diraih oleh Pegawai ke " + max.nomor);
        
        
    
            
        }
        
        
        //harusnay ini bisa pakai static value variabel sama kayak usbmit soal saya yang soal kuis pemdas, jadi karena itu bisa di cek pegawai mana yang dapet nilai tinggi dan terbuurk
        
        

    }
}
