package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._02_after;

import java.util.Map;

public class PlusExpression implements PostfixExpression {

    private PostfixExpression left;

    private PostfixExpression right;

    public PlusExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
}
