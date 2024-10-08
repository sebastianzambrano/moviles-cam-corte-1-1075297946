package com.example.BackendActividad1075297946.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "control_actividades")
public class ControlActividades extends Auditoria{
    @Column(name = "codigo_actividad", length = 10)
    private Long codigo_actividad;

    @Column(name = "fecha", length = 50)
    private LocalDateTime fecha;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "descripcion", length = 50)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
