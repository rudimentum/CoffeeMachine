public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (Secret secret : Secret.values()) {
            String s = secret.toString();
            if (s.contains("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/
