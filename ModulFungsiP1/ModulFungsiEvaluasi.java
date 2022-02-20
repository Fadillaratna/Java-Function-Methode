
package ModulFungsiP1;
import java.util.*;

public class ModulFungsiEvaluasi {

    
    public static void main(String[] args) {
     nilaiTertinggi();
    }
    private static int nilaiTertinggi(){
        int nilaiTertinggi;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai 1: ");
        int nilaiSatu = userInput.nextInt();
         System.out.print("Masukkan nilai 2: ");
        int nilaiDua = userInput.nextInt();
         System.out.print("Masukkan nilai 3: ");
        int nilaiTiga = userInput.nextInt();
         System.out.print("Masukkan nilai 4: ");
        int nilaiEmpat = userInput.nextInt();
         System.out.print("Masukkan nilai 5: ");
        int nilaiLima = userInput.nextInt();
        
        if(nilaiSatu > nilaiDua && nilaiSatu >  nilaiTiga && nilaiSatu > nilaiEmpat && nilaiSatu > nilaiLima){
            nilaiTertinggi = nilaiSatu;
        }else if(nilaiDua > nilaiSatu && nilaiDua >  nilaiTiga && nilaiDua > nilaiEmpat && nilaiDua > nilaiLima){
            nilaiTertinggi = nilaiDua;
        }else if(nilaiTiga > nilaiSatu && nilaiTiga >  nilaiDua && nilaiTiga> nilaiEmpat && nilaiTiga > nilaiLima){
            nilaiTertinggi = nilaiTiga;
        }else if(nilaiEmpat > nilaiSatu && nilaiEmpat>  nilaiDua && nilaiEmpat > nilaiTiga && nilaiEmpat > nilaiLima){
            nilaiTertinggi = nilaiEmpat;
        }else{
            nilaiTertinggi = nilaiLima;
        }
        System.out.println("Nilai Tertinggi adalah " + nilaiTertinggi);
        return nilaiTertinggi;
    }
}
