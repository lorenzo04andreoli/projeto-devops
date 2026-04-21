package com.lorenzoandreoli.api.service;

import com.lorenzoandreoli.api.model.Paciente;
import com.lorenzoandreoli.api.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public List<Paciente> listar() {
        return repository.findAll();
    }

    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }

    public Paciente buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}