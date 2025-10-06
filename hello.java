import java.util.*;
public class hello {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age: ");
        String age=sc.nextLine();
        sc.close();
        System.out.println("Hello My friend "+age+" How are you?");
    }
}
