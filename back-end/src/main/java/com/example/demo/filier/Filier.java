package com.example.demo.filier;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="filiers")
public class Filier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
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
