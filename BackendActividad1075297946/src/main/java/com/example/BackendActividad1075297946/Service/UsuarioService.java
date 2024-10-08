package com.example.BackendActividad1075297946.Service;

import com.example.BackendActividad1075297946.Entity.Usuario;
import com.example.BackendActividad1075297946.IRepository.IBaseRepository;
import com.example.BackendActividad1075297946.IRepository.IUsuarioRepository;
import com.example.BackendActividad1075297946.IService.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends BaseService<Usuario> implements IUsuarioService {

    @Autowired
    private IUsuarioRepository repository;
    @Override
    protected IBaseRepository<Usuario, Long> getRepository() {
        return repository;
    }

}
