package machine;

public enum Coffee {
    ESPRESSO(250, 0, 16, 4, 1),
    LATTE(350, 75, 20, 7, 2),
    CAPPUCCINO(200, 100, 12, 6, 3);

    int neededWater;
    int neededMilk;
    int neededBeans;
    int price;
    int choice;
    int cup = 1;

    Coffee(int neededWater, int neededMilk, int neededBeans, int price, int choice) {
        this.neededWater = neededWater;
        this.neededMilk = neededMilk;
        this.neededBeans = neededBeans;
        this.price = price;
        this.choice = choice;
    }
}
