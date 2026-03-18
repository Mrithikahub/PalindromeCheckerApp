public class PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC2");

        String str = "madam";
        String rev = "";

        // reverse using loop
        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // check palindrome
        if(str.equals(rev)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }
}