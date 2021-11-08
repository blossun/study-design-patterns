package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._02_after;

import me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._01_before.Request;

public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
