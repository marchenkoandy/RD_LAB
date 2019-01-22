package com.company.lesson5;

/**
 * #Summary:
 * #Author: Andrii_Marchenko1
 * #Author’s Email:
 * #Creation Date: 1/15/2019
 * #Comments:
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Andy", "Mar", 10L, (byte) 5);
        Employee employee2 = new Employee("Andy", "Mar", 10L, (byte) 5);
//        System.out.println(employee1.getFirstName());
//        System.out.println("I created new employee with parameters: " + employee1.toString());


        employee1.display();
    }
}
