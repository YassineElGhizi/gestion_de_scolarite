package com.example.demo.inscription;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "inscriptions")
public class Inscription implements Serializable {
    @EmbeddedId
    InscriptionCompositeKey id;
    Integer niveau;

    public Inscription(InscriptionCompositeKey id, Integer niveau) {
        this.id = id;
        this.niveau = niveau;
    }

    public Inscription() {
    }

    public InscriptionCompositeKey getId() {
        return id;
    }

    public void setId(InscriptionCompositeKey id) {
        this.id = id;
    }

    public Integer getNiveau() {
        return niveau;
    }

    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "Inscription{" +
                "id=" + id +
                ", niveau=" + niveau +
                '}';
    }
}
