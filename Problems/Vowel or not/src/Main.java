import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        List<Character> list = Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        for (Character i : list) {
            if (ch == i) {
                return true;
            }
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}