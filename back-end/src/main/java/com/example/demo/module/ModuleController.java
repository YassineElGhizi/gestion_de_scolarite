package com.example.demo.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/moduel")
public class ModuleController {
    final ModuleService moduleService;
    @Autowired
    public ModuleController(ModuleService moduleService) {
        this.moduleService = moduleService;
    }

    @PostMapping()
    public void addModule(@RequestBody Module m){
        moduleService.addModule(m);
    }

    @GetMapping()
    public List<Module> getModules(){
        return  moduleService.getModules();
    }

    @PutMapping(path = "{idMod}")
    public void updateModule(
            @PathVariable("idMod") Integer idMod,
            @RequestParam(required = true) String nom
    ){
        moduleService.updateModule(idMod , nom);
    }

}
