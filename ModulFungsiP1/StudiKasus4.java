
package ModulFungsiP1;

public class StudiKasus4 {

    
    public static void main(String[] args) {
       float a, b, c, d, e, nilaiRataRata;
       a = 100;
       b = 88;
       c = 99;
       d = 96;
       e = 100;
        System.out.println("Nilai pertama = " + a);
        System.out.println("Nilai kedua = " + b);
        System.out.println("Nilai ketiga = " + c);
        System.out.println("Nilai keempat = " + d);
        System.out.println("Nilai kelima = " + e);
       nilaiRataRata = nilaiRataRata(a,b,c,d,e);
      
    }
     private static float nilaiRataRata(float a, float b, float c, float d, float e){
         float nilaiRataRata;
         nilaiRataRata= ((a + b + c + d + e)/5);  
         System.out.println("Nilai Rata Rata = " + "( " + a + " + " + b + " + " + c + " + " + d + " + " + e + " ) " + " / " + 5 + " = " + nilaiRataRata);
         return nilaiRataRata;
     }
}
