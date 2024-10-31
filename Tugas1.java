import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    int w;
    double rata2, total = 0;
    
    System.out.println("========================================================");
    System.out.print("Masukkan jumlah mahasiswa: ");
    w = sc.nextInt();
    
    int[] nilaiMhs = new int[w];

    System.out.println("========================================================");
    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + " : ");
        nilaiMhs [i] = sc.nextInt();
    }
    for (int i = 0; i < nilaiMhs.length; i++) {
        total += nilaiMhs[i];
    }

    rata2 = total/nilaiMhs.length;

    System.out.println("========================================================");
    System.out.println("Rata-rata nilai = " + rata2);
    System.out.println("========================================================");
    sc.close();

    int nilaiTertinggi = nilaiMhs[0];
    int nilaiTerendah = nilaiMhs[0];

    for (int i = 1; i < nilaiMhs.length; i++){
        if (nilaiMhs[i] > nilaiTertinggi){
            nilaiTertinggi = nilaiMhs[i];
        }
        if (nilaiMhs[i] < nilaiTerendah){
            nilaiTerendah = nilaiMhs[i];
        }
    }
    System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
    System.out.println("Nilai Terendah: " + nilaiTerendah);
    System.out.println("========================================================");

    for (int i = 0; i < nilaiMhs.length; i++){
        System.out.println("Mahasiswa ke-" +(i+1)+ " Mendapatkan nilai " +nilaiMhs [i]);
    }
    System.out.println("========================================================");
    }
}