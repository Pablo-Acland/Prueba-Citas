package com.springBajo8.springBajo8.service.impl;

import com.springBajo8.springBajo8.domain.PadecimientoTratamiento;
import com.springBajo8.springBajo8.domain.citasDTOReactiva;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class citasReactivaServiceImplTest {

    @Autowired
    citasReactivaServiceImpl servicio;

    @Test
    void cancelarCita() {
        Flux<citasDTOReactiva> Cita = servicio.cancelarCita("0");
        StepVerifier.create(Cita).expectNext().verifyComplete();
    }

    @Test
    void consultarFechaYHora() {
        Flux<citasDTOReactiva> Cita = servicio.consultarFechaYHora(LocalDate.of(2000, 2, 2), "19:00:00");
        StepVerifier.create(Cita).expectNext().verifyComplete();
    }

    @Test
    void consultarMedicoAtendera() {
        Flux<citasDTOReactiva> Cita = servicio.consultarMedicoAtendera("0");
        StepVerifier.create(Cita).expectNext().verifyComplete();
    }

    @Test
    void consultarTratamientosYPadecimientos() {
        Flux<List<PadecimientoTratamiento>> ListCita = servicio.consultarTratamientosYPadecimientos("0");
        StepVerifier.create(ListCita).expectNext().verifyComplete();
    }
}