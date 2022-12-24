package com.capstonefoodbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstonefoodbox.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
