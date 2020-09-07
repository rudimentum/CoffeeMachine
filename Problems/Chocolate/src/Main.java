import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        int width = Integer.parseInt(reader.readLine());
        int segments = Integer.parseInt(reader.readLine());
        if (width * length >= segments && (segments % length == 0 || segments % width == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}