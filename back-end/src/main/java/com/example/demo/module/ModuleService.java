package com.example.demo.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ModuleService {
    final ModuleRepository moduleRepository;
    @Autowired
    public ModuleService(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    public void addModule(Module m){ moduleRepository.save(m);}

    public List<Module> getModules(){return  moduleRepository.findAll();}

    @Transactional
    public void updateModule(Integer idMod, String nom){
        Module m = moduleRepository.findByIdMod(idMod);
        m.setNom(nom);
    }
}
