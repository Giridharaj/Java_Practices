import java.util.Random;
public class rand {
    public static void main(String[] args){
        Random random=new Random();
        int num;
        num=random.nextInt(101);
        System.out.println(num);
    }
}
