package machine;

import java.io.IOException;
import java.util.Scanner;

public class CoffeeMachine {
    public static int currentWater = 400;
    public static int currentMilk = 540;
    public static int currentBeans = 120;
    public static int currentCups = 9;
    public static int currentMoney = 550;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        supplies(0,0,0,0,0);
        System.out.println("Write action (buy, fill, take):");
        menu(scanner.nextLine());
    }

    public static void menu(String action) {
        switch (action) {
            case "buy":
                buyCoffee();
                break;
            case "fill":
                fillSupplies();
                break;
            case "take":
                takeMoney();
                break;
        }
    }

    public static void supplies(int water, int milk, int beans, int cups, int money) {
        currentWater += water;
        currentMilk += milk;
        currentBeans += beans;
        currentCups += cups;
        currentMoney += money;
        System.out.println("The coffee machine has:");
        System.out.println(currentWater + " of water");
        System.out.println(currentMilk + " of milk");
        System.out.println(currentBeans + " of coffee beans");
        System.out.println(currentCups + " of disposable cups");
        System.out.println(currentMoney + " of money");
    }

    public static void buyCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int coffee = scanner.nextInt();
        switch (coffee) {
            case 1:
                supplies(-250, -0, -16, -1, 4);
                break;
            case 2:
                supplies(-350, -75, -20, -1, 7);
                break;
            case 3:
                supplies(-200, -100, -12, -1, 6);
                break;
        }
    }

    public static void takeMoney() {
        System.out.println("I gave you $" + currentMoney);
        supplies(0,0,0,0, -currentMoney);
    }

    public static void fillSupplies() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int beans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cups = scanner.nextInt();
        supplies(water, milk, beans, cups, 0);
    }
}
