package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//Deja de ser una clase comun y puede recibir peticiones @RestController
@RestController
//Esto sirve para que del dominio localhost todo lo que venga se pueda dar una direccion api/v1/fundamentos
@RequestMapping("api/v1/fundamentos")
public class FundamentosController {

    //Es una anotación de Spring que se utiliza para mapear solicitudes
    // HTTP de tipo GET a un método específico en un controlador REST.
    @GetMapping("/ejercicio1")
    public String ejercicio1(){
        return "Hola mundo rest";
    }
}
