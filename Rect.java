import java.util.*;
public class Rect {
    public static void main(String[] args){
        double w=0;
        double h=0;
        double area=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the width: ");
        w=sc.nextDouble();
        System.out.println("Enter the height: ");
        h=sc.nextDouble();
        area=0.5*w*h;
        System.out.println("Area of a Triangle: "+area);
        sc.close();
    }
}
