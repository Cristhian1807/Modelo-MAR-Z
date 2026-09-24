package com.proyecto.controllers;

import com.proyecto.entities.Rol;
import com.proyecto.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    @Autowired
    private RolRepository rolRepository;

    // Endpoint para listar todos los roles del producto: GET http://localhost:8080/api/roles
    @GetMapping
    public List<Rol> listarRoles() {
        return rolRepository.obtenerTodosLosRoles();
    }

    // Endpoint para buscar un rol específico por nombre: GET http://localhost:8080/api/roles/{nombre}
    @GetMapping("/{nombre}")
    public Rol obtenerRolPorNombre(@PathVariable String nombre) {
        return rolRepository.obtenerRolPorNombre(nombre);
    }
}