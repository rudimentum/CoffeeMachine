import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        boolean isSorted = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1].compareTo(array[i]) > 0) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}