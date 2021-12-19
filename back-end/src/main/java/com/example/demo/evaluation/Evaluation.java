package com.example.demo.evaluation;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "evaluations")
public class Evaluation {
    @EmbeddedId
    EvaluationCompositeKey id;
    Integer Note;

    public Evaluation(EvaluationCompositeKey id, Integer note) {
        this.id = id;
        Note = note;
    }

    public Evaluation() {
    }

    public EvaluationCompositeKey getId() {
        return id;
    }

    public void setId(EvaluationCompositeKey id) {
        this.id = id;
    }

    public Integer getNote() {
        return Note;
    }

    public void setNote(Integer note) {
        Note = note;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "id=" + id +
                ", Note=" + Note +
                '}';
    }
}
