package com.example.demo.etudiant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant , String> {
    Etudiant findEtudiantByCne(String cne);
    void deleteByCne(String cne);
}
