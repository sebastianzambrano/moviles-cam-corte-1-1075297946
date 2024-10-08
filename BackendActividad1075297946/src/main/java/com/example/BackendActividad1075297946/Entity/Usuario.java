package com.example.BackendActividad1075297946.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
public class Usuario extends Auditoria{
    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "apellido", length = 50)
    private String apellido;

    @Column(name = "correoElectronico", length = 50)
    private String correoElectronico;

    @Column(name = "direccion", length = 50)
    private String direccion;

    @Column(name = "telefono", length = 10)
    private String telefono;

    @Column(name = "contraseña", length = 10)
    private String contraseña;

    /*@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ControlActividades> actividades = new ArrayList<>();*/
}
