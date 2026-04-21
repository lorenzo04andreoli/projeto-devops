package com.lorenzoandreoli.api.repository;

import com.lorenzoandreoli.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}