package com.example.demo.filier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilierRepository extends JpaRepository<Filier , Integer> {
    Filier findByIdfil(Integer idfil);
}
