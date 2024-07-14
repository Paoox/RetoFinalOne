package com.api_forHub.retoFinalOne.dto;

import com.api_forHub.retoFinalOne.model.Curso;

import java.util.List;
import java.util.stream.Collectors;

public record DTOListadoTopico(Long id,
                               String titulo,
                               List<DatosListadoMensaje> mensajes,
                               String status,
                               Curso curso) {

    public DTOListadoTopico(Topico topico){
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensajes().stream()
                        .map(DatosListadoMensaje::new)
                        .collect(Collectors.toList()),
                topico.getStatus(),
                topico.getCurso());
    }
}
