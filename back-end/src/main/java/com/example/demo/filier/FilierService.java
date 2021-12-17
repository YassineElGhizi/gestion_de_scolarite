package com.example.demo.filier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FilierService {
    final FilierRepository filierRepository;
    @Autowired
    public FilierService(FilierRepository filierRepository) {
        this.filierRepository = filierRepository;
    }

    public void addFilier(Filier f){
        filierRepository.save(f);
    }

    public List<Filier> getFiliers(){return filierRepository.findAll();}

    @Transactional
    public void updateFilier(Integer id , String intitule){
        Filier f = filierRepository.findByIdfil(id);
        f.setIntitule(intitule);
    }

    public void deleteFilier(Integer idfil) {
        filierRepository.deleteById(idfil);
    }
}
