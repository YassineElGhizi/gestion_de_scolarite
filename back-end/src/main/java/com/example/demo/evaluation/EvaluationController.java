package com.example.demo.evaluation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/evaluation")
public class EvaluationController {
    final EvaluationService evaluationService;

    @Autowired
    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @PostMapping
    public void addEvaluation(@RequestBody Evaluation e){evaluationService.addEvaluation(e);}
    @GetMapping
    public List<Evaluation> getEvaluations(){return evaluationService.getEvaluations();}
    @PutMapping
    public void updateEvaluation(@RequestBody Evaluation e){evaluationService.updateEvaluation(e.id , e.Note);}
    @DeleteMapping
    public void deleteEvaluation(@RequestBody EvaluationCompositeKey id){ evaluationService.deleteEvaluation(id);}
}
