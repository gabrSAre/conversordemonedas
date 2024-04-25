package com.challencealura.conversordemonedas.parametros;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class BuscadorDeMonedas {



    public String buscadorDeMonedas(String monedaOrigen, String monedaDestino, double valorMoneda) throws IOException, InterruptedException {

        String codigo = "https://v6.exchangerate-api.com/v6/7da53bbc03e1c2033486b9c4/pair/" + monedaOrigen +
                "/" + monedaDestino+ "/" + valorMoneda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(codigo))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();

    }






}
