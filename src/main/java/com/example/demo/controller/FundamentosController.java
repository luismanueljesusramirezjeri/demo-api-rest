package com.example.demo.controller;


import com.example.demo.model.APIResponse;
import com.example.demo.service.IFundamentosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Todas nuestras constantes van hacer inyectada por el contructor
//@RequiredArgsConstructor
//Deja de ser una clase comun y puede recibir peticiones @RestController
@RestController
//Esto sirve para que del dominio localhost todo lo que venga se pueda dar una direccion api/v1/fundamentos
@RequestMapping("api/v1/fundamentos")
public class FundamentosController {


    //principio solid implemntar interfaces en vez de clases
    private  final IFundamentosService iFundamentosService ;

    public FundamentosController(IFundamentosService iFundamentosService) {
        this.iFundamentosService = iFundamentosService;
    }

    //Es una anotación de Spring que se utiliza para mapear solicitudes
    // HTTP de tipo GET a un método específico en un controlador REST.
    @GetMapping("/ejercicio1")
    public String ejercicio1(){
        return "Hola Mundo REST";
    }


    //http://localhost:8090/api/v1/fundamentos/primo?numero=1
    //http://localhost:8090/api/v1/fundamentos/primo?numero=1
    //http://localhost:8090/api/v1/fundamentos/primo?numero=1
    @GetMapping("/primo")
    public ResponseEntity<APIResponse<String>>
        validarPrimo(@RequestParam int numero){
        String respuesta = iFundamentosService.validarNumeroPrimo(numero);

        APIResponse<String> response = new APIResponse<>();
        response.setData(respuesta);
        response.setMensaje("Ejercicio ejecutado correctamente");
        return ResponseEntity.ok(response);
    }

    //http://localhost:8090/api/v1/fundamentos/factorial?numero=1
    //http://localhost:8090/api/v1/fundamentos/factorial?numero=1
    @GetMapping("/factorial")
    public ResponseEntity<APIResponse<String>>
    factorial(@RequestParam int numero){
        String respuesta = iFundamentosService.calcularFactorial(numero);

        APIResponse<String> response = new APIResponse<>();
        response.setData(respuesta);
        response.setMensaje("Ejercicio ejecutado correctamente");
        return ResponseEntity.ok(response);
    }

    //http://localhost:8090/api/v1/fundamentos/finonacci?numero=1
    //http://localhost:8090/api/v1/fundamentos/finonacci?numero=1
    //http://localhost:8090/api/v1/fundamentos/finonacci?numero=1
    @GetMapping("/finonacci")
    public ResponseEntity<APIResponse<String>>
    finonacci(@RequestParam int numero){
        String respuesta = iFundamentosService.calcularFactorial(numero);

        APIResponse<String> response = new APIResponse<>();
        response.setData(respuesta);
        response.setMensaje("Ejercicio ejecutado correctamente");
        return ResponseEntity.ok(response);
    }
}
