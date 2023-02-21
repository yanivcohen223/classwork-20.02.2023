package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        IPlayer player1 = new GuitarPlayer("Jimi Hendrix", "PopRock");
        IPlayer player2 = new PianoPlayer("Elton John", "Pop");

        player1.play();
        player2.play();
    }
}