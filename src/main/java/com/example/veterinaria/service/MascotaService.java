package com.example.veterinaria.service;

import com.example.veterinaria.model.Mascota;
import com.example.veterinaria.repository.MascotaRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MascotaService {
    private final MascotaRepository mascotaRepository;

    public MascotaService(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    // 1. Listar todas las mascotas
    public List<Mascota> listarTodas() {
        return mascotaRepository.findAll();
    }

    // 2. Obtener mascotas por id
    public Optional<Mascota> buscarPorId(Integer id){
        return mascotaRepository.findById(id);
    }

    // 3. Crear mascota
    public Mascota crearMascota(Mascota mascota){
        return mascotaRepository.save(mascota);
    }

    // 4. Actualizar mascota
    public Mascota actualizarMascota(Integer id, Mascota mascota){
        mascota.setId(id);
        return mascotaRepository.save(mascota);
    }

    // 5. Elinamos mascota
    public void eliminarMascota(Integer id){
        mascotaRepository.deleteById(id);
    }
}
