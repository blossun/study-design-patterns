package me.whiteship.designpatterns._02_structural_patterns._10_facade._03_java;

import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.transaction.PlatformTransactionManager;

public class FacadeInSpring {

    public static void main(String[] args) {
        MailSender mailSender = new JavaMailSenderImpl();

        PlatformTransactionManager platformTransactionManager = new JdbcTransactionManager();
    }
}
