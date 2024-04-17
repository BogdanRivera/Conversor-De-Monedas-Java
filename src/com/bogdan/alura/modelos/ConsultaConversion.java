package com.bogdan.alura.modelos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    public MonedaResponse consultarConversion(String key, String tipoMoneda){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/"+key+"/latest/"+tipoMoneda))
                .build();

        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),MonedaResponse.class);
        }catch (Exception e){
            throw new RuntimeException("El tipo de moneda no se encuentra en la base de datos");
        }
    }
}
