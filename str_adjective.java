import java.util.*;
public class str_adjective {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective(description): ");
        adjective1=sc.nextLine();
        System.out.print("Enter a noun(animal or person): ");
        noun1=sc.nextLine();

        System.out.println("Enter an adjective(description) : ");
        adjective2=sc.nextLine();
        System.out.println("Enter a verb and with -ing(action): ");
        verb1=sc.nextLine();


        System.out.println("Enter an adjective(description) : ");
        adjective3=sc.nextLine();



        System.out.println("Today I went to a "+adjective1+" zoo.");
        System.out.println("In an exhibit, I saw a "+noun1+".");
        System.out.println(noun1+" was "+adjective2+" and "+verb1+"!");
        System.out.println("I was "+adjective3+ "!");

        sc.close();


    }
}
