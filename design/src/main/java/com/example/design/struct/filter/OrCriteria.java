package com.example.design.struct.filter;

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria criteriaA;
    private Criteria criteriaB;

    public OrCriteria(Criteria criteriaA, Criteria criteriaB) {
        this.criteriaA = criteriaA;
        this.criteriaB = criteriaB;
    }

    @Override
    public List<Person> filter(List<Person> personList) {
        List<Person> personListA = criteriaA.filter(personList);
        List<Person> personListB = criteriaB.filter(personList);

        for (Person person : personListB) {
            if (!personListA.contains(person)) {
                personListA.add(person);
            }
        }

        return personListA;
    }
}
