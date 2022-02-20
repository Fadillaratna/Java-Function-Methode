
package ModulFungsiP1;

import java.util.*;
public class ModulFungsiP1 {

   
    public static void main(String[] args) {
       nilaiTertinggi();
   
     }
    private static void nilaiTertinggi(){
     int nilaiTertinggi;
     int pSatu;
     int pDua;
     int pTiga;
     int pTertinggi;
   
     Scanner userInput= new Scanner(System.in);
        System.out.print("Masukkan skor peserta satu: ");
        pSatu = userInput.nextInt();
         System.out.print("Masukkan skor peserta dua: ");
        pDua = userInput.nextInt();
         System.out.print("Masukkan skor peserta tiga: ");
        pTiga = userInput.nextInt();
        
        if(pSatu > pDua && pSatu > pTiga){
            nilaiTertinggi = pSatu;
            
        }else if(pDua > pSatu && pDua > pTiga){
            nilaiTertinggi = pDua;
        
        }else{
            nilaiTertinggi = pTiga;   
        }
          System.out.println("Nilai Tertinggi adalah " + nilaiTertinggi);  
          
    }
   
}
