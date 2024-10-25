# Proyecto de Gestión de Jugadores

Este proyecto es una aplicación web para gestionar jugadores en un juego, permitiendo registrar sus estadísticas de victorias y derrotas. Utiliza Spring Boot y Thymeleaf para la creación de la interfaz web.

## Estructura del Proyecto

- **Model**: Contiene la clase `Jugador`, que representa a un jugador con atributos como nombre, victorias y derrotas.
- **Service**: Contiene la clase `JugadorService`, que maneja la lógica de negocio y el almacenamiento en memoria de los jugadores.
- **Controller**: Contiene la clase `JugadorController`, que gestiona las solicitudes HTTP y las interacciones entre la vista y el modelo.

## Funcionalidades

1. **Registro de Jugadores**: Permite registrar nuevos jugadores con su nombre, número de victorias y derrotas.
2. **Listado de Jugadores**: Muestra una lista de todos los jugadores registrados, indicando si son "GANADORES" o "PERDEDORES" en función de su porcentaje de victorias.
3. **Estadísticas de Jugador**: Permite visualizar las estadísticas de un jugador específico.
4. **Manejo de Errores**: Incluye una página de error personalizada para manejar situaciones de error 404.

## Requisitos

- Java 17 o superior
- Spring Boot
- Thymeleaf
