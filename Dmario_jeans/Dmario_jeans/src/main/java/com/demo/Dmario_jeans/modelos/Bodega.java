package com.demo.Dmario_jeans.modelos;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
public class Bodega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @Column(name = "codigo")
    private String codigo;
    @Getter
    @Setter
    @Column(name = "id_diseno")
    private String idDiseno;
    @Getter
    @Setter
    @Column(name = "dia_exacto")
    private String diaExacto;
    @Getter
    @Setter
    @Column(name = "tipo_movimiento")
    private String tipoMovimiento;
    @Getter
    @Setter
    @Column(name = "cant")
    private String cant;

    // Constructor, getters y setters
}

