
package OverloadMethodeFunction;


public class OverloadMethodeFunction {

    public static void main(String[] args) {
      //Overload methode adalah satu nama fungsi yang dipakai berulang ulang dengan argumen berbeda eda
        int hasilInt;
        hasilInt= tambah(4,5);
        printAngka (hasilInt);
       
        float hasilFloat;
        hasilFloat= tambah(4.5f ,5);
        printAngka(hasilFloat);
        
        hasilInt= tambah(25,11,20);
        printAngka(hasilInt);
        
        printAngka(10);
        printAngka(5);
        printAngka(15.5f);
    }
     private static int tambah(int angkaint1, int angkaint2, int angkaint3){
        return angkaint1 + angkaint2 + angkaint3;
    }
    
    private static int tambah(int angkaint1, int angkaint2){
        return angkaint1 + angkaint2;
    }
    
    private static float tambah(float angkafloat1, int angkaint2){
        return angkafloat1 + angkaint2;
    }
    
    private static void printAngka(float angkaFloat){
         System.out.println("Angka ini adalah angka float dengan nilai " + angkaFloat);  
     } 
    
    private static void printAngka(int angkaInteger){
        System.out.println("Angka ini adalah angka integer dengan nilai " + angkaInteger);
    }
}
