import java.util.*;
public class scan {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Name
        System.out.println("Enter the name: ");
        String name=sc.nextLine();
        //Age
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        //GPA
        System.out.println("Enter the GPA");
        int gpa=sc.nextInt();
        //Conditional
        System.out.println("Are you a Student? (True/False): ");
        boolean isStudent=sc.nextBoolean();
        //Details
        System.out.println("Hello "+name);
        System.out.println("You are "+ age +" years old");
        System.out.println("Your GPA is: "+gpa);
        System.out.println("Valid student or not:  "+isStudent);

        sc.close();
    }
}
