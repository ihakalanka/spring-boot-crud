package com.akalanka.springbootcrud.repository;

import com.akalanka.springbootcrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
