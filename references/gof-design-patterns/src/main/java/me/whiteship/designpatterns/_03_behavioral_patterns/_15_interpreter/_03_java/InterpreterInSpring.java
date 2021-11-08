package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._03_java;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class InterpreterInSpring {

    public static void main(String[] args) {
        Book book = new Book("spring");

        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("title");
        System.out.println(expression.getValue(book));
    }
}
