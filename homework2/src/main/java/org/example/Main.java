package org.example;

public class Main {
    private static void startMusicShow(Player somePlayer) {
        somePlayer.play();
        if (somePlayer instanceof GuitarPlayer){
            ((GuitarPlayer) somePlayer).rockAndRoll();
        }
        else {
            ((PianoPlayer) somePlayer).playJazz();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Player player1 = new GuitarPlayer("Jimi Hendrix", "PopRock");
        Player player2 = new PianoPlayer("Elton John", "Pop");


        startMusicShow(player1);
        System.out.println("");
        startMusicShow(player2);

    }


}