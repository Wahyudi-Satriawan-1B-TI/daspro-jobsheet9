import java.util.Scanner;
public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    boolean ketemu = false;
    String key, ya;
    String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice", "Wagyu Steak", "Caviar Tartare", "Lobster Bisque", "Caesar Salad with King Crab", "Dragon Scale Chips", "Kraken Ink Pasta", "Unicorn Tenderloin", "Pegasus Cloud Greens", "Elf Garden Herb Medley", "Griffin Wing Roast", "Phoenix Feather Rolls", "Fairy Wing Blossoms", "Centaur Harvest Bowl", "Seared Leviathan Fillet",
 "Pegasus Feathered Steak", "Basilisk Stone Soup", "Grilled Wyvern Tail", "Frozen Dragonfruit Soufflé", "Golden Phoenix Tea", "Truffle Arancini", "Herb-Crusted Lamb Rack", "Lobster Thermidor", "Ash-Smoked Octopus", "Midnight Venison", "Nightfall Blackened Salmon", "Sinister Chocolate Sphere", "Black Velvet Cake", "Shadowy Crème Brûlée", "Charred Bone Marrow", "Bloodberry Mist", "Eclipse Essence", "STMJ"};

    System.out.println("====================== DAFTAR MENU =====================");
    for (int i = 0; i < menu.length; i++){
        System.out.println((i+1) + ". " + menu [i]);
    }
    System.out.println("========================================================");

    System.out.print("Apakah ada menu yang ingin anda cari? (Y/N):");
    ya = sc.nextLine();
    
    if (ya.equalsIgnoreCase("Y")) {
        do {
        System.out.println("========================================================");
        System.out.print("Masukkan menu yang anda cari: ");
        key = sc.nextLine();
        System.out.println("========================================================");
        ketemu = false;

        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu [i])) {
                System.out.println("Menu yang anda cari tersedia");
                System.out.println("Pada daftar menu nomor " + (i+1));
                ketemu = true;
                break;
            } 
        }
        if (!ketemu) {
            System.out.println("Menu yang anda cari tidak tersedia");
        }
        System.out.print("Apakah mau mencari menu lain? (Y/N): ");
        ya = sc.nextLine();
        
        } while (ya.equalsIgnoreCase("Y"));
    }
    System.out.println("========================================================");
    System.out.println("Terima kasih telah melihat daftar menu kami.");
    System.out.println("========================================================");
    sc.close();
    }
}