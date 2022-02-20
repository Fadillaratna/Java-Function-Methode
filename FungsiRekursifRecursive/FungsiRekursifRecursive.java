
package FungsiRekursifRecursive;
import java.util.*;

public class FungsiRekursifRecursive {

    
    public static void main(String[] args) {
       Scanner userInput= new Scanner(System.in);
       System.out.print("Masukkan nilai: ");
       int nilai= userInput.nextInt();
       System.out.println("Anda memasukkan nilai: " + nilai);
       
       printNilai(nilai); 
       int totalNilai =tambahNilai(nilai);
        System.out.println("Total Nilai = " + totalNilai);
        int faktoreal =faktorealNilai(nilai);
        System.out.println("Total Perkalian Nilai = " + faktoreal);
        
        
       
    } //Fungsi Rekursif Sederhana
      //Mengalikan Parameter atau Faktoreal(!)
       private static int faktorealNilai(int parameter){
       System.out.println("parameter = " + parameter);
       if(parameter == 1){
           return parameter;
       }
       
       return parameter * faktorealNilai(parameter - 1);
           
       }
      //Menjumlahkan Parameter
       private static int tambahNilai(int parameter){
       System.out.println("parameter = " + parameter);
       if(parameter == 0){
           return parameter;
       }
       
       return parameter + tambahNilai(parameter - 1);
       
       }
       
           
       public static void printNilai(int parameter){
           System.out.println("nilai = " + parameter); 
           if(parameter == 0){
               return;
           }
           parameter--;
           printNilai(parameter);
       }
          
    
}
