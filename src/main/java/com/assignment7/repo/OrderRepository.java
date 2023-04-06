package com.assignment7.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.assignment7.entities.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String>{

}
