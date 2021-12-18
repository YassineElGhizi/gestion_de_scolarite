package com.example.demo.inscription;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription , InscriptionCompositeKey> {
    Optional<Inscription> findById(InscriptionCompositeKey id);
}
