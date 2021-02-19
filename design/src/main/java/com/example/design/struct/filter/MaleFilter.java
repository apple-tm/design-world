package com.example.design.struct.filter;

import java.util.List;
import java.util.stream.Collectors;

public class MaleFilter implements Criteria {
    @Override
    public List<Person> filter(List<Person> personList) {
        return personList.stream().filter(e -> "MALE".equalsIgnoreCase(e.getGender())).collect(Collectors.toList());
    }
}
