package com.company.lesson6;

import java.util.ArrayList;

/**
 * #Summary:
 * #Author: Andrii_Marchenko1
 * #Author’s Email:
 * #Creation Date: 1/17/2019
 * #Comments:
 */
public class Main {
    public static void main(String[] args) {
//        Bird swallow = new Bird();
//        Plane to154 = new Plane();
//        FlyingFish fish = new FlyingFish();
//
//        ArrayList<Flyable> flyers = new ArrayList<>();
//        flyers.add(swallow);
//        flyers.add(to154);
//        flyers.add(fish);
//        for (Flyable entity : flyers) {
//            entity.sleep();
//        }
//
//        ArrayList<Eatable> eatables = new ArrayList<>();
//        eatables.add(fish);
//        eatables.add(swallow);
//        for (Eatable entity : eatables) {
//            entity.eat();
//        }
//
//        printSeason(Season.WINTER);
//
//        System.out.println(SeasonRu.December.toString());



        SeasonComplicated seasonComplicated = SeasonComplicated.January;
        System.out.println(seasonComplicated.getDays());
        System.out.println(seasonComplicated.getNameRu());
        System.out.println(seasonComplicated.getNameUa());
        System.out.println(seasonComplicated.getSeason());

    }

    public static void printSeason(Season season){
        switch (season){
            case WINTER:
                System.out.println("The winter is coming...");
                break;
            case SPRING:
                System.out.println("The spring is coming...");
                break;
            case SUMMER:
                System.out.println("The summer is coming...");
                break;
            case AUTUMN:
                System.out.println("The autumn is coming...");
                break;
        }
    }
}
