package HelloWorld;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";

        char[] a = word1.toLowerCase().toCharArray();
        char[] b = word2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("The words are Anagram");
        } else {
            System.out.println("The words are not Anagram");
        }
    }
}