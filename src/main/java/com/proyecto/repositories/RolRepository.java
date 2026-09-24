package com.proyecto.repositories;

import com.proyecto.entities.Rol;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RolRepository {

    private final List<Rol> listaRoles = new ArrayList<>();

    public RolRepository() {
        // Inicializamos los datos exactamente como aparecen en la tabla de la imagen
        listaRoles.add(new Rol("Solicitante", "Crear y consultar sus solicitudes", "No accede a solicitudes ajenas"));
        listaRoles.add(new Rol("Agente", "Atender solicitudes asignadas y registrar avances", "No administra usuarios"));
        listaRoles.add(new Rol("Coordinador", "Priorizar, asignar y consultar indicadores agregados", "No modifica el historial de auditoría"));
        listaRoles.add(new Rol("Auditor", "Consultar historial de cambios en modo lectura", "No crea, asigna ni resuelve solicitudes"));
    }

    // Método para obtener todos los roles
    public List<Rol> obtenerTodosLosRoles() {
        return listaRoles;
    }

    // Método para buscar un rol por su nombre
    public Rol obtenerRolPorNombre(String nombre) {
        return listaRoles.stream()
                .filter(r -> r.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }
}