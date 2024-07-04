package com.example.utility.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.utility.dao.Consumer;

public interface consumerRepo extends JpaRepository<Consumer, Integer>{

	Optional<Consumer> findByMeterId(String meterId);

}
