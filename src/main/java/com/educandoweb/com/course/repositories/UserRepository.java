package com.educandoweb.com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.com.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
