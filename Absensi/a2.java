
package Absensi;

public class a2 {

    public static void main(String[] args) {
        luasLingkaran(14);
        System.out.println("Luas lingkaran = " + luasLingkaran(14 ) );
    }
    static double luasLingkaran(int r){

       //Deklarasi variabel
       double luas, phi=3.14;

       //Menghitung luas lingkaran
       luas = phi*r*r;

    return luas;
    }
}
