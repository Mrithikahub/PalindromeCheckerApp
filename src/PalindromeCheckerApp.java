class PalindromeService {

    boolean isPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();

        if(service.isPalindrome("madam"))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}