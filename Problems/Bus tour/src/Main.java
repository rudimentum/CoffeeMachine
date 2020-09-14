import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int bridgesCount = scanner.nextInt();
        String result = "Will not crash";
        for (int i = 1; i <= bridgesCount; i++) {
            int tempHeight = scanner.nextInt();
            if (tempHeight <= busHeight) {
                result = "Will crash on bridge " + i;
                break;
            }
        }

        System.out.println(result);
    }
}