import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int i = 0;
        int max = Integer.MIN_VALUE;
        while (i < count) {
            int current = scanner.nextInt();
            if (current % 4 == 0 && current > max) {
                max = current;
            }
            i++;
        }
        System.out.println(max);
    }
}
