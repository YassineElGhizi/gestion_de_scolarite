package com.example.demo.inscription;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class InscriptionService {
    final InscriptionRepository inscriptionRepository;

    @Autowired
    public InscriptionService(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }

    public void addInscription(Inscription i){ inscriptionRepository.save(i);}

    public List<Inscription> getInscriptions() {
        return inscriptionRepository.findAll();
    }

    public void deleteInscription(InscriptionCompositeKey id) {
        inscriptionRepository.deleteById(id);
    }

    @Transactional
    public void updateInscription(InscriptionCompositeKey id , Integer niveau){
        Optional<Inscription> in = inscriptionRepository.findById(id);
        Inscription inn = in.get();
        inn.setNiveau(niveau);
    }
}
