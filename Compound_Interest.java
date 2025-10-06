import java.util.*;
public class Compound_Interest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double P;
        double r;
        int time;
        int years;
        double amount;
        System.out.println("Enter the principal amount: ");
        P=sc.nextDouble();

        System.out.println("Enter the interest rate(in %): ");
        r=sc.nextDouble()/100;

        System.out.println("Enter the # of times compounded per years: ");
        time=sc.nextInt();

        System.out.println("Enter the # of years: ");
        years=sc.nextInt();

        amount=P*Math.pow(1+r/time,time*years);
        System.out.println("The amount after "+years+" is: $"+amount);

        sc.close();


    }
}
