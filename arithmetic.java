import java.util.*;
public class arithmetic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String item;
        double price;
        int quan;
        char currency='$';
        double total;

        System.out.println("What item would you like to purchase? ");
        item=sc.nextLine();
        System.out.println(item);

        System.out.println("What is the price for each? ");
        price=sc.nextDouble();

        System.out.println("How many would you like? ");
        quan=sc.nextInt();

        total=price*quan;
        System.out.println("\nYou  have bought "+quan+" "+item+"s");
        System.out.printf("Your total is %c%.2f\n",currency,total);

        sc.close();

    }
}
