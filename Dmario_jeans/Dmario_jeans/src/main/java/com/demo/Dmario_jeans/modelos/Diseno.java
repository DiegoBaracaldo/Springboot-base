package com.demo.Dmario_jeans.modelos;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Diseno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Setter
    @Getter
    @Column(name = "nombre_diseno")
    private String nombreDiseno;

    @Setter
    @Getter
    @Column(name = "descripcion")
    private String descripcion;
}
