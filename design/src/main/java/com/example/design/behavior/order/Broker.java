package com.example.design.behavior.order;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        orderList.forEach(e -> e.execute());
        orderList.clear();
    }
}
