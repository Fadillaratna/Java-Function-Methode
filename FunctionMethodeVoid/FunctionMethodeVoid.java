
package FunctionMethodeVoid;

public class FunctionMethodeVoid {
    public static void main(String[] args) {
    selamatPagi("mama");
    fungsiVoid("hai");
    System.out.println(simpel());
}
    private static void fungsiVoid(String input){
     System.out.println(input); 
    }
    private static void selamatPagi(String nama){
     System.out.println("Selamat pagi "+ nama);
    }
    private static float simpel(){
     return 10.0f;  
    }
}