package com.api_forHub.retoFinalOne.repository;

import com.api_forHub.retoFinalOne.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByEmail(String username);
}
