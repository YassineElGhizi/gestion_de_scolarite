package com.example.demo.module;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<Module , Integer> {
    Module findByIdMod(Integer idMod);
}
