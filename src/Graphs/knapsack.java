package Graphs;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;

    // Constructor
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class Knapsack {

    // Function to solve Fractional Knapsack Problem
    public static double getMaxValue(Item[] items, int capacity) {
        // Sort items by value/weight ratio in descending order
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item a, Item b) {
                double ratio1 = (double) a.value / a.weight;
                double ratio2 = (double) b.value / b.weight;
                return Double.compare(ratio2, ratio1);  // Descending order
            }
        });

        double totalValue = 0.0;
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                // Take the whole item
                currentWeight += item.weight;
                totalValue += item.value;
            } else {
                // Take fraction of the remaining capacity
                int remainingWeight = capacity - currentWeight;
                totalValue += item.value * ((double) remainingWeight / item.weight);
                break;  // Knapsack is full
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item(10, 2),
                new Item(5, 3),
                new Item(15, 5),
                new Item(7, 7),
                new Item(6, 1),
                new Item(18, 4),
                new Item(3, 1)
        };

        int capacity = 15;  // Knapsack capacity

        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}

