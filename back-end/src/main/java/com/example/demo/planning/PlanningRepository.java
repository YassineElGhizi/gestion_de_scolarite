package com.example.demo.planning;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlanningRepository extends JpaRepository<Planning , PlanningCompositeKey> {
    Optional<Planning> findById(PlanningCompositeKey id);
}
