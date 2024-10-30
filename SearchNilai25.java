import java.util.Scanner;
public class SearchNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    int key, hasil = 0;
    int w;
        
    System.out.print("Masukkan banyaknya nilai yang akan di input: ");
    w = sc.nextInt();
    int [] arrNilai = new int [w];


    for (int i = 0; i < arrNilai.length; i++) {
        System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + " : ");
        arrNilai [i] = sc.nextInt();
    }
    System.out.print("Masukkan nilai yang ingin dicari: ");
    key = sc.nextInt();

    for (int i = 0; i < arrNilai.length; i++) {
        if (key == arrNilai [i]) {
            hasil = i+1;
            break;
        }
    }

    System.out.println();
    if (hasil != 0) {
        System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" +hasil);
    } else
        System.out.println("Nilai yang dicari tidak ditemukan");
    System.out.println();
    sc.close();
    }
}