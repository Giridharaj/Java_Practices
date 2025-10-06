public class Str_to_up {
    public static void main(String[] args) {
        String mes = "Unleash unmatched parts";
        char[] charArr = mes.toCharArray();
        boolean found = true;

        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLetter(charArr[i])) {
                if (found) {
                    charArr[i] = Character.toUpperCase(charArr[i]);
                    found = false;
                }
            } else {
                found = true;
            }
        }
        mes=String.valueOf(charArr);
        System.out.println("Message: "+mes);
    }
}
