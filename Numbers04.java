import java.util.Arrays;
import java.util.Scanner;

public class Numbers04 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[0] = new int[3];
        myNumbers[0] = new int[1];
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang Baris Ke- " + (i + 1) + ":" + myNumbers[i].length);
        }
    }
}
