package com.food.ordering.system.order.service.domain.ports.output.repository;

import com.food.ordering.system.order.service.domain.entity.Restaurant;

public interface RestaurantRepository {

    void findRestaurantInformation(Restaurant restaurant);

}
