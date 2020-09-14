import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        long product = 1;
        for (; start < end; start++) {
            product *= start;
        }
        System.out.println(product);
    }
}