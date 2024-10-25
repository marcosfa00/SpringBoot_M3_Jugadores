package com.modulo3.jugadores.controller;

import com.modulo3.jugadores.model.Jugador;
import com.modulo3.jugadores.service.JugadorService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@Controller
public class controlador {
    // inyección de dependencias por constructor
    private JugadorService jugadorService;
    controlador(JugadorService jugadorService) {
        this.jugadorService = jugadorService;
    }

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @PostMapping("/jugadores")
    public String registrarJugador(@Valid Jugador jugador, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "index";
        }
        jugadorService.addJugador(jugador);
        model.addAttribute("jugadores", jugadorService.getJugadores());
        return "vistaJugadores";
    }

    @GetMapping("/jugadores")
    public String mostrarjugadores(Model model) {
        model.addAttribute("jugadores", jugadorService.getJugadores());
        return "vistaJugadores";
    }

    @GetMapping("/invencible/{nombre}")
    public String mostrarinvencible(@PathVariable String nombre, Model model) {
        model.addAttribute("jugador", jugadorService.getJugador(nombre));
        return "invencible";
    }

}
