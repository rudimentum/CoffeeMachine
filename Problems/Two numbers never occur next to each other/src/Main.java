import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean isOccur = true;
        for (int i = 1; i < length; i++) {
            if (array[i - 1] == n && array[i] == m || array[i - 1] == m && array[i] == n) {
                isOccur = false;
            }
        }

        System.out.println(isOccur);
    }
}