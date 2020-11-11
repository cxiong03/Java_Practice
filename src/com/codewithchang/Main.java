package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        UIControl[] controls = { new UIControl(),new TextBox(), new CheckBox() };
        for (UIControl control : controls)
            control.render();
    }
}

