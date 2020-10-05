package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        String[] fruits = { "Apple", "Strawberry", "Orange" };

        // Using the forloop we can iterate from the end to the beginning
        for (int i = fruits.length; i > 0; i--)
            System.out.println(fruits[i]);

        // ForEach loops are used to iterate through arrays or collections but its limitation is it's always forward only
        for (String fruit : fruits)
            System.out.println(fruit);
    }
}

