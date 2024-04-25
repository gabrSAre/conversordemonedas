package com.challencealura.conversordemonedas;

public class ParametrosMonedas {
    double valorConvertido;
    double valorAconvertir;
    String monedaOrigen;
    String monedaDestino;



    public void Parametros(ParametrosExchangeApi parametros){
        this.valorConvertido = parametros.conversion_result();
        this.monedaOrigen=parametros.base_code();
        this.monedaDestino= parametros.target_code();
    }

    public void setValorAconvertir(double valorAconvertir) {
        this.valorAconvertir = valorAconvertir;
    }




    @Override
    public String toString() {
        return "( " +
                "El valor "+ valorAconvertir + " " +
                "[" + monedaOrigen + "]"+
                " corresponde al valor final de " +
                "=>>> " + valorConvertido + " " +
                "[" + monedaDestino + "]" +
                " )";
    }
}

