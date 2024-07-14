package com.api_forHub.retoFinalOne.dto;

import com.api_forHub.retoFinalOne.model.Mensaje;

import java.time.LocalDateTime;

public record DatosListadoMensaje(Long id,
                                  String contenido,
                                  LocalDateTime fecha,
                                  String autor) {

    public DatosListadoMensaje(Mensaje mensaje) {
        this(mensaje.getId(), // Asigna el id directamente
                mensaje.getContenido(),
                mensaje.getFecha(),
                mensaje.getAutor());
    }

    public DatosListadoMensaje(Long id, String contenido, LocalDateTime fecha, String autor) {
        this.id = id;
        this.contenido = contenido;
        this.fecha = fecha;
        this.autor = autor;
    }
}
