import java.util.Scanner;

public class pemdas{
    
    
    // public class mahasiswa{
    //     public String nama ;
    //     // public int total;
        
    //     public void mahasiswa(String nama){
    //         this.nama = nama;
    //         // this.total = total;
    //     }
    // }
    
    static String tertinggiNama;
    static String tertinggiNamaOOP;
    static int tertinggiNilai = 0 ;
    static int poin = 0 ;
    static int oopScore = 0;
        
    
    public static void main (String [] args ){
    
    Scanner in = new Scanner (System.in);

    
    int jumlahMhs = in.nextInt();
    in.nextLine();
    
    
    
    // mahasiswa kumpulan [] = new mahasiswa [jumlahMhs] ;
    
    
    
    for (int i = 0 ;i <jumlahMhs; i++){
            
        String namaMhs = in.nextLine();
    
        String soalDone = in.nextLine();
    
        String namaSoal [] = soalDone.split(" ");
        
        for (int j = 0; j<namaSoal.length; j++){
            if (namaSoal[j].equals("Array")){
                poin +=25;
                     
            } if (namaSoal[j].equals("Method")){
                poin +=20;
                
            } if (namaSoal[j].equals("Function")){
                poin +=30;
            } 
            
            if (namaSoal[j].equals("Inheritance")){
                poin +=35;
                oopScore +=35;
            } if (namaSoal[j].equals("Polymorphism")){
                poin +=28;
                oopScore +=28;
            } if (namaSoal[j].equals("Encapsulation")){
                poin +=22;
                oopScore +=22;
            }
            
        
        }
        
        int oopPoin = oopScore;
        
        if (oopPoin > oopScore){
            oopScore = oopPoin;
            tertinggiNamaOOP = namaMhs;
        }
        
        // System.out.println(oopScore);
        
        int jumlah_poin = poin;
        // System.out.println(jumlah_poin);
        
        if (jumlah_poin > tertinggiNilai){
            tertinggiNilai = jumlah_poin;
            tertinggiNama = namaMhs;
        }
        
        
        
        
    }
    
    System.out.println("Si Tertinggi : "+ tertinggiNama );
    // System.out.println(tertinggiNilai);
    System.out.println("Si Jago OOP : " +tertinggiNamaOOP );
    //ada beberapa error di nilai mahassiswa dan nama tertinggi OOP
    
    
   
    
    
    
    
    
    
    }
}
