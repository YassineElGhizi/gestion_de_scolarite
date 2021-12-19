package com.example.demo.evaluation;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@Data
public class EvaluationCompositeKey implements Serializable {
    String cne;
    Integer idMod;
}
