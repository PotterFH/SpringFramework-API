package com.example.democrud.controller;

import com.example.democrud.model.Persona;
import com.example.democrud.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class PersonaRestController {

    @Autowired
    private PersonaServiceAPI personaServiceAPI;

    @GetMapping(value = "/all")
    public List<Persona> getAll(){
        return personaServiceAPI.getAll();
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Persona> save(@RequestBody Persona persona){
        Persona obj = personaServiceAPI.save(persona);
        return new ResponseEntity<Persona>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<Persona> delete(@PathVariable Long id){
        Persona persona = personaServiceAPI.get(id);
        if( persona != null){
            personaServiceAPI.delete(id);
        }else{
            return  new ResponseEntity<Persona>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Persona>(persona, HttpStatus.OK);
    }


}


