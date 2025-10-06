import java.math.*;
public class bin_Fact {
    public static void main(String[] args){
        long num=110110111;
        int decimal=convertBinary(num);
        System.out.println("Binary to decimal");
        System.out.println(num+" = "+decimal);
    }
    public static int convertBinary(long num){
        int deci=0,i=0;
        long rem;
        while(num!=0){
            rem=num%10;
            num/=10;
            deci+=rem*Math.pow(2,i);
            ++i;
        }
        return deci;
    }
}

