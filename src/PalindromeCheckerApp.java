public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String str = "madam";

        long start = System.nanoTime();

        String rev = new StringBuilder(str).reverse().toString();
        boolean result = str.equals(rev);

        long end = System.nanoTime();

        if(result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        System.out.println("Time taken: " + (end - start) + " ns");
    }
}