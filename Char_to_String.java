public class Char_to_String {
    public static void main(String[] args){
        String name = "Thugs_of_Tech";

        // Optional: Print useful info
        System.out.println("Length of name: " + name.length());
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Index of space: " + name.indexOf(" "));
        System.out.println("Last index of 'o': " + name.lastIndexOf("o"));
        if (name.isEmpty()) {
            System.out.println("Your name is empty");
        } else {
            System.out.println("Hello " + name);
        }
        if (name.contains(" ")) {
            System.out.println("Your name contains a space");
        } else {
            System.out.println("Your name DOESN'T contain any spaces");
        }
        if (name.equals("password")) {
            System.out.println("Your name can't be password");
        }
        // Optional: Debugging output
        System.out.println("Is name empty? " + name.isEmpty());
    }
}