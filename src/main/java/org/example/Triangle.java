package org.example;

public class Triangle implements GodShape {


    @Override
    public void getArea() {
        System.out.println("Area from Triangle");
    }

    @Override
    public void simplePresentation() {
        System.out.println("I am a simple Triangle");
    }
}
