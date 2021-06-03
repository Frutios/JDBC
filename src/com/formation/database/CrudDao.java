package com.formation.database;

import java.util.List;

public interface CrudDao <ID, T> {

    T create(T object);

    T findById(ID id);

    List<T> findAll();

    boolean update(T object);

    boolean delete(ID id);


}
