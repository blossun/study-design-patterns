package me.whiteship.designpatterns._02_structural_patterns._09_decorator._03_java;

import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {

    public static void main(String[] args) {
        // Collections가 제공하는 데코레이터 메소드
        ArrayList list = new ArrayList<>();
        list.add(new Book());

        List books = Collections.checkedList(list, Book.class);


//        books.add(new Item());

        List unmodifiableList = Collections.unmodifiableList(list);
        list.add(new Item());
        unmodifiableList.add(new Book());


        // 서블릿 요청 또는 응답 랩퍼
        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;
    }

    private static class Book {

    }

    private static class Item {

    }
}
