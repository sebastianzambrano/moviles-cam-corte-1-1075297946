package com.example.BackendActividad1075297946.Controller;

import com.example.BackendActividad1075297946.Entity.ControlActividades;
import com.example.BackendActividad1075297946.IService.IControlActividadesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/controlactividades")
public class ControlActividadesController extends BaseController<ControlActividades, IControlActividadesService>{
    public ControlActividadesController(IControlActividadesService service){super(service,"ControlActividades");}
}
