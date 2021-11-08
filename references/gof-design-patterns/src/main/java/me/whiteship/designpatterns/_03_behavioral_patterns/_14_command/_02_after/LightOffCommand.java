package me.whiteship.designpatterns._03_behavioral_patterns._14_command._02_after;

import me.whiteship.designpatterns._03_behavioral_patterns._14_command._01_before.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        new LightOnCommand(this.light).execute();
    }
}
