
package PengenalanFunction;


public class PengenalanFunction {

   
    public static void main(String[] args) {
        int y, x;
        x= 10;
        y = hitung (x);
        System.out.println("x = " + x + " y = " + y );
        
        x= 20;
        y = hitung(x);
        System.out.println("x = " + x + " y = " + y);
        
        x= 30;
        y = hitung(x);
        System.out.println("x = " + x + " y = " + y);
        
    }
    private static int hitung (int x){
        int hasil;
       // hasil = (x + 2)*x;
       hasil= (x/2);
        return hasil;
    }
    
    
}
