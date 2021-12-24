package com.example.demo.etudiant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/etudiant")
public class EtudiantController {
    private final EtudiantService etudiantService;

    @Autowired
    public EtudiantController(EtudiantService etudiantService){
        this.etudiantService = etudiantService;
    }

    @PostMapping()
    public void addEtudient(@RequestBody Etudiant e){
        etudiantService.addEtudiant(e);
    }

//    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping()
    public List<Etudiant> getEtudiants(){
        return etudiantService.getEtudiants();
    }

    @PutMapping(path = "{cne}")
    public void updateEtudiant(@PathVariable("cne") String cne ,
                               @RequestParam(required = false) String nom ,
                               @RequestParam(required = false) String prenom
    ){
        etudiantService.updateEtudiant(cne , nom , prenom);
    }

    @DeleteMapping(path = "{cne}")
    public void deleteEtudiant(@PathVariable("cne") String cne){etudiantService.deleteEtudiant(cne);}
}
