package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MovablePoint newMove = new MovablePoint(10,20,30,40);

        System.out.println(newMove);

        newMove.moveUp();
        System.out.println(newMove);

        newMove.moveLeft();
        System.out.println(newMove);
    }
}