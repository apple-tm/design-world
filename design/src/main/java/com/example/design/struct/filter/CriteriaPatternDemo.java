package com.example.design.struct.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new MaleFilter();
        Criteria female = new FemaleFilter();
        Criteria single = new SingleFilter();
        Criteria singleMale = new AndCritetia(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);
        printPersons(singleMale.filter(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getStatus()
                    +" ]");
        }
    }
}
