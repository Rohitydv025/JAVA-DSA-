import java.util.Scanner;


public class odd_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) System.out.println(i);
        }
    }
}