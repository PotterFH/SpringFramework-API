package com.example.democrud.dao.api;

import com.example.democrud.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDaoAPI extends CrudRepository<Persona, Long> {

}
