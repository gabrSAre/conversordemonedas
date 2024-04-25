package com.challencealura.conversordemonedas.parametros;

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
        return """
                ( El valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s] )
                """.formatted(valorAconvertir,monedaOrigen,valorConvertido,monedaDestino);
    }
}


      /*  "( " +
        "El valor "+ valorAconvertir + " " +
        "[" + monedaOrigen + "]"+
        " corresponde al valor final de " +
        "=>>> " + valorConvertido + " " +
        "[" + monedaDestino + "]" +
        " )";*/

