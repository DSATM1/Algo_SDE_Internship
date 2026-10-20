import java.net.StandardSocketOptions;

public class SurajPattern {

    static final int ROWS = 7;   // height of each letter
    static final int COLS = 5;   // width of each letter

    // Returns true if a '*' should be printed at (r, c) for the given letter
    static boolean isStar(char letter, int r, int c) {
        switch(letter) {
            case 'S':
                return r == 0 || r == 3 || r == 6          // top, middle, bottom bars
                    || (c == 0 && (r == 1 || r == 2))      // upper-left side
                    || (c == 4 && (r == 4 || r == 5));     // lower-right side

            case 'U':
                return ((c == 0 || c == 4) && r <= 5)      // both sides
                    || (r == 6 && c >= 1 && c <= 3);       // rounded bottom

            case 'R':
                return c == 0                              // spine
                    || ((r == 0 || r == 3) && c <= 3)      // top and middle bars
                    || (c == 4 && (r == 1 || r == 2))      // bowl right side
                    || (r > 3 && c == r - 2);              // diagonal leg

            case 'A':
                return (r == 0 && c >= 1 && c <= 3)        // pointed top
                    || (r >= 1 && (c == 0 || c == 4))      // both legs
                    || (r == 3);                           // cross bar

            case 'J':
                return r == 0                              // top bar
                    || (c == 2 && r <= 6)                  // vertical stem
                    || (r == 6 && c <= 2)                  // bottom hook
                    || (r == 5 && c == 0);                 // hook tip

            default:
                return false;
        }
    }

    public static void main(String[] args) {
        String word = "SURAJ";

        for (int r = 0; r < ROWS; r++) {                   // each row of the pattern
            for (int i = 0; i < word.length(); i++) {      // each letter
                for (int c = 0; c < COLS; c++) {           // each column in the letter
                    System.out.print(isStar(word.charAt(i), r, c) ? "*" : " ");
                }
                System.out.print("   ");                   // gap between letters
            }
            System.out.println();
            System.out.println();
        }
    }
}