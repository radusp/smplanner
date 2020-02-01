package com.kubec.SMPlanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kubec.SMPlanner.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
