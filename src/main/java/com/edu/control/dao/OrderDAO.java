package com.edu.control.dao;

import com.edu.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDAO extends JpaRepository<Order, Long>{

    List<Order> getOrdersByUserId(Long id);

}
