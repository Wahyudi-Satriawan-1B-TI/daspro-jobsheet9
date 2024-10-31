import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahPesanan, hitung = 0;
        
    System.out.println("========================================================");
    System.out.print("Masukkan jumlah pesanan: ");
    jumlahPesanan = sc.nextInt();

    sc.nextLine();

    String [] pesanan = new String[jumlahPesanan];
    int [] harga = new int [jumlahPesanan];

    System.out.println("========================================================");
    for (int i = 0; i < pesanan.length; i++){
        System.out.print("Masukkan pesanan ke-" + (i+1) + ": ");
        pesanan [i] = sc.nextLine();
    }
    System.out.println("========================================================");
    for (int i = 0; i < harga.length; i++){
        System.out.print("Masukkan harga pesanan ke-" + (i+1) + ": ");
        harga [i] = sc.nextInt();
    }
    System.out.println("========================================================");

    for (int i = 0; i < harga.length; i++){
        hitung += harga [i];
    }
    System.out.println("==================== DAFTAR PESANAN ====================");
    for (int i = 0; i < pesanan.length; i++){
        int w = 1;
        System.out.println(w + ". " + pesanan [i]);
    }
    System.out.println("Total Biaya: Rp " + hitung);
    System.out.println("========================================================");
    sc.close();
    }
}