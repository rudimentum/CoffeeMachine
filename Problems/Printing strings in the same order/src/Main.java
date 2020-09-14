import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String words = "";
        for (int i = 0; i < 3; i++) {
            words += reader.readLine() + " ";
        }
        String[] arr = words.split("\\s");
        for (String i : arr) {
            System.out.println(i);
        }

        // use Scanner
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(scanner.next());
//        }
    }
}
