package com.api_forHub.retoFinalOne.dto;

import jakarta.validation.constraints.NotBlank;

public record DatosNuevoMensaje(
        @NotBlank String contenido,
        @NotBlank String autor) {
}
