package com.praveen.rectangle;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int instanceArea() {
        return this.height * this.width;
    }

    public static int staticArea(Rectangle rectangle) {
        return rectangle.height * rectangle.width;
    }
}
