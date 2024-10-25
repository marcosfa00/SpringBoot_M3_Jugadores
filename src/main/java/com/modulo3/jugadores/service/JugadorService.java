package com.modulo3.jugadores.service;

import com.modulo3.jugadores.model.Jugador;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JugadorService {

    private final List<Jugador> listaJugadores = new ArrayList<Jugador>();

    public void addJugador(Jugador jugador) {
        listaJugadores.add(jugador);
    }

    public List<Jugador> getJugadores() {
        return listaJugadores;
    }

    public Jugador getJugador(String nombre) {
        Jugador jugador = null;
        for (Jugador j : listaJugadores) {
            if (j.getNombre().equals(nombre)) {
                jugador = j;
            }
        }
        return jugador;
    }

}
