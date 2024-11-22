import java.util.Scanner;

public class Siakad04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] nilai = new int[4][3];

        for(int i=0; i< nilai.length; i++){
            System.out.println("Input Nilai Mahasiswa Ke- " + (i+1));
            double totalPerSiswa = 0;

            for(int j=0; j<nilai[i].length; j++){
                System.out.println("Nilai Mata Kuliah " + (j+1) + ":");
                nilai[i][j] = input.nextInt();
                totalPerSiswa += nilai [i][j];
            }
            System.out.print("Nilai Rata-Rata Mahasiswa ke- " + (i+1) + ":" + totalPerSiswa/3);
            System.out.print("====================================");
        }
        System.out.println("\nRata-Rata Nilai Setiap Mata Kuliah : ");
        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / 4);
        }
        input.close();
    }
}
