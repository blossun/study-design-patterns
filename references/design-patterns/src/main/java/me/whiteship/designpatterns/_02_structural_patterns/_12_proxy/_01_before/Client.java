package me.whiteship.designpatterns._02_structural_patterns._12_proxy._01_before;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}
