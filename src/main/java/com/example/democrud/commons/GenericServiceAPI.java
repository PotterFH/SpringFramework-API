package com.example.democrud.commons;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface GenericServiceAPI <T, ID extends Serializable> {

    //Guardar
    T save ( T entity);

    //Eliminar
    void delete(ID id);

    //Obtener un registro en especifico
    T get (ID id);

    //Listar todos los registros
    List<T> getAll();

}
