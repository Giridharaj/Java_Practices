import java.util.*;
public class voter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter your age: ");
        age=sc.nextInt();
        if(age>=18){
            System.out.println("You are an adult! ");
        }
        else if(age>=65){
            System.out.println("You are a senior!!!");
        }
        else if(age<0){
            System.out.println("You haven't been born yet!");
        }
        else if(age==0){
            System.out.println("You are a baby!");
        }
        else{
            System.out.println("You are a child!!!");
        }
        sc.close();
    }
}
