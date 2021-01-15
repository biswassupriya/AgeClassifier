import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args){
        int number1;
        int number2;
        System.out.println("Multiplication table ");
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter number for multiplication  : " );
      number1 = sc.nextInt();
        System.out.println("Enter the length for multiplication :  " );
        number2 = sc.nextInt();
        //System.out.println(number1 + "x" + number1*number2);
        for( int i= 0; i <= number2 ; i++)
           // for(i = 0 ; i <= length ; i++)
            System.out.println(number1 + "X" + i + "=" + number1 * i);
        //System.out.println(number1 + "X" + i + "=" + number1*i);


    }
}
