package p2;

import java.util.Arrays;

public class P2_main {

    public static void main(String[] args) {

        int[] a = {0, 1, 2, 43};
        int[] b = {6, 7, 23, 7};
        int[] c = {14, 2, 0, 0, 19, 19};

        String x = "UNI";

        LetterGame game = new LetterGame();
        game.setWord(a);
        System.out.println("Word from a: " + game.word);

        game.setWord(b);
        System.out.println("Word from b: " + game.word);

        game.setWord(c);
        System.out.println("Word from c: " + game.word);

        game.findWord(x);
        System.out.println("Indices for x: " + Arrays.toString(game.a));
        game.setWord(game.a);
        System.out.println("Word from x: " + game.word);

    }

}
