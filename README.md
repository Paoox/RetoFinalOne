# ForoHub API con Java Spring
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white) ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)   ![Insomnia](https://img.shields.io/badge/Insomnia-black?style=for-the-badge&logo=insomnia&logoColor=5849BE) ![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)

Descripción del Proyecto


Dado que el objetivo principal del archivo README es describir el proyecto, es recomendable que incluyas una breve explicación del proyecto junto al título, imagen de portada y/o insignias, en caso de que las haya. Esta breve descripción debe resaltar el objetivo principal de tu proyecto.

Si usas tu README como portfolio usa esta sección para dar una breve descripción sobre ti, a que te dedicas, en que estas trabajando, donde te pueden contactar o también puedes describir o enlistar los proyectos que haz trabajado, usa recursos como imágenes, gifs detallando las funcionalidades.

Ejemplo descripción sobre mí:



Ejemplo de proyectos en los que trabajado:



Estado del Proyecto


Si decides no utilizar insignias para indicar el estado del proyecto, resulta útil incluir esta información dentro del texto del README. Aquí tienes un ejemplo:

:construction: Proyecto en construcción :construction:
Resultado:





Si quieres saber como agregar más en este Gist, hay una gran variedad de emojis que puedes usar dentro de tu README.


Instalación del Proyecto
Es importante facilitar a los usuarios como se debe instalar o como empezar a usar tu proyecto, puedes usar una simple descripción de como instalarlo como muestra el siguiente ejemplo , si la instalación es complicada usa recursos como imágenes o gifs.

Ejemplo:





Funcionalidades


En esta sección puedes detallar como usar alguna funcionalidad en especifico, mostrar la estructura que necesita el usuario para que el proyecto funcione adecuadamente, si la funcionalidad es compleja no olvides que puedes usar recursos como imágenes o gifs, dentro de esta sección también puedes enlistar las funcionalidades que tiene tu proyecto.

Ejemplo:




Tecnologías Usadas


Es crucial proporcionar detalles sobre las tecnologías que utilizas en tu proyecto, esto demuestra los conocimientos que has aplicado. Puedes hacerlo mediante una lista o mediante el uso de insignias (badges), lo cual ayuda a resaltar estas tecnologías de manera visual.

Ejemplo:




Autores


También puedes agregar tu foto como autor, usando tu foto de perfil de GitHub y el nombre que hayas registrado, así será mas fácil que se pongan en contacto contigo por cualquier contribución, problema o inquietud.



## Autores

| [<img src="https://avatars.githubusercontent.com/u/99487654?v=4" width=115><br><sub>Leonardo Narvaez</sub>](https://github.com/leonxrdon) |
| :---: | 


Si quieres agregar mas autores usa la siguiente estructura:

| [<img src="url avatar perfil 1" width=115><br><sub>Nombre 1</sub>](url perfil 1) |  [<img src="url avatar perfil 2" width=115><br><sub>Nombre 2</sub>](url perfil 2) | [<img src="url avatar perfil 3" width=115><br><sub>Nombre 3</sub>](url perfil 3) |
| :---: | :---: | :---: |

Licencia


Por lo general, los repositorios públicos en GitHub se utilizan para compartir software de código abierto. No obstante, para que un repositorio sea considerado realmente de código abierto, es necesario obtener una licencia que permita a otros usuarios tener la libertad de utilizar, modificar y distribuir dicho software.





Ahora que has aprendido cómo crear un README efectivo para tu repositorio en GitHub, es hora de poner en práctica tus conocimientos y animarte a crear el tuyo. Recuerda que un README bien estructurado, informativo y atractivo puede marcar la diferencia al presentar tu proyecto a la comunidad de desarrollo.

Compartir:

     
Ver más
Buscar Artículo
¿Cómo instalar Django en Plesk?
¿Cómo instalar Django en Plesk?
 137 Tutoriales
Dibuja un Girasol Amarillo con Python y Turtle
Dibuja un Girasol Amarillo con Python y Turtle
 5860 Tutoriales
¿Cómo consumir una API de preguntas y respuestas?
¿Cómo consumir una API de preguntas y respuestas?



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

