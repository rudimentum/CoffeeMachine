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
        boolean isContain = false;
        for (int i:
             array) {
            if (i == n) {
                isContain = true;
            }
        }

        System.out.println(isContain);
    }
}