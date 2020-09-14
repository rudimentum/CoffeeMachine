import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int i = 1;
        while (i <= number) {

//            double sqrt = Math.sqrt(i);
//            // int square root of a number
//            int x = (int) sqrt;
//            // raise the real square root and int square root to the power
//            if (Math.pow(sqrt, 2) == Math.pow(x, 2)) {
            if (Math.sqrt(i) % 1 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}