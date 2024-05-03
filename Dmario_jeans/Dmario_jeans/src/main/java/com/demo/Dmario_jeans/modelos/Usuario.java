package com.demo.Dmario_jeans.modelos;


import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Setter
    @Getter
    @Column(name = "nombre") // Asegúrate de que el nombre de la columna coincida exactamente con el de la base de datos
    private String nombre;

    @Setter
    @Getter
    @Column(name = "identificacion")
    private String identificacion;

    @Setter
    @Getter
    @Column(name = "cargo")
    private String cargo;

    @Setter
    @Getter
    @Column(name = "telefono")
    private String telefono;

    @Setter
    @Getter
    @Column(name = "password")
    private String password;
}

