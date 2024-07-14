package com.api_forHub.retoFinalOne.dto;

import java.time.LocalDateTime;

public record DTOListadoMensaje(Long id,
                                String contenido,
                                LocalDateTime fecha,
                                String autor) {

    public DTOListadoMensaje(Mensaje mensaje) {
        this(mensaje.getId(), //Asignando el id del mensaje
                mensaje.getContenido(),
                mensaje.getFecha(),
                mensaje.getAutor());
    }

    public DTOListadoMensaje(Long id, String contenido, LocalDateTime fecha, String autor) {
        this.id = id;
        this.contenido = contenido;
        this.fecha = fecha;
        this.autor = autor;
    }
}
