package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cat Garfild = new Cat("Garfild");
        Dog Rexy = new Dog("Rexy");
        Dog Graff = new Dog("Graff");
        BigDog Rex = new BigDog("Rex");
        BigDog Clifford = new BigDog("Clifford");

        Garfild.greets();
        Rexy.greets();
        Rexy.greets(Graff);
        Rex.greets();
        Rex.greets(Graff);
        Clifford.greets(Rex);
        Rex.greets(Clifford);
    }
}