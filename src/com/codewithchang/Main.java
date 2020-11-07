package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        UIControl control = new TextBox();
        control.disable();
        System.out.println(control.isEnabled());
    }
}

