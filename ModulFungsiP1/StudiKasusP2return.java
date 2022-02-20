
package ModulFungsiP1;


public class StudiKasusP2return {

    
    public static void main(String[] args) {
     namaLengkap();
     namaPanggilan();
     umur();
     alamat();
     smk();
      smp();
     sd();      
    }
    private static String namaLengkap(){
        String namaLengkap= "Fadilla Ratna Dwita";
        System.out.println("Nama Lengkap: " + namaLengkap);
        return namaLengkap;
        
    }
      private static String namaPanggilan(){
        String namaPanggilan= "Fadilla / Dilla";
         System.out.println("Nama Panggilan: " + namaPanggilan);
        return namaPanggilan;  
    }
      private static String ttl(){
        String ttl = "Tulungagung 4 Oktober 2005";
         System.out.println("TTL: " + ttl);
        return ttl;
    }
      private static int umur(){
        int umur = 14;
        System.out.println("Umur: " + umur + "tahun");
        return umur;
    }
      private static String alamat(){
         String alamat = "RT 4 RW 7, Dusun Blumbang, Desa Campurdarat, Kabupaten Tulungagung, Jawa Timur";
         System.out.println("Alamat: " + alamat);
         return alamat;
    }
      private static String smk(){
         String smk = "SMK TELKOM MALANG";
         System.out.println("SMK: " + smk); 
         return smk;
    }
      private static String smp(){
         String smp = "SMPN 1 CAMPURDARAT";
         System.out.println("SMP: " + smp);
         return smp;
    }
      private static String sd(){
         String sd = "SDN 1 CAMPURDARAT";
         System.out.println("SD: " + sd);  
         return sd;
      }
}