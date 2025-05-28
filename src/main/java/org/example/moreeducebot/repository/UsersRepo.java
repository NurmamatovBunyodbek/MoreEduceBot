package org.example.moreeducebot.repository;

import org.example.moreeducebot.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users , Long> {

}
