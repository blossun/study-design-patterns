package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._02_after;

import java.util.Collections;
import java.util.Comparator;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Fastest());
        game.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("blue light");
            }

            @Override
            public void redLight() {
                System.out.println("red light");
            }
        });
    }
}
