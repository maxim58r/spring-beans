package ru.max;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ru.max\\context.xml");

        IndependentMessageRenderer renderer = context.getBean(IndependentMessageRenderer.class);// second variant

//        MessageRenderer renderer = (MessageRenderer) context.getBean("renderer"); // first variant
        renderer.print();
    }
}
