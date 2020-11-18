package org.example;

import org.example.shapes.Color;
import org.example.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

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


        System.out.println("\n");
        //get value from code

        System.out.println(" ColorCode: #000000 | " + "  |   Color: " + circle.getColor().valueOfColor("#000000"));
        System.out.println("----------------------------------------");
        System.out.println(" ColorCode: #FFFFFF | " + "  |   Color: " + circle.getColor().valueOfColor("#FFFFFF"));







    }
}
