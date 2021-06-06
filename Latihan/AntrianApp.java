package Latihan;
public class AntrianApp {
    public static void main(String [] args) {
        Antrian antrian = new Antrian(10);
        antrian.masuk(73);
        antrian.lihat();
        antrian.masuk(45);
        antrian.lihat();
        antrian.masuk(80);
        antrian.lihat();
        System.out.println("yang diambil dari antrian = " + antrian.keluar());
        antrian.lihat();
        System.out.println("yang diambil dari antrian = " + antrian.keluar());
        antrian.lihat();
    }
}
