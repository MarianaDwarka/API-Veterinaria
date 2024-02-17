package com.marianadwarka.veterinaria.controller;

import com.marianadwarka.veterinaria.model.Duenio;
import com.marianadwarka.veterinaria.service.IDuenioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenioController {
    
    @Autowired
    private IDuenioService duenioServ;
     
    // 2.- Realizar CRUD de duseños
    
    //lectura para traer a todas las personas
    @GetMapping ("/duenio/traer")
    public List<Duenio> getPersonas() {
        
        return duenioServ.getDuenios();
    }
    
    //alta
    @PostMapping ("/duenio/crear")
    public String savePersona (@RequestBody Duenio duenio) {
        duenioServ.saveDuenio(duenio);
        
        return "La persona fue creada correctamente";
    }
    
    //baja
    @DeleteMapping ("/duenio/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        duenioServ.deleteDuenio(id);
        return "La persona fue eliminada correctamente";
    }
    
    //edición
    @PutMapping ("/duenio/editar")
    public Duenio editPersona(@RequestBody Duenio duenio) {
        duenioServ.editDuenio(duenio);
        
        return duenioServ.findDuenio(duenio.getId_duenio());
    }
    
}
