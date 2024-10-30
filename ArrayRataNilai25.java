import java.util.Scanner;
public class ArrayRataNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    int lulus = 0, w, tdkLulus = 0;
    double rata2, total = 0, rataLulus = 0, rataTdkLulus = 0, totalLulus = 0, totalTdkLulus = 0;

    System.out.print("Masukkan jumlah mahasiswa: ");
    w = sc.nextInt();

    int[] nilaiMhs = new int[w];

    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + " : ");
        nilaiMhs [i] = sc.nextInt();
    }

    for (int i = 0; i < nilaiMhs.length; i++) {
        total += nilaiMhs[i];

        if (nilaiMhs [i] > 70) {
        lulus ++;
        totalLulus += nilaiMhs [i];
        } else {
        tdkLulus ++;
        totalTdkLulus += nilaiMhs [i];
        }
    }

    rata2 = total/nilaiMhs.length;
    rataLulus = totalLulus/lulus;
    rataTdkLulus = totalTdkLulus/tdkLulus;

    System.out.println("========================================================");
    System.out.println("Jumlah Mahasiswa yang lulus adalah " + lulus);
    System.out.println("Jumlah Mahasiswa yang tidak lulus adalah " + tdkLulus);
    System.out.println("========================================================");
    System.out.println("Rata-rata nilai = " + rata2);
    System.out.println("========================================================");
    System.out.println("Rata-rata nilai lulus = " + rataLulus);
    System.out.println("Rata-rata nilai tidak lulus = " + rataTdkLulus);
    System.out.println("========================================================");
    sc.close();
    }
}