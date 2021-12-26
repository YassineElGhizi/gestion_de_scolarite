package com.example.demo.filier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping(path = "api/filiere")
public class FilierController {

    final FilierService filierService;
    @Autowired
    public FilierController(FilierService filierService) {
        this.filierService = filierService;
    }

    @PostMapping()
    public void addFilier(@RequestBody Filier f){filierService.addFilier(f);}

    @GetMapping()
    public List<Filier> getFiliers(){
        return filierService.getFiliers();
    }
    @PutMapping(path="{idfil}")
    public void updateFilier(@PathVariable("idfil") Integer idfil,
                             @RequestParam(required = true) String intitule
    ){
        filierService.updateFilier(idfil, intitule);
    }

    @DeleteMapping(path = "{idfil}")
    public void deleteFilier(@PathVariable("idfil") Integer idfil){
        filierService.deleteFilier(idfil);
    }
}
