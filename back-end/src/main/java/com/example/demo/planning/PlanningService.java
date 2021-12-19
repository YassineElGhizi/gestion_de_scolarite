package com.example.demo.planning;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PlanningService {
    final PlanningRepository planningRepository;
    @Autowired
    public PlanningService(PlanningRepository planningRepository) {
        this.planningRepository = planningRepository;
    }

    public void addPlanning(Planning p){ planningRepository.save(p);}

    public List<Planning> getPlannings() {
        return planningRepository.findAll();
    }

    public void deletePlasnning(PlanningCompositeKey id) {
        planningRepository.deleteById(id);
    }

    @Transactional
    public void updatePlanning(PlanningCompositeKey id , Integer niveau){
        Optional<Planning> p = planningRepository.findById(id);
        Planning pp = p.get();
        System.out.println("pp =" + pp);
        pp.setNiveau(niveau);
    }

}
