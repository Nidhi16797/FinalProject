package com.capstonefoodbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstonefoodbox.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, String>{

	Admin findByusername(String username);

}
