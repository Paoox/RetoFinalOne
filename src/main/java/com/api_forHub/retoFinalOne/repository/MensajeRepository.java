package com.api_forHub.retoFinalOne.repository;


import com.api_forHub.retoFinalOne.model.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
    void deleteById(Long id);
}
