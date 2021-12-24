package com.example.demo.etudiant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {

    private final EtudiantRepository etudiantRepository;
    @Autowired
    public EtudiantService(EtudiantRepository etudiantRepository){
        this.etudiantRepository = etudiantRepository;
    }

    public void addEtudiant(Etudiant e)
    {
        etudiantRepository.save(e);
    }

    public List<Etudiant> getEtudiants() {
        return etudiantRepository.findAll();
    }

    @Transactional
    public void updateEtudiant(String cne, String nom, String prenom) {
        Optional<Etudiant>  ee = etudiantRepository.findByCne(cne);
        Etudiant e = ee.get();
        e.setNom(nom);
        e.setPrenom(prenom);
    }

    public void deleteEtudiant(String cne) {
//        etudiantRepository.deleteByCne(cne);
        System.out.println("we neeed to delete this e " + cne);
        etudiantRepository.deleteById(cne);

    }
}
