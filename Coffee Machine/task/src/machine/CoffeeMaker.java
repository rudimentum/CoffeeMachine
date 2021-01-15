package machine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeeMaker {
    static int currentWater = 400;
    static int currentMilk = 540;
    static int currentBeans = 120;
    static int currentCups = 9;
    static int currentMoney = 550;


    public static void printSupplies() {
        System.out.println("The coffee machine has:");
        System.out.println(currentWater + " of water");
        System.out.println(currentMilk + " of milk");
        System.out.println(currentBeans + " of coffee beans");
        System.out.println(currentCups + " of disposable cups");
        System.out.println("$" + currentMoney + " of money");
    }

    public static void changeSupplies(int water, int milk, int beans, int cups, int money) {
        currentWater += water;
        currentMilk += milk;
        currentBeans += beans;
        currentCups += cups;
        currentMoney += money;
    }

    public static void buyCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        Coffee coffee;
        switch (scanner.next()) {
            case "1":
                coffee = Coffee.ESPRESSO;
                break;
            case "2":
                coffee = Coffee.LATTE;
                break;
            case "3":
                coffee = Coffee.CAPPUCCINO;
                break;
            case "back":
                return;
            default:
                System.out.println("Invalid input! Use integers!");
                return;
        }

        if (currentWater >= coffee.neededWater &&
                currentMilk >= coffee.neededMilk &&
                currentBeans >= coffee.neededBeans) {
            changeSupplies(-coffee.neededWater, -coffee.neededMilk, -coffee.neededBeans, -coffee.cup, coffee.price);
        } else {
            if (currentWater < coffee.neededBeans) {
                System.out.println("Sorry, not enough water!");
            } else if (currentMilk < coffee.neededMilk) {
                System.out.println("Sorry, not enough milk!");
            } else {
                System.out.println("Sorry, not enough coffee beans!");
            }
        }
    }

    public static void takeMoney() {
        System.out.println("I gave you $" + currentMoney);
        changeSupplies(0,0,0,0, -currentMoney);
    }

    public static void fillSupplies() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Write how many ml of water do you want to add:");
            int water = scanner.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            int milk = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add:");
            int beans = scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add:");
            int cups = scanner.nextInt();
            changeSupplies(water, milk, beans, cups, 0);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Use integers!");
        }
    }
}
