package com.example.demo.planning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/planning")
public class PlanningController {
    final PlanningService planningService;
    @Autowired
    public PlanningController(PlanningService planningService) {
        this.planningService = planningService;
    }

    @PostMapping
    public void addPlanning(@RequestBody Planning p){
        planningService.addPlanning(p);
    }

    @GetMapping
    public List<Planning> getPlannings(){
        return planningService.getPlannings();
    }

    @DeleteMapping
    public void deletePlasnning(@RequestBody PlanningCompositeKey id){
        planningService.deletePlasnning(id);
    }

    @PutMapping()
    public void updatePlanning(@RequestBody Planning p){
        planningService.updatePlanning(p.id , p.niveau);
    }
}
