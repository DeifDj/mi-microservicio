package com.Deivid.mimicroservicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NombreController {

    @GetMapping("/nombre")
    public String obtenerNombre() {
        return "Deivid_Farfan";
    }
}