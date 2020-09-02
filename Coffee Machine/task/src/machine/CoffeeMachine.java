package machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeMachine {
    public static void main(String[] args) {
        int water = 200;
        int milk = 50;
        int beans = 15;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write how many cups of coffee you will need:");
        System.out.println("> ");
        try {
            Integer countofCups = Integer.parseInt(reader.readLine());
            System.out.println("For " + countofCups + " cups of coffee you will need:");
            System.out.println(water*countofCups + " ml of water");
            System.out.println(milk*countofCups + " ml of milk");
            System.out.println(beans*countofCups + " g of coffee beans");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
