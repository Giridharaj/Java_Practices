import java.util.*;
public class Pythagores {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a=sc.nextInt();

        System.out.println("Enter the length of side B: ");
        b=sc.nextInt();

        System.out.println("Enter the length of side C: ");
        c=sc.nextInt();

        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The hypotenuse (side c) is: "+c+" cm");
        sc.close();
    }
}
