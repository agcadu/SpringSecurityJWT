
# SpringSecurityJWT

SpringSecurityJWT es una aplicación construida con Spring 3, Java 17 y Maven, y empaquetada en un contenedor Docker. Esta aplicación es una API REST que integra Spring Security, proporcionando control sobre usuarios y sus roles. Cuando se inicia la aplicación, se crean tres usuarios en la base de datos, cada uno con un rol distinto (ADMIN, USER e INVITED). Además, la aplicación gestiona el CRUD de datos sobre personas, a través de varios endpoints, cuyo acceso varía según el rol del usuario.

## Beneficios de utilizar Spring Security y JWT:

- **Spring Security**:
    - Autenticación y autorización robustas.
    - Protección contra ataques comunes (como session fixation, clickjacking, cross-site request forgery, etc.).
    - Integración sencilla con diversos sistemas de autenticación.
    - Extensibilidad para adaptarse a requisitos específicos.

- **JWT (JSON Web Tokens)**:
    - Autenticación sin estado: no es necesario mantener sesiones en el servidor.
    - Escalabilidad: al ser sin estado, facilita la escalabilidad horizontal.
    - Seguridad: la información en el token está cifrada y solo puede ser leída por quien posea la clave secreta.
    - Portabilidad: el token contiene toda la información necesaria para la autenticación, lo que facilita el uso entre diferentes dominios o aplicaciones.

## Requisitos:

- Java: Java Development Kit (JDK) versión 17.
- Maven: La última versión disponible es recomendada.
- Docker: Asegúrate de tener Docker y Docker Compose instalados. La última versión disponible es recomendada.
- Postman: La última versión disponible es recomendada.
- IDE: IntelliJ IDEA o Eclipse.
- DBeaver: La última versión disponible es recomendada.

## Endpoints:

1. **Acceso Público**:
    - `GET http://localhost:8080/hello`: Accesible para cualquier usuario.

2. **Autenticación**:
    - `POST http://localhost:8080/login`: Inicie sesión para acceder a la aplicación. Devuelve un token JWT al autenticarse correctamente.

3. **Personas**:
    - `GET http://localhost:8080/persons`: Muestra los datos de la tabla persons. Acceso: ADMIN, USER, INVITED.
    - `POST http://localhost:8080/persons`: Añade datos a la tabla persons. Acceso: ADMIN, USER.
    - `DELETE http://localhost:8080/deletePerson`: Borra datos de la tabla persons. Acceso: ADMIN, USER.

4. **Usuarios y Roles**:
    - `GET http://localhost:8080/users`: Acceso a todos los usuarios (sin contraseñas) y roles. Acceso: ADMIN.
    - `POST http://localhost:8080/createUser`: Crea un nuevo usuario. Acceso: ADMIN.
    - `DELETE http://localhost:8080/deleteUser`: Borra un usuario. Acceso: ADMIN.

### Pruebas:


- Se facilita una colección Postman para pruebas: `ApplicationSecurityJWT.postman_collection.json`. Al obtener el token del endpoint de login, deberá introducirlo en la autorización como `Bearer Token`.

## Cómo Comenzar

1. Clone el repositorio:
```bash
git clone https://github.com/agcadu/SpringSecurityJWT.git
```

2. Navegue al directorio del proyecto:
```bash
cd SpringSecurityJWT
```

3. Construya el proyecto con Maven:
```bash
mvn clean package -DskipTests
```

4. Inicie los contenedores Docker (aplicación y base de datos) con Docker Compose:
```bash
docker compose up
```

Una vez que los contenedores estén en funcionamiento, la aplicación estará disponible en `http://localhost:8080` y la base de datos en `jdbc:postgresql://localhost:5432/spring_security`.

---

