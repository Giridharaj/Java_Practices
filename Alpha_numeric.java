import java.util.Random;
public class Alpha_numeric {
    public static void main(String[] args){
        String up="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String low="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";

        String alpha=up+low+num;;
        StringBuilder sb=new StringBuilder();
        Random random=new Random();

        int length=10;
        for(int i=0;i<length;i++){
            int index=random.nextInt(alpha.length());
            char randomChar=alpha.charAt(index);
            sb.append(randomChar);
        }
        String randomString=sb.toString();
        System.out.println("Random String is: "+randomString);
    }
}
