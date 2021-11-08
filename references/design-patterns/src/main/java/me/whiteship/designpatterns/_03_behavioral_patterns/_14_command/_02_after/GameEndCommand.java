package me.whiteship.designpatterns._03_behavioral_patterns._14_command._02_after;

import me.whiteship.designpatterns._03_behavioral_patterns._14_command._01_before.Game;

public class GameEndCommand implements Command {

    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.end();
    }

    @Override
    public void undo() {
        new GameStartCommand(this.game).execute();
    }
}
