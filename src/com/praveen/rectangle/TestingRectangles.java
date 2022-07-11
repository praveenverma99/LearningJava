package com.praveen.rectangle;

public class TestingRectangles {

    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(5, 5);
        Rectangle rectangleTwo = new Rectangle(5, 10);

        // Area using instance method
        System.out.println(rectangleOne.instanceArea());
        System.out.println(rectangleTwo.instanceArea());

        // Area using static method
        System.out.println(Rectangle.staticArea(rectangleOne));
        System.out.println(Rectangle.staticArea(rectangleTwo));
    }
}
