import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int temp;
        while ((temp = scanner.nextInt()) != 0) {
            list.add(temp);
        }
        // one of them must stay zero
        int ascendSorted = 0;
        int descendSorted = 0;
        boolean flag = true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) <= list.get(i)) {
                ascendSorted++;
            } else if (list.get(i - 1) >= list.get(i)) {
                descendSorted++;
            }
            if (ascendSorted != 0 && descendSorted != 0) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}