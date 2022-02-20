
package LatihanFunctionMenghitungDanMenggambar;
import java.util.*;
public class LatihanFunctionMenghitungDanMenggambar {

    
    public static void main(String[] args) {
      Scanner userInput= new Scanner(System.in);
      
         System.out.print("panjang:");
         int inputPanjang= userInput.nextInt();
         System.out.print("lebar:");
         int inputLebar= userInput.nextInt();
         gambar(inputPanjang, inputLebar);  
      
        
        //System.out.println("Luas = " + luas(inputPanjang,inputLebar));
        //System.out.println("Keliling = " + "(" + inputPanjang + "+" + inputLebar + ")" + "*" + 2 + "=" + keliling(inputPanjang,inputLebar));
        //System.out.println("Keliling = " + keliling(inputPanjang,inputLebar));
          tampilkanLuasDanKeliling(inputPanjang,inputLebar); 
            
    }
    //Memanggil Fungsi Lain
    private static void tampilkanLuasDanKeliling(int panjang, int lebar){
       System.out.println("Luas = " + luas(panjang,lebar)); 
        System.out.println("Keliling = " + keliling(panjang,lebar));
    }
    
    private static int luas(int panjang, int lebar){
        int luas=panjang * lebar;
        System.out.println("Menghitung luas dengan panjang " + panjang + ", " + " lebar " + lebar);
        System.out.println("Luas = " + panjang + "*" + lebar + "= " + luas);
        return luas;
    }
    private static int keliling(int panjang, int lebar){
        int keliling= (panjang + lebar) * 2;
        //System.out.println("Menghitung keliling dengan panjang " + panjang + ", " + " lebar " + lebar);
        //System.out.println("Keliling = " + "(" + panjang + "+" + lebar + ")" + "*" + 2 + " = " + keliling); 
        return keliling;
    }
    public static void gambar(int panjang, int lebar){
       
       for (int a=0; a<lebar; a++){
           for (int b=0; b<panjang; b++){
           
            System.out.print("* ");
          }
            System.out.println("\n");
         } 
     }
     
    }

