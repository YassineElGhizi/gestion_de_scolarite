package com.example.demo.filier;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="filiers")
public class Filier {
    @Id
    Integer idfil;
    String intitule;

    public Filier(Integer idfil, String intitule) {
        this.idfil = idfil;
        this.intitule = intitule;
    }

    public Filier() {
    }

    public Integer getId_fil() {
        return idfil;
    }

    public void setId_fil(Integer idfil) {
        this.idfil = idfil;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }


    @Override
    public String toString() {
        return "Filier{" +
                "idfil=" + idfil +
                ", intitule='" + intitule + '\'' +
                '}';
    }
}
