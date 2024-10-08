package com.example.BackendActividad1075297946.IRepository;

import com.example.BackendActividad1075297946.Entity.Auditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBaseRepository<T extends Auditoria, ID> extends JpaRepository<T,Long> {
}
