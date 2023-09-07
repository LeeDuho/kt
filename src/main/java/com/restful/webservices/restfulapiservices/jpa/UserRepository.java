package com.restful.webservices.restfulapiservices.jpa;

import com.restful.webservices.restfulapiservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
