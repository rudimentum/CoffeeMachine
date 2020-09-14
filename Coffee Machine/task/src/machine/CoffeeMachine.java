package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int currentWater = 400;
    public static int currentMilk = 540;
    public static int currentBeans = 120;
    public static int currentCups = 9;
    public static int currentMoney = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                break;
            }
            menu(line);
        }
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
            case "remaining":
                printSupplies();
                break;
        }
    }

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

        int neededWater = 0;
        int neededMilk = 0;
        int neededBeans = 0;
        int neededCup = 1;
        int price = 0;
        switch (scanner.next()) {
            case "1":
                neededWater = 250;
                neededBeans = 16;
                price = 4;
                break;
            case "2":
                neededWater = 350;
                neededMilk = 75;
                neededBeans = 20;
                price = 7;
                break;
            case "3":
                neededWater = 200;
                neededMilk = 100;
                neededBeans = 12;
                price = 6;
                break;
            case "back":
                return;
        }
        if (currentWater >= neededWater &&
                currentMilk >= neededMilk &&
                currentBeans >= neededBeans) {
            changeSupplies(-neededWater, -neededMilk, -neededBeans, -neededCup, price);
        } else {
            if (currentWater < neededBeans) {
                System.out.println("Sorry, not enough water!");
            } else if (currentMilk < neededMilk) {
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
        System.out.println("Write how many ml of water do you want to add:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int beans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cups = scanner.nextInt();
        changeSupplies(water, milk, beans, cups, 0);
    }
}
