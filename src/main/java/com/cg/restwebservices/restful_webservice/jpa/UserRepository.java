package com.cg.restwebservices.restful_webservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.restwebservices.restful_webservice.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
