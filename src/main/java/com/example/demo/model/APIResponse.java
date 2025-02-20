package com.example.demo.model;

import lombok.Builder;
import lombok.Data;


//@Builder  //ES UN PATRIN DE DISEÑO  - ES UN PATRON DE ENCAPSULAMIENTO
//@Data //DATA ESTO ES COMO GET - SET
public class APIResponse <T>{


    private  T data;
    private  String error;
    private String mensaje;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
