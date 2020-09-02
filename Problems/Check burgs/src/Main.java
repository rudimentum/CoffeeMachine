import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String substring = "burg";
        try {
            String city = reader.readLine();
            System.out.println(city.endsWith(substring));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}