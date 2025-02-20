package com.example.demo.service;

//PAQUETE SERVIC TIENE LA LOGICA DEL NEGOCIO
//PAQUETE SERVIC TIENE LA LOGICA DEL NEGOCIO
//PAQUETE SERVIC TIENE LA LOGICA DEL NEGOCIO

import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        for (int i = 2; 1<=Math.sqrt(numero);i++){
            if(numero % i == 0){
                return "No es PRIMO";
            }
        }
        return "ES PRIMO";
    }


    @Override
    public String calcularFactorial(int numero) {
        if(numero < 0){
            return "No se puede calcular factorial";
        }
        long factorial = 1;
        for(int i = 1 ;  i <= numero ; i++){
            factorial *= i;
        }
        return "El factorial es = " + factorial;
    }

    @Override
    public List<Integer> calcularFabonacci(int numero) {
        List<Integer> fibonacci = new ArrayList<>();
        if (numero <= 0){
            return fibonacci;
        }
        int a = 0 , b = 1 ;
        for(int i = 0 ; i < numero ; i++ ){
            fibonacci.add(a);
            int siguenteValor  =  a  + b ;
            a = b;
            b = siguenteValor;
        }
        return fibonacci;
    }
}
