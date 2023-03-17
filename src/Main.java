import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TimsItem[] timsitem = new TimsItem[100];

        Scanner sc = new Scanner(System.in);
        double total = 0;
        System.out.println(" 1.Tim Merchendise \n 2.Tims Consumables \n 3.Done Ordering");
        for (int i = 0; i < timsitem.length; i++) {
            int choose_option = sc.nextInt();
            switch (choose_option) {
                case 1: {
                    timsitem[i] = new Mugs();
                    System.out.println("1. " + timsitem[i].getClass().getName());
                    timsitem[i] = new CoffePowder();
                    System.out.println("2. " + timsitem[i].getClass().getName());
                    timsitem[i] = new HockeyCards();
                    System.out.println("3. " + timsitem[i].getClass().getName());
                    timsitem[i] = new GiftCards();
                    System.out.println("4. " + timsitem[i].getClass().getName());
                    int get_data = sc.nextInt();
                    switch (get_data) {
                        case 1:
                            timsitem[i] = new Mugs();
                            System.out.println("Name: " + timsitem[i].getClass().getName());
                            System.out.println("Features: " + timsitem[i].toString());
                            System.out.println("Price: " + timsitem[i].getPrice());
                            System.out.println(" 1. Order this \n 2. Choose again");
                            break;
                        case 2:
                            timsitem[i] = new CoffePowder();
                            System.out.println("Name: " + timsitem[i].getClass().getName());
                            System.out.println("Features: " + timsitem[i].toString());
                            System.out.println("Price: " + timsitem[i].getPrice());
                            System.out.println(" 1. Order this \n 2. Choose again");
                            break;
                        case 3:
                            timsitem[i] = new HockeyCards();
                            System.out.println("Name: " + timsitem[i].getClass().getName());
                            System.out.println("Features: " + timsitem[i].toString());
                            System.out.println("Price: " + timsitem[i].getPrice());
                            System.out.println(" 1. Order this \n 2. Choose again");
                            break;
                        case 4:
                            timsitem[i] = new GiftCards();
                            System.out.println("Name: " + timsitem[i].getClass().getName());
                            System.out.println("Features: " + timsitem[i].toString());
                            System.out.println("Price: " + timsitem[i].getPrice());
                            System.out.println(" 1. Order this \n 2. Choose again");
                            break;
                    }
                    int numbers = sc.nextInt();
                    switch (numbers) {
                        case 1:
                            total = total + timsitem[i].getPrice();
                            System.out.println(total);
                            System.out.println(" 1.Tim Merchendise \n 2.Tims Consumables \n 3.Done Ordering");
                            break;
                        case 2:
                            System.out.println(" 1.Tim Merchendise \n 2.Tims Consumables \n 3.Done Ordering");
                            break;
                    }
                    break;
                }
                case 2:
                    timsitem[i] = new Donut();
                    System.out.println("1. " + timsitem[i].getClass().getName());
                    timsitem[i] = new Bagel();
                    System.out.println("2. " + timsitem[i].getClass().getName());
                    timsitem[i] = new Coffee();
                    System.out.println("3. " + timsitem[i].getClass().getName());
                    timsitem[i] = new Wrap();
                    System.out.println("4. " + timsitem[i].getClass().getName());
                    timsitem[i] = new Sandwich();
                    System.out.println("5. " + timsitem[i].getClass().getName());
                    int get_data = sc.nextInt();
                    switch (get_data) {
                        case 1:
                            timsitem[i] = new Donut();
                            System.out.println("Name: " + timsitem[i].getClass().getName());
                            System.out.println("Calories: " + timsitem[i].toString());
                            System.out.println("Price: " + timsitem[i].getPrice());
                            System.out.println(" 1. Order this \n 2. Choose again");
                            break;
                        case 2:
                            timsitem[i] = new Bagel();
                            System.out.println("Name: " + timsitem[i].getClass().getName());
                            System.out.println("Calories: " + timsitem[i].toString());
                            System.out.println("Price: " + timsitem[i].getPrice());
                            System.out.println(" 1. Order this \n 2. Choose again");
                            break;
                        case 3:
                            timsitem[i] = new Coffee();
                            System.out.println("Name: " + timsitem[i].getClass().getName());
                            System.out.println("Calories: " + timsitem[i].toString());
                            System.out.println("Price: " + timsitem[i].getPrice());
                            System.out.println(" 1. Order this \n 2. Choose again");
                            break;
                        case 4:
                            timsitem[i] = new Wrap();
                            System.out.println("Name: " + timsitem[i].getClass().getName());
                            System.out.println("Calories: " + timsitem[i].toString());
                            System.out.println("Price: " + timsitem[i].getPrice());
                            System.out.println(" 1. Order this \n 2. Choose again");
                            break;
                        case 5:
                            timsitem[i] = new Sandwich();
                            System.out.println("Name: " + timsitem[i].getClass().getName());
                            System.out.println("Calories: " + timsitem[i].toString());
                            System.out.println("Price: " + timsitem[i].getPrice());
                            System.out.println(" 1. Order this \n 2. Choose again");
                            break;
                    }
                        int numbers = sc.nextInt();
                        switch (numbers) {
                            case 1:
                                total = total + timsitem[i].getPrice();
                                System.out.println(total);
                                System.out.println(" 1.Tim Merchendise \n 2.Tims Consumables \n 3.Done Ordering");
                                break;
                            case 2:
                                System.out.println(" 1.Tim Merchendise \n 2.Tims Consumables \n 3.Done Ordering");
                                break;
                        }
                        break;
                case 3:
                    System.out.println("****************");
                    System.out.println("Total item ordered");
                    System.out.println("****************");
                  System.out.println("Total is CAD$ " + total);
                    }
            }
        }
    }

