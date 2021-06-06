package Latihan;
public class Nomor1 {
public static void main(String[] args){
        Antrian antrian = new Antrian(10);
        antrian.masuk(40);
        antrian.lihat();
        System.out.println("");
        antrian.masuk(33);
        antrian.lihat();
        System.out.println("");
        System.out.println("nilai yang paling depan = "+antrian.peekDepan());
        antrian.masuk(60);
        antrian.lihat();
        System.out.println("");
        System.out.println("yang diambil dari antrian = "+antrian.keluar());
        antrian.lihat();
        System.out.println("");
        System.out.println("yang diambil dari antrian = "+antrian.keluar());
        antrian.lihat();
        System.out.println("");
        antrian.masuk(54);
        antrian.lihat();
        System.out.println("");
        System.out.println("nilai yang paling depan = "+antrian.peekDepan());
    }    
}
