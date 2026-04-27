package com.lorenzoandreoli.api.service;

import com.lorenzoandreoli.api.model.Paciente;
import com.lorenzoandreoli.api.repository.PacienteRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PacienteServiceTest {

    private PacienteRepository repository;
    private PacienteService service;

    @BeforeEach
    void setup() {
        repository = Mockito.mock(PacienteRepository.class);
        service = new PacienteService(repository);
    }

    @Test
    void deveListarPacientes() {
        when(repository.findAll()).thenReturn(List.of(new Paciente()));
        List<Paciente> lista = service.listar();
        assertFalse(lista.isEmpty());
    }

    @Test
    void deveSalvarPaciente() {
        Paciente paciente = new Paciente(null, "João", "email", "123");

        when(repository.save(any(Paciente.class))).thenReturn(paciente);

        Paciente salvo = service.salvar(paciente);

        assertEquals("João", salvo.getNome());
    }

    @Test
    void deveBuscarPacientePorId() {
        Paciente paciente = new Paciente(1L, "Maria", "email", "123");
        when(repository.findById(1L)).thenReturn(Optional.of(paciente));

        Paciente resultado = service.buscarPorId(1L);

        assertNotNull(resultado);
    }

    @Test
    void deveLancarErroQuandoNaoEncontrarPaciente() {
        when(repository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> {
            service.buscarPorId(1L);
        });
    }

    @Test
    void deveDeletarPaciente() {
        doNothing().when(repository).deleteById(1L);

        service.deletar(1L);

        verify(repository, times(1)).deleteById(1L);
    }
}