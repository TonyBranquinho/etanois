package com.example.meVirando.etanois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.meVirando.etanois.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
