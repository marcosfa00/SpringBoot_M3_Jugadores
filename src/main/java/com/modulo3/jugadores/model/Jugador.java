package com.modulo3.jugadores.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class Jugador {
    @Size(min=4, max=12) @NotEmpty
    private String nombre;
    @Min(0) @Positive
    private Integer victorias;
    @Min(-1)
    private Integer derrotas;

    public Jugador() {}

    public Jugador(String nombre, Integer victorias, Integer derrotas) {
        this.nombre = nombre;
        this.victorias = victorias;
        this.derrotas = derrotas;
    }

    public @Size(min = 4, max = 12) @NotEmpty String getNombre() {
        return nombre;
    }

    public void setNombre(@Size(min = 4, max = 12) @NotEmpty String nombre) {
        this.nombre = nombre;
    }

    public @Min(0) Integer getVictorias() {
        return victorias;
    }

    public void setVictorias(@Min(0) Integer victorias) {
        this.victorias = victorias;
    }

    public @Min(0) Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(@Min(0) Integer derrotas) {
        this.derrotas = derrotas;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", victorias=" + victorias +
                ", derrotas=" + derrotas +
                '}';
    }
}
