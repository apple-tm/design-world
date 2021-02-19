package com.example.design.struct.filter;

import java.util.List;
import java.util.stream.Collectors;

public class SingleFilter implements Criteria {
    @Override
    public List<Person> filter(List<Person> personList) {
        return personList.stream().filter(e -> "SINGLE".equalsIgnoreCase(e.getStatus())).collect(Collectors.toList());
    }
}
