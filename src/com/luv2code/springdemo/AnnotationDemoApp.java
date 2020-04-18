package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        //read the spring config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //get method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get the dailyFortune
        System.out.println(theCoach.getDailyFortune());
        //close the context
        context.close();
    }
}
