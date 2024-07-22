package com.in28minutes.webservices.resfulwebsurvices.jpa;

import com.in28minutes.webservices.resfulwebsurvices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
