import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine().toUpperCase();
            System.out.println(line.charAt(0) == 'J');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}