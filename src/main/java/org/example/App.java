package org.example;

import org.example.shapes.Color;
import org.example.shapes.Shape;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        Shape circle = new Shape(14, Color.BLACK);
        Shape square = new Shape(13.2, Color.WHITE);

        System.out.println(" Color: " + circle.getColor() + "  |   ColorCode: " + circle.getColor().getCode());
        System.out.println("----------------------------------------");
        System.out.println(" Color: " + square.getColor() + "  |   ColorCode: " + square.getColor().getCode());





    }
}
