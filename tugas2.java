package tugasOOP;

import java.util.Scanner;

public class tugas2 {
    
    String jenistelur, caramasak, wadah;
    int jumlahtelur, orang;
    Scanner scanner = new Scanner(System.in); 

    public tugas2(String jeniswadah, String cara, int jumlah, int jumlahorang, String jenis) {
        wadah = jeniswadah;         
        caramasak = cara;         
        jenistelur = jenis;         
        jumlahtelur = jumlah;       
        orang = jumlahorang;        
    }

    public String infoTelur() {
        return "Ada " + jumlahtelur + " telur " + jenistelur;
    }

    public void makan() {
        if (jumlahtelur < orang) {
            System.out.println((orang - jumlahtelur) + " orang tidak makan");
        } else if (jumlahtelur == orang) {
            System.out.println("Semua orang makan dengan pas.");
        } else {
            System.out.println("Semua orang makan, dan sisa telur: " + (jumlahtelur - orang));
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
        System.out.println("telur ditaruh di "+ wadah);
    }

    public void masak() {
        System.out.println("telur dimasak dengan cara: " + caramasak);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis telur: ");
        String jenisTelur = input.nextLine();
        System.out.print("Masukkan cara memasak: ");
        String caraMemasak = input.nextLine();
        System.out.print("Masukkan jumlah telur: ");
        int jumlahTelur = input.nextInt();
        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang = input.nextInt();
 
        tugas2 masakan = new tugas2("Piring", caraMemasak, jumlahTelur, jumlahOrang, jenisTelur);

        System.out.println(masakan.infoTelur());
        masakan.tempat();
        masakan.makan();
        masakan.masak();

        input.close(); 
    }
}
