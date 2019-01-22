package com.company.lesson6;

import java.util.List;

/**
 * #Summary:
 * #Author: Andrii_Marchenko1
 * #Author’s Email:
 * #Creation Date: 1/17/2019
 * #Comments:
 */
public class Bird implements Flyable,Eatable {
    private List<String> wing;
    private String tail;

    @Override
    public void run() {
        System.out.println("The Bird is running.");
    }

    @Override
    public void fly() {
        System.out.println("The Bird is flying.");
    }

    @Override
    public void eat() {
        System.out.println("The Bird is eating.");
    }
}
