package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static <CalculatorService> void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        EntrenadorFutbol entrenadorF = (EntrenadorFutbol) context.getBean("entrenadorF");
        EntrenadorBaloncesto entrenadorB = (EntrenadorBaloncesto) context.getBean("entrenadorB");

        System.out.println(entrenadorF.Entrenamiento());
        System.out.println(entrenadorB.Entrenamiento());

    }
}