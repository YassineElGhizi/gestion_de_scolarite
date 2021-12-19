package com.example.demo.planning;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@NoArgsConstructor
@Embeddable
@Data
public class PlanningCompositeKey implements Serializable {
    Integer idfil;
    Integer idMod;
}
