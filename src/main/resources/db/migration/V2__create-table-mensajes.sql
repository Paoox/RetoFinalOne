CREATE TABLE mensajes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    contenido TEXT NOT NULL,
    fecha TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    autor VARCHAR(255) NOT NULL,
    topico_id BIGINT,
    FOREIGN KEY (topico_id) REFERENCES topicos(id) ON DELETE CASCADE
);