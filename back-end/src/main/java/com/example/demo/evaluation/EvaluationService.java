package com.example.demo.evaluation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EvaluationService {
    final EvaluationRepository evaluationRepository;

    @Autowired
    public EvaluationService(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
    }

    public void addEvaluation(Evaluation e){
        evaluationRepository.save(e);
    }

    public List<Evaluation> getEvaluations() {
        return evaluationRepository.findAll();
    }

    @Transactional
    public void updateEvaluation(EvaluationCompositeKey id, Float note) {
        Optional<Evaluation> e = evaluationRepository.findById(id);
        Evaluation ee = e.get();
        ee.setNote(note);
    }

    public void deleteEvaluation(EvaluationCompositeKey id) {
        evaluationRepository.deleteById(id);
    }
}
