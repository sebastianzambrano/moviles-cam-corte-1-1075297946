package com.example.BackendActividad1075297946.IService;

import com.example.BackendActividad1075297946.Entity.Auditoria;

import java.util.List;

public interface IBaseService <T extends Auditoria>{
    List<T> all();

    List<T> findByStateTrue();

    T findById(Long id) throws Exception;

    T save(T entity) throws Exception;

    void update(Long id, T entity) throws Exception;

    void delete(Long id) throws Exception;
}
