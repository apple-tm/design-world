package com.example.design.struct.filter;

import java.util.List;

public class AndCritetia implements Criteria {

    private Criteria criteriaA;
    private Criteria criteriaB;

    public AndCritetia(Criteria criteriaA, Criteria criteriaB) {
        this.criteriaA = criteriaA;
        this.criteriaB = criteriaB;
    }

    @Override
    public List<Person> filter(List<Person> personList) {
        List<Person> personListA = criteriaA.filter(personList);
        return criteriaB.filter(personListA);
    }
}
