import java.util.Scanner;

public class AgeGroup {
   // public static int age;
     public static void main(String[] args)
     {
         String category;
         int age; //local variable to main()
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter your age");
         age = sc.nextInt();
         System.out.println("The age = " +age);
         category = ageClassifier(age);
         System.out.println("You are " + age + "years old " + " So you are classified as  a(an)" +category);
     }

     //This method works out the category based on the age
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
