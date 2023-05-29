package homework;

public class PalindromeCounter {

    public static void main(String[] args) {
        String phrase = "kayak noon something rotator";
        PalindromeCounter counter = new PalindromeCounter();
        int count = counter.count(phrase);
        System.out.println("Number of palindromes: " + count);
    }

    private int count(String phrase) {
        String[] words = phrase.split("\\s+");
        int palindromeCount = 0;
        for (String word : words) {
            if (isPalindrome(word)) {
                palindromeCount++;
            }
        }

        return palindromeCount;
    }

    private boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }

        System.out.println(word);
        return true;
    }

}
