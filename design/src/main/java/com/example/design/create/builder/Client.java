package com.example.design.create.builder;

/**
 * 应用实例： 1、去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，
 * 而其组合是经常变化的，生成出所谓的"套餐"。 2、JAVA 中的 StringBuilder。
 */
public class Client {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal1 = mealBuilder.prepareNonVegBurger();

        meal1.showItems();

        System.out.println(meal1.getCost());

    }
}
