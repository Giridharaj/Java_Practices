public class frequency_character {
    public static void main(String[] args){
        String str="This a biggest stampede";
        char ch='g';
        int frequency=0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                ++frequency;
            }
        }
        System.out.println("Frequency of "+ch+" = "+frequency);
    }
}
