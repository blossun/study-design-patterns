package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._03_java;

import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.cache.CacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

public class StrategyInSpring {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext();
        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext();

        BeanDefinitionParser parser;

        PlatformTransactionManager platformTransactionManager;

        CacheManager cacheManager;
    }
}
