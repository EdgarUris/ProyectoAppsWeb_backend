package com.example.spa_backend.model;

import jakarta.persistence.*;

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nombre;

    @Column
    private String telefono;

    @Column
    private boolean activo = true;

    @OneToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

}
