package me.whiteship.designpatterns._02_structural_patterns._07_bridge._02_after;

import me.whiteship.designpatterns._02_structural_patterns._07_bridge._01_before.Champion;

public abstract class App implements Champion {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.skillW();
    }
}
