package machine;

import java.util.Scanner;

public class CoffeeMachine {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        String line = scanner.nextLine();
                        switch (line) {
                                case "buy":
                                        CoffeeMaker.buyCoffee();
                                        break;
                                case "fill":
                                        CoffeeMaker.fillSupplies();
                                        break;
                                case "take":
                                        CoffeeMaker.takeMoney();
                                        break;
                                case "remaining":
                                        CoffeeMaker.printSupplies();
                                        break;
                                case "exit":
                                        return;
                        }
                }
        }
}