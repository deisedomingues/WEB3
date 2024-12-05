package com.projetop3.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetop3.backend.model.Inscrito;
import com.projetop3.backend.repository.InscritoRepository;

@Service
public class InscritoService {

    @Autowired
    private InscritoRepository inscritoRepository;

    public List<Inscrito> getAllInscritos() {
        return inscritoRepository.findAll();
    }

    public Optional<Inscrito> getInscritoById(Long id) {
        return inscritoRepository.findById(id);
    }

    public Inscrito saveInscrito(Inscrito inscrito) {
        return inscritoRepository.save(inscrito);
    }

    public void deleteInscrito(Long id) {
        inscritoRepository.deleteById(id);
    }
}
