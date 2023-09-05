package com.pkg1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");

        // Get the first Student bean (setter injection)
        Student studentSetter = (Student) context.getBean("studentSetter");
        studentSetter.Calculate();

        // Get the second Student bean (constructor injection)
        Student studentConstructor = (Student) context.getBean("studentConstructor");

        // Print the student details
        System.out.println("Student with Setter Injection: " + studentSetter);
        System.out.println("Student with Constructor Injection: " + studentConstructor);
    }
}
