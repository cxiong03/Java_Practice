package com.codewithchang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(true) {
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}

// While loop are useful for when we Do Not know how many times we want to repeat something.
