
package ModulFungsiP1;
import java.util.*;
public class StudiKasus5 {

    public static void main(String[] args) {
        
     Scanner userInput = new Scanner(System.in);
       System.out.print("Masukkan pembelian wortel anda: ");
       int wortel = userInput.nextInt();
       System.out.print("Masukkan pembelian brokoli anda: ");
       int brokoli = userInput.nextInt();
       System.out.print("Masukkan pembelian sawi anda: ");
       int sawi = userInput.nextInt();
       System.out.print("Masukkan pembelian buncis anda: ");
       int buncis = userInput.nextInt();
       
       System.out.println("Total Wortel = " + wortel + " * " + " Rp 5000 " + " = "+ " Rp " + beliWortel(wortel));
       System.out.println("Total Brokoli = " + brokoli + " * " + " Rp 9000 " + " = " + " Rp " + beliBrokoli(brokoli));
       System.out.println("Total Sawi = " + sawi + " * " + " Rp 3000 " + " = "+ " Rp " + beliSawi(sawi));
       System.out.println("Total Buncis = " + buncis + " * " + " Rp 6000 " + " = " + " Rp " + beliBuncis(buncis));
       
       float totalWortel= beliWortel(wortel);
       float totalBrokoli= beliBrokoli(brokoli);
       float totalSawi= beliSawi(sawi);
       float totalBuncis= beliBuncis(buncis);
       
       //hitungTotalBeliSemua(totalWortel, totalBrokoli, totalSawi, totalBuncis);
       float totalBeliSemua= hitungTotalBeliSemua(totalWortel, totalBrokoli, totalSawi, totalBuncis);
       
        System.out.print("Masukkan Uang Pembayaran: ");
       float uangBayar = userInput.nextFloat();
       
       hitungKembalian(totalBeliSemua, uangBayar);
    }
    
    private static float hitungKembalian(float totalBeliSemua, float uangBayar){
        float kembalian;
        kembalian = (uangBayar - totalBeliSemua);
        System.out.println("Total Kembalian = " + "Rp" + uangBayar + " - " + "Rp" + totalBeliSemua + " = " + "Rp" + kembalian);
        return kembalian;
    }
    private static float hitungTotalBeliSemua(float totalWortel,  float totalBrokoli, float totalSawi,  float totalBuncis ){
        float totalBeliSemua;
        totalBeliSemua= (totalWortel + totalBrokoli + totalSawi + totalBuncis);
        System.out.println("Total Belanja = " + " Rp " + totalWortel + " + " + " Rp " + totalBrokoli + " + " + " Rp " + totalSawi + " + " + " Rp " + totalBuncis + " = " +" Rp " +totalBeliSemua);
        return totalBeliSemua; 
        
    }
    
     private static float beliWortel(int wortel){
         float totalWortel;
         totalWortel= (wortel * 5000);
         return totalWortel;
     }
      private static float beliBrokoli(int brokoli){
         float totalBrokoli;
         totalBrokoli= (brokoli * 9000);
         return totalBrokoli; 
     }
       private static float beliSawi(int sawi){
         float totalSawi;
         totalSawi= (sawi * 3000);
         return totalSawi;
     }
       private static float beliBuncis(int buncis){
           float totalBuncis;
           totalBuncis = (buncis * 6000);
           return totalBuncis;
       }
      
         
}
