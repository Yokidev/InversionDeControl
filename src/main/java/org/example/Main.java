package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static <CalculatorService> void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Entrenador entrenadorF = (EntrenadorFutbol) context.getBean("entrenadorF");
        Entrenador entrenadorB = (EntrenadorBaloncesto) context.getBean("entrenadorB");
        Entrenador entrenadorT = (EntrenadorTenis) context.getBean("entrenadorT");

        System.out.println(entrenadorF.Entrenamiento());
        System.out.println(entrenadorB.Entrenamiento());
        System.out.println(entrenadorT.Entrenamiento());
        System.out.println(entrenadorT.getEquipo());
        System.out.println(entrenadorT.getEmail());


    }
}