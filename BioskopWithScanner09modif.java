import java.util.Scanner;

public class BioskopWithScanner09modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        String nama, next;
        int baris, kolom;

        while (true) {
            System.out.println();
            System.out.println("====================================");
            System.out.println("============ PILIH MENU ============");
            System.out.println("====================================");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine();
            System.out.println("====================================");

            if (pilih == 1) {
                while (true) {
                    System.out.println("\n---- Masukkan data penonton ----");
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris <= 0 || baris > 4 || kolom <= 0 || kolom > 2){
                        System.out.println("Maaf kursi tidak tersedia");
                        System.out.println("Mohon masukkan baris antara (1-4) dan kolom antara (1-2)");
                        continue;
                    } 
                    if (penonton[baris - 1][kolom-1] != null) {
                        System.out.println("Maaf kursi di baris " + baris + " kolom " + kolom + " sudah terisi");
                        continue;
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("kursi di baris ke- " + baris + " kolom ke- " + kolom + " dipesan atas nama " + nama);
                    }
                    
                    System.out.println("----------------------------------");
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    System.out.println("----------------------------------");
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (pilih == 2) {
                System.out.println("\n--------- Daftar penonton ---------");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String namaPenonton = penonton[i][j];
                        System.out.print("Baris ke- " + (i + 1) + " kolom ke- " + (j + 1) + ": ");
                        if (namaPenonton == null) {
                            System.out.print("***");
                        } else {
                            System.out.print(namaPenonton);
                        }
                        System.out.println();
                    }
                }
                System.out.println("\n--- Denah Tempat duduk penonton ---");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***" + "\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            } else if (pilih == 3) {
                System.out.println("Program selesai");
                System.out.println("====================================");
                break;
            } else {
                System.out.println("Mohon masukkan input yang valid");
            }
        }
    }
}
