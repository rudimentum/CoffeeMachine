import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (; start <= end; start++) {
            if (start % 3 == 0 && start % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (start % 3 == 0 || start % 5 == 0) {
                System.out.println(start % 3 == 0 ? "Fizz" : "Buzz");
            } else {
                System.out.println(start);
            }

        }

    }
}