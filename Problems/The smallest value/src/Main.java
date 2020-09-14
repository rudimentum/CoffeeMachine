import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        int i = 0;
        while (true) {
            long temp = factorial(i);
            if (temp > m) {
                System.out.println(i);
                break;
            }
            i++;
        }

    }
    public static long factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

}