import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        int total = 0;
        int i;
        for( i = 0;i <10;i++){
            total = total + i;
        }
        System.out.println(i +  " = "  +  " while its 10 exit the loop because condition is less than 10");
        System.out.println(i- 1 + " = " + "  according to for loop condition numbers will be added between 0 and 9 as i < 10 ");
        System.out.println("Total of number between 0 and  "  +  i  +  "  = "  +  total );
    }
}
