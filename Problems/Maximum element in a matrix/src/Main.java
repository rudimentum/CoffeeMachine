import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int [][] array = new int[columns][rows];
        int max = Integer.MIN_VALUE;
        int row = 0;
        int column = 0;
        for (int i = 0; i < array.length; i++) {
            int[] arrayInside = array[i];
            for (int j = 0; j < arrayInside.length; j++) {
                int element = scanner.nextInt();
                arrayInside[j] = element;
                if (element > max) {
                    max = element;
                    column = i;
                    row  = j;
                    System.out.println(element);
                }
            }
        }

        System.out.println(column + " " + row);
    }
}