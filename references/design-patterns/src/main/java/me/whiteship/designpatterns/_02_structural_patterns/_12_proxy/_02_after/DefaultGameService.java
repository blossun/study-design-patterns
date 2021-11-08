package me.whiteship.designpatterns._02_structural_patterns._12_proxy._02_after;

public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("이 자리에 오신 여러분을 진심으로 환영합니다.");
    }
}
