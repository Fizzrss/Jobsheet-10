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

                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("kursi di baris ke- " + baris + " kolom ke- " + kolom + " dipesan atas nama " + nama);
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
                        System.out.println("Baris ke- " + (i + 1) + " kolom ke- " + (j + 1) + ": " + namaPenonton);
                    }
                }
                System.out.println("\n--- Denah Tempat duduk penonton ---");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print(penonton[i][j] + "\t");
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
