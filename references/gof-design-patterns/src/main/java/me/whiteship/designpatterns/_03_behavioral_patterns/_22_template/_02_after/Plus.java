package me.whiteship.designpatterns._03_behavioral_patterns._22_template._02_after;

public class Plus implements Operator {
    @Override
    public int getResult(int result, int number) {
        return result += number;
    }
}
