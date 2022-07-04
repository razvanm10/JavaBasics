package org.example;

public class Circle implements GodShape {


    @Override
    public void getArea() {
        System.out.println("Area Circle");
    }

    @Override
    public void simplePresentation() {
        System.out.println("I am a simple circle");
    }
}
