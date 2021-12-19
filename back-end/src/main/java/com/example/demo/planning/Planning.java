package com.example.demo.planning;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "plannings")
public class Planning {
    @EmbeddedId
    PlanningCompositeKey id;
    Integer niveau;

    public Planning(PlanningCompositeKey id, Integer niveau) {
        this.id = id;
        this.niveau = niveau;
    }

    public Planning() {
    }

    public PlanningCompositeKey getId() {
        return id;
    }

    public void setId(PlanningCompositeKey id) {
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
        return "Planning{" +
                "id=" + id +
                ", niveau=" + niveau +
                '}';
    }
}
