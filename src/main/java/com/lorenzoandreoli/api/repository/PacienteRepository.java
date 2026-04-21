package com.lorenzoandreoli.api.repository;

import com.lorenzoandreoli.api.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}