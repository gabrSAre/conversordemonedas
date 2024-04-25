package com.challencealura.conversordemonedas;

import java.io.IOException;

public class ConversorDeMonedas {
    public void conversorDeMonedas(String monedaOrigen , String modedaDestino ,double valor ){

        try {

            //Instanciando la clase ParametrosMonedas
            ParametrosMonedas parametros = new ParametrosMonedas();


            //Instanciando la clase BuscadorDeMonedas............................................
            BuscadorDeMonedas buscar = new BuscadorDeMonedas();

            //Generando datos en formato Json....................................................
            String json = buscar.buscadorDeMonedas(monedaOrigen,modedaDestino, valor );

            //Guardando el valor de la variable valor con fines de mostrarla en el toString de la clase ParametrosMonedas
            parametros.setValorAconvertir(valor);


            //Instanciando la clase com.challencealura.conversordemonedas.BibliotecaGson
            BibliotecaGson gson = new BibliotecaGson();

            //Utilizando el record ParametrosExchangeApi, para la deserialización..................
            ParametrosExchangeApi parametrosExchangeApi =gson.getGson()
                    .fromJson(json,ParametrosExchangeApi.class);

            parametros.Parametros(parametrosExchangeApi);
            System.out.println(parametros.toString());

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);

        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

    }
}
