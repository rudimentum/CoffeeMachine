import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();

        switch (shape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = 0.5 * (a + b + c);
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle":
                double d = scanner.nextDouble();
                double e = scanner.nextDouble();
                System.out.println(d * e);
                break;
            case "circle":
                double f = scanner.nextDouble();
                System.out.println(f * f * pi);
                break;
            default:
                break;
        }
    }
}