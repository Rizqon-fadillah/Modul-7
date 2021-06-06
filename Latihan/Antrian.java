package Latihan;
public class Antrian {
    private int ukuran;
    private long[] antrian;
    private int belakang;
    private int jumItem;
    private int depan;
    
    public Antrian (int s){
        ukuran = s;
        antrian = new long [ukuran];
        depan = 0;
        belakang = -1;
        jumItem = 0;
    }
    
    public void masuk (long j){
        if (!isFull()){
            antrian[++belakang] = j;
            jumItem++;
        }
    }
    
    public long keluar(){
        long temp = antrian[0];
        if (!isEmpety()){
            for(int i = 0; i <jumItem; i++)
                antrian[i] = antrian[i+1];
            jumItem--;
            belakang--;
        }
        return temp;
    }
    public long peekDepan(){
        return antrian[depan];
    }
    public boolean isEmpety(){
        return(jumItem==0);
    }
    public boolean isFull(){
        return (belakang==ukuran-1);
    }
    public int ukuran(){
        return jumItem;
    }
    public void lihat(){
        for (int i = 0; i<jumItem; i++)
            System.out.print(antrian[i]+" ");
        System.out.println(" ");
    }
    
}