package com.demo.Dmario_jeans.repository;

import com.demo.Dmario_jeans.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface Repository extends JpaRepository<Usuario,Long> {
}
