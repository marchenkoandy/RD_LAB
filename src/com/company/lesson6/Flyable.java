package com.company.lesson6;

/**
 * #Summary:
 * #Author: Andrii_Marchenko1
 * #Author’s Email:
 * #Creation Date: 1/17/2019
 * #Comments:
 */
public interface Flyable {
    void run();

    void fly();

    default void sleep() {
        System.out.println("Sleep");
        run();
        fly();
    }
}
