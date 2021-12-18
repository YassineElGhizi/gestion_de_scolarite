package com.example.demo.inscription;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@NoArgsConstructor
@Data
@Embeddable
public class InscriptionCompositeKey implements Serializable {
    String cne;
    Integer idfil;
}
