package com.kkworld.sre.tacocloud.repositorys;

import com.kkworld.sre.tacocloud.models.Order;

public interface OrderRepository {
    Order save(Order order);
}
