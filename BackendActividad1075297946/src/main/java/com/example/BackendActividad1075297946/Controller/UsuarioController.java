package com.example.BackendActividad1075297946.Controller;

import com.example.BackendActividad1075297946.Entity.Usuario;
import com.example.BackendActividad1075297946.IService.IUsuarioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/usuario")
public class UsuarioController extends BaseController<Usuario, IUsuarioService> {
    public UsuarioController(IUsuarioService service){super(service,"Usuario");}

}
