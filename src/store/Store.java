package store;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private static class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        ArrayList<Item> listOfItems = new ArrayList<Item>();
        addItem(listOfItems);
    }

    public static void addItem(ArrayList<Item> listOfItems) {
        for (int i = 0; i < 2; i++) {
            System.out.println("ENTER NAME");
            Scanner addName = new Scanner(System.in);
            String name = (addName.nextLine());

            System.out.println("ENTER PRICE");
            Scanner addPrice = new Scanner(System.in);
            double price = (addPrice.nextDouble());

            listOfItems.add(new Item(name, price));
        }
        for (Item list : listOfItems) {
            System.out.println("NAME " + list.getName() + ", PRICE " + list.getPrice());
        }
    }
}