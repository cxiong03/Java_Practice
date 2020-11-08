package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        UIControl control = new UIControl(true);
        TextBox textBox = new TextBox();
        show(textBox);
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            TextBox textBox = (TextBox) control; // Downcasting
            textBox.setText("Hello Chang");
        }
        System.out.println(control);
    }
}

