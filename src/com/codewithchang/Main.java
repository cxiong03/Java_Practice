package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        TextBox box1 = new TextBox();
        TextBox box2 = box1;
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
        System.out.println(box1.equals(box2)); // Hash code are use to compare object for equality
    }
}

