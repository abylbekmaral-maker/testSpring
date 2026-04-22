package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld h1 = (HelloWorld) context.getBean("helloWorld");
        HelloWorld h2 = (HelloWorld) context.getBean("helloWorld");

        Cat cat1 = (Cat) context.getBean("cat");
        Cat cat2 = (Cat) context.getBean("cat");

        System.out.println(h1 == h2);
        System.out.println(cat1 == cat2);

        context.close();
    }
}
