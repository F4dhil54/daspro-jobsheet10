import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String Penonton[][] = new String[4][2];

        while (true) {
            System.out.print("Masukkan Nama : ");
            nama = sc.nextLine();
            System.out.print("Masukkan Baris : ");
            baris = sc.nextInt();
            System.out.print("Masukkan Kolom : ");
            kolom = sc.nextInt();
            sc.nextLine();
            Penonton[baris-1][kolom-1] = nama;

            System.out.print("Input Penonton Lainnya ? y/n");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
            ;
        }
    }
}
