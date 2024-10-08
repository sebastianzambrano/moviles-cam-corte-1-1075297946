package com.example.BackendActividad1075297946.Service;

import com.example.BackendActividad1075297946.Entity.ControlActividades;
import com.example.BackendActividad1075297946.IRepository.IBaseRepository;
import com.example.BackendActividad1075297946.IRepository.IControlActividadesRepository;
import com.example.BackendActividad1075297946.IService.IControlActividadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControlActividadesService extends BaseService<ControlActividades> implements IControlActividadesService {
    @Autowired
    private IControlActividadesRepository repository;

    @Override
    protected IBaseRepository<ControlActividades, Long> getRepository() {
        return repository;
    }
}
