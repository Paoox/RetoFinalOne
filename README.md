# ForoHub API con Java Spring
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white) ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)   ![Insomnia](https://img.shields.io/badge/Insomnia-black?style=for-the-badge&logo=insomnia&logoColor=5849BE) ![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)

## Descripción del Proyecto
Este proyecto fue desarrollado durante el curso de AluraLatam: **REST API usando Java y Spring**. ForoHub permite la gestión de preguntas y respuestas, así como la autenticación de usuarios utilizando JWT (JSON Web Tokens).

## Funcionalidades
- **Gestión de Preguntas y Respuestas**: Permite operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre preguntas y respuestas.
- **Autenticación JWT**: Proceso de registro y autenticación de usuarios utilizando tokens JWT con tokens Bearer.
- **Base de Datos**: Utiliza JPA (Java Persistence API) con Spring Data para persistir datos relacionados con preguntas, respuestas y usuarios.

## Tecnologías Utilizadas
- **Java 17**
- **Spring Boot**
- **Spring Security con JWT**
- **Spring Data JPA**
- **MySQL**

## Configuración

### Clonar el Repositorio
Primero, clona el repositorio a tu máquina local:

```
git clone https://github.com/your-user/forum-api.git
cd forum-api 
```

## Configurar la Base de Datos
Configura tu base de datos SQL en el archivo application.properties:
properties
Copiar código
```
spring.datasource.url=jdbc:mysql://localhost:3306/forum_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```
## Ejecutar la Aplicación
Usa Maven para compilar y ejecutar la aplicación:
bash
Copiar código

```
mvn spring-boot:run
```
## Endpoints Disponibles
### Autenticación
POST /usuario: Registro de usuarios.
POST /login: Autenticación de usuarios (obtención de JWT).
### Preguntas y Respuestas
GET /topicos: Obtener todos los temas.
GET /topicos/{id}: Obtener un tema por ID.
POST /topicos: Crear un nuevo tema.
PUT /topicos/{id}: Actualizar un tema existente.
DELETE /topicos/{id}: Eliminar un tema.
POST /respuestas: Añadir una respuesta a un tema.
PUT /respuestas/{id}: Actualizar una respuesta existente.
DELETE /respuestas/{id}: Eliminar una respuesta.
### Seguridad
Todas las solicitudes que modifican datos (POST, PUT, DELETE) requieren autenticación a través del token Bearer en el encabezado de Authorization, obtenido del endpoint POST /login.

## Creado por:
### Paoxx.dev   [ pao.arreola@gmail.com ]  ![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)

