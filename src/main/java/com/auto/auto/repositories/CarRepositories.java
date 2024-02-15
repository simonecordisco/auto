package com.auto.auto.repositories;

import com.auto.auto.entities.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepositories extends JpaRepository<Cars, Long> {
}
