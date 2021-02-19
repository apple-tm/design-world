package com.example.design.struct.filter;

import java.util.List;

public interface Criteria {

    List<Person> filter(List<Person> personList);
}
