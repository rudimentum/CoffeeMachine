import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count  = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        for (int i = 0; i < count; i++) {
            int current = scanner.nextInt();
            if (current == 0) {
                perfect++;
            } else if (current == -1) {
                smaller++;
            } else if (current == 1) {
                larger++;
            }
        }

        System.out.println(perfect + " " + larger + " " + smaller);
    }
}