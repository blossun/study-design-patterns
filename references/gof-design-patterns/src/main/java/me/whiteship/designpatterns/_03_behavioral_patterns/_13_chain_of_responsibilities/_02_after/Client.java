package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._02_after;

import me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._01_before.Request;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기입니다.");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}
