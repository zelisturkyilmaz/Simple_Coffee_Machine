import java.util.*;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hasWater = 400;
        int hasMilk = 540;
        int hasCoffeeBeans = 120;
        int hasCups = 9;
        int hasMoney = 550;
        boolean isAlive = true;
        while (isAlive) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String choice = scanner.next();
            switch (choice) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String choice2 = scanner.next();
                    switch (choice2) {
                        case "1":
                            if (hasWater < 250 || hasCoffeeBeans < 16 || hasCups < 1) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                hasWater -= 250;
                                hasCoffeeBeans -= 16;
                                hasCups -= 1;
                                hasMoney += 4;
                            }
                            break;
                        case "2":
                            if (hasWater < 350 || hasMilk < 75 || hasCoffeeBeans < 20 || hasCups < 1) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                hasWater -= 350;
                                hasMilk -= 75;
                                hasCoffeeBeans -= 20;
                                hasCups -= 1;
                                hasMoney += 7;
                            }
                            break;
                        case "3":
                            if (hasWater < 200 || hasMilk < 100 || hasCoffeeBeans < 12 || hasCups < 1) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                hasWater -= 200;
                                hasMilk -= 100;
                                hasCoffeeBeans -= 12;
                                hasCups -= 1;
                                hasMoney += 6;
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int addWater = scanner.nextInt();
                    hasWater += addWater;
                    System.out.println("Write how many ml of milk do you want to add:");
                    int addMilk = scanner.nextInt();
                    hasMilk += addMilk;
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int addBeans = scanner.nextInt();
                    hasCoffeeBeans += addBeans;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int addCups = scanner.nextInt();
                    hasCups += addCups;
                    break;
                case "take":
                    System.out.println("I gave you $" + hasMoney);
                    hasMoney = 0;
                    break;
                case "remaining":
                    coffeeMachineHas(hasWater, hasMilk, hasCoffeeBeans, hasCups, hasMoney);
                    break;
                case "exit":
                    isAlive = false;
                    break;
            }
        }
    }

    public static void coffeeMachineHas(int hasWater, int hasMilk, int hasCoffeeBeans, int hasCups, int hasMoney) {
        System.out.println("The coffee machine has:");
        System.out.println(hasWater + " of water");
        System.out.println(hasMilk + " of milk");
        System.out.println(hasCoffeeBeans + " of coffee beans");
        System.out.println(hasCups + " of disposable cups");
        System.out.println(hasMoney + " of money");
    }
}