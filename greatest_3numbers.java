import java.util.Scanner;
public class greatest_3numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( " the gratest of three numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int greatest ;
        if ( num1 >= num2 && num1 >= num3 ){
            greatest = num1 ;

        } else if (num2 >= num1 && num2 >= num3 ) {
            greatest= num2 ;
        }
        else {
            greatest = num3;
        }

        //output
       System.out.println( " the gretest is "+greatest);
    }




    }



