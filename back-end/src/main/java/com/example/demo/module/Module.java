package com.example.demo.module;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modules")
public class Module {
    @Id
    Integer idMod;
    String nom;

    public Module(Integer idMod, String nom) {
        this.idMod = idMod;
        this.nom = nom;
    }

    public Module() {
    }

    public Integer getIdMod() {
        return idMod;
    }

    public void setIdMod(Integer idMod) {
        this.idMod = idMod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Module{" +
                "idMod=" + idMod +
                ", nom='" + nom + '\'' +
                '}';
    }
}
