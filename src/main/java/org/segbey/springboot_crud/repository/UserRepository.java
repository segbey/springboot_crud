package org.segbey.springboot_crud.repository;

import org.segbey.springboot_crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
