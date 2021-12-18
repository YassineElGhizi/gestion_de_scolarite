package com.example.demo.inscription;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/inscription")
public class InscriptionController {
    final InscriptionService inscriptionService;
    @Autowired
    public InscriptionController(InscriptionService inscriptionService) {
        this.inscriptionService = inscriptionService;
    }

    @PostMapping()
    public void addInscription(@RequestBody Inscription i){
        inscriptionService.addInscription(i);
    }

    @GetMapping()
    public List<Inscription> getInscriptions(){
        return inscriptionService.getInscriptions();
    }

    @DeleteMapping()
    public void deleteInscription(@RequestBody InscriptionCompositeKey id){
        inscriptionService.deleteInscription(id);
    }

    @PutMapping()
    public void updateInscription(@RequestBody Inscription i){
        inscriptionService.updateInscription(i.id , i.niveau);
    }

}
