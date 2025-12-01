package p2;

public class LetterGame {

    String keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BAYERN!";
    String word = "";
    int[] a;

    public void setWord(int[] a) {
        word = "";
        for (int i : a) {
            word += keyString.charAt(i);
        }
    }

    public void findWord(String s) {
        int[] b = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (keyString.contains(s.charAt(i) + "")) {
                b[i] = keyString.indexOf(s.charAt(i));
            } else {
                System.out.println("Character " + s.charAt(i) + " not found in keyString.");
            }
        }

        a = b;
    }

}
