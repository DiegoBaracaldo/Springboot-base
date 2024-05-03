package com.demo.Dmario_jeans.controllers;

import com.demo.Dmario_jeans.modelos.Bodega;
import com.demo.Dmario_jeans.modelos.Diseno;
import com.demo.Dmario_jeans.modelos.Usuario;
import com.demo.Dmario_jeans.repository.Repository;
import com.demo.Dmario_jeans.repository.RepositoryBodega;
import com.demo.Dmario_jeans.repository.RepositoryDiseno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Repository repoUsuario;

    @Autowired
    private RepositoryDiseno repoDiseno;

    @Autowired
    private RepositoryBodega repoBodega;

    // Ruta de inicio
    @GetMapping("/")
    public String index(){
        return "CONECTADO :)";
    }

    // Métodos para Usuarios
    @GetMapping("/Usuario")
    public List<Usuario> getUsuarios(){
        return repoUsuario.findAll();
    }

    @PostMapping("/guardarUsuario")
    public String guardarUsuario(@RequestBody Usuario usuario){
        repoUsuario.save(usuario);
        return "Usuario guardado";
    }

    @PutMapping("/editarUsuario/{id}")
    public String editarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        Usuario usuarioExistente = repoUsuario.findById(id).orElse(null);
        if (usuarioExistente != null) {
            usuarioExistente.setNombre(usuario.getNombre());
            usuarioExistente.setIdentificacion(usuario.getIdentificacion());
            usuarioExistente.setCargo(usuario.getCargo());
            usuarioExistente.setTelefono(usuario.getTelefono());
            usuarioExistente.setPassword(usuario.getPassword());
            repoUsuario.save(usuarioExistente);
            return "Usuario editado";
        } else {
            return "Usuario no encontrado";
        }
    }

    @DeleteMapping("/eliminarUsuario/{id}")
    public String eliminarUsuario(@PathVariable Long id){
        repoUsuario.deleteById(id);
        return "Usuario eliminado";
    }

    // Métodos para Diseños
    @GetMapping("/Diseno")
    public List<Diseno> getDisenos(){
        return repoDiseno.findAll();
    }

    @PostMapping("/guardarDiseno")
    public String guardarDiseno(@RequestBody Diseno diseno){
        repoDiseno.save(diseno);
        return "Diseño guardado";
    }

    @PutMapping("/editarDiseno/{id}")
    public String editarDiseno(@PathVariable Long id, @RequestBody Diseno diseno){
        Diseno disenoExistente = repoDiseno.findById(id).orElse(null);
        if (disenoExistente != null) {
            disenoExistente.setNombreDiseno(diseno.getNombreDiseno());
            disenoExistente.setDescripcion(diseno.getDescripcion());
            repoDiseno.save(disenoExistente);
            return "Diseño editado";
        } else {
            return "Diseño no encontrado";
        }
    }

    @DeleteMapping("/eliminarDiseno/{id}")
    public String eliminarDiseno(@PathVariable Long id){
        repoDiseno.deleteById(id);
        return "Diseño eliminado";
    }

    // Métodos para Bodega
    @GetMapping("/Bodega")
    public List<Bodega> getBodegas(){
        return repoBodega.findAll();
    }

    @PostMapping("/guardarBodega")
    public String guardarBodega(@RequestBody Bodega bodega){
        repoBodega.save(bodega);
        return "Bodega guardada";
    }

    @PutMapping("/editarBodega/{id}")
    public String editarBodega(@PathVariable Long id, @RequestBody Bodega bodega){
        Bodega bodegaExistente = repoBodega.findById(id).orElse(null);
        if (bodegaExistente != null) {
            bodegaExistente.setCodigo(bodega.getCodigo());
            bodegaExistente.setIdDiseno(bodega.getIdDiseno());
            bodegaExistente.setTipoMovimiento(bodega.getTipoMovimiento());
            bodegaExistente.setDiaExacto(bodega.getDiaExacto());
            bodegaExistente.setCant(bodega.getCant());
            repoBodega.save(bodegaExistente);
            return "Bodega editada";
        } else {
            return "Bodega no encontrada";
        }
    }

    @DeleteMapping("/eliminarBodega/{id}")
    public String eliminarBodega(@PathVariable Long id){
        repoBodega.deleteById(id);
        return "Bodega eliminada";
    }
}
