
package FungsiRekursifBercabang;
import java.lang.String;
import java.util.*;
public class FungsiRekursifBercabang {

   
    public static void main(String[] args) {
       Scanner inputUser= new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
       int nilai= inputUser.nextInt();
       
     int nilai_fibonacci = fibonacci(nilai,"atas");
        System.out.println("Nilai Fibonacci ke- "+ nilai +" adalah  " + nilai_fibonacci); 
    }
    private static int fibonacci(int n, String daun){
        System.out.println("daun "+ daun);
      System.out.println("Fibonacci ke - "+ n);
      if(n==0||n==1){
          return n;
      }else{
      return fibonacci(n-1, "kiri")+fibonacci(n-2,"kanan");    
      }
      
    }
    
}
