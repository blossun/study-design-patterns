package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._02_after;

public class Circle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
