package com.example.BackendActividad1075297946.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
@Data
@MappedSuperclass
public abstract class Auditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "state", nullable = true)
    private Boolean state;

    @Column(name = "created_at", nullable = true)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at", nullable = true)
    private LocalDateTime deletedAt;

    @Column(name = "created_by", nullable = true)
    private Long createdBy;

    @Column(name = "updated_by", nullable = true)
    private Long updatedBy;

    @Column(name = "deleted_by", nullable = true)
    private Long deletedBy;
}
