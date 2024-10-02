package tugasOOP;

import java.util.Scanner;

public class tugas2 {

    String jenisTelur, caraMasak, wadah;
    int jumlahTelur, jumlahOrang;
    Scanner scanner = new Scanner(System.in); 

    public tugas2(String wadah, String caraMasak, int jumlahTelur, int jumlahOrang, String jenisTelur) {
        this.wadah = wadah;         
        this.caraMasak = caraMasak;         
        this.jenisTelur = jenisTelur;         
        this.jumlahTelur = jumlahTelur;       
        this.jumlahOrang = jumlahOrang;        
    }

    public void infoTelur() {
        System.out.println("Ada " + jumlahTelur + " telur " + jenisTelur);
    }

    public void makan() {
        if (jumlahTelur < jumlahOrang) {
            System.out.println((jumlahOrang - jumlahTelur) + " orang tidak makan");
        } else if (jumlahTelur == jumlahOrang) {
            System.out.println("Semua orang makan dengan pas.");
        } else {
            System.out.println("Semua orang makan, dan sisa telur: " + (jumlahTelur - jumlahOrang));
        }
    }

    public void tempat() {
        System.out.println("Pilih wadah: ");
        System.out.println("1. Piring");
        System.out.println("2. Mangkok");
        System.out.println("3. Gelas");
        int pilihanWadah = scanner.nextInt();
        
        switch (pilihanWadah) {
            case 1:
                wadah = "Piring";
                break;
            case 2:
                wadah = "Mangkok";
                break;
            case 3:
                wadah = "Gelas";
                break;
            default:
                System.out.println("Pilihan tidak valid. Wadah diatur ke Piring.");
                wadah = "Piring";
        }
        System.out.println("Telur ditaruh di " + wadah);
    }

    public void masak() {
        System.out.println("Telur dimasak dengan cara " + caraMasak);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis telur: ");
        String jenisTelur = input.nextLine();

        System.out.print("Masukkan cara memasak: ");
        String caraMasak = input.nextLine();

        System.out.print("Masukkan jumlah telur: ");
        int jumlahTelur = input.nextInt();

        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang = input.nextInt();

        tugas2 masakan = new tugas2("Piring", caraMasak, jumlahTelur, jumlahOrang, jenisTelur);

        masakan.infoTelur();
        masakan.tempat();
        masakan.makan();
        masakan.masak();

        input.close(); 
    }
}
