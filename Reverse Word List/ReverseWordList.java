import java.util.Arrays;
import java.util.Collections;

public class ReverseWordList {

    public static String reverseWordsList(String s) {

        s = s.trim();

        java.util.List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

    public static void main(String[] args) {
        String a = "POP a Coin In the Flip";
        String b = "MEME is Awesome Game Stop Wall Stree Bets";

        System.out.println(reverseWordsList(a));
        System.out.println(reverseWordsList(b));
    }

}
