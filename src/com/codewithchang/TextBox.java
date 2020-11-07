package com.codewithchang;

public class TextBox extends UIControl{
    private String text = ""; // Field

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
