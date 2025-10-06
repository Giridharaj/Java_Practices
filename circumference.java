import java.util.*;
public class circumference {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble() ;

        circumference = 2 * Math.PI * radius;

        System.out.println("The circumference is: " + circumference + "cm");

        sc.close();
    }
}
