import java.util.Scanner;

public class EnterAge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String category;
        //System.out.println("Enter an age");
        //age = sc.nextInt();
        do{
            System.out.print("Enter an age (0 to exit the program): ");
            age = sc.nextInt();
            if(age==0)
            {
                System.out.println("Thank you for using our application");
                System.exit(0);
            }
            else
            {
                category = ageClassifier(age);
                System.out.println("You are " + age + " years old " + " So you are classified as  a(an)" + category);
            }
        }while(age != 0);
    }
    public static String ageClassifier( int givenAge){
        String classification = null;
        if( givenAge >= 65){
            classification = "Pensioner";
        }
        else if(givenAge >= 41){
            classification = "Grown up";
        }
        else if (givenAge >= 31){
            classification = "Adult";
        }
        else if(givenAge >= 21) {
            classification = "Mature";
        }
        else if(givenAge >= 11) {
            classification = "Teenager";
        }
        else if(givenAge >= 3) {
            classification = "Child";
        }
        else if(givenAge >= 1) {
            classification = "Baby";
        }
        return classification;
    }
}




