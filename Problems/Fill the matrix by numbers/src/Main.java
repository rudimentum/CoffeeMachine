import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            int[] arrayInside = array[i];
            for (int j = 0; j < arrayInside.length; j++) {
                arrayInside[j] = Math.abs(i - j);
                System.out.print(arrayInside[j] + " ");
            }
            System.out.println();
        }

    }
}