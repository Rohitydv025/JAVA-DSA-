import java.util.Scanner;


public class tableof_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println( " enter the number of table you want to print ");
        int n = sc.nextInt();
//      its run more rounds
//        for( int i = 1 ; i<= n*10;i ++ )
//        {
//            if ( i%n == 0  ) System.out.println( i);
//        }
        // second code its runs min rounds

        for (int i = n; i <= n * 10; i += n) {
            System.out.println(i);


        }
    }
}