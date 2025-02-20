package com.example.demo.service;

//PAQUETE SERVIC TIENE LA LOGICA DEL NEGOCIO
//PAQUETE SERVIC TIENE LA LOGICA DEL NEGOCIO
//PAQUETE SERVIC TIENE LA LOGICA DEL NEGOCIO

import org.springframework.stereotype.Service;

import java.util.List;

//PARA INYECCION DE DEPENDENCIAS
//para marcar una clase como un servicio dentro del contexto de inyección de dependencias
@Service
public class FundamentosService implements IFundamentosService {

    @Override
    public String validarNumeroPrimo(int numero) {
        if(numero <2 ){
            return "No es PRIMO";
        }
        for (int i = 0; 1<=Math.sqrt(numero);i++){
            if(numero % i == 0){
                return "No es PRIMO";
            }
        }
        return "ES PRIMO";
    }



    @Override
    public String calcularFactorial(int numero) {
        return "";
    }

    @Override
    public List<Integer> calcularFabonacci(int numero) {
        return List.of();
    }
}
