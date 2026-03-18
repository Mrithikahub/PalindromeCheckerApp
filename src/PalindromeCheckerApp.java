public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String str = "Madam";

        // convert to lowercase
        str = str.toLowerCase();

        // reverse
        String rev = new StringBuilder(str).reverse().toString();

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}