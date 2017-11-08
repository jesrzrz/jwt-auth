package es.jr.spring.jwt.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jr.spring.jwt.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
