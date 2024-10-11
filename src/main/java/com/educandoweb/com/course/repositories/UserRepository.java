package com.educandoweb.com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.com.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
