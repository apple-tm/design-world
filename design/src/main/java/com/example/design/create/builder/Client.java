package com.example.design.create.builder;

public class Client {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal1 = mealBuilder.prepareNonVegBurger();

        meal1.showItems();

        System.out.println(meal1.getCost());

    }
}
