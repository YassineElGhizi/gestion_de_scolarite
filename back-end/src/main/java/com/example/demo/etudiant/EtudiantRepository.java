package com.example.demo.etudiant;

import com.example.demo.inscription.Inscription;
import com.example.demo.inscription.InscriptionCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant , String> {
    Optional<Etudiant> findByCne(String cne);
}
