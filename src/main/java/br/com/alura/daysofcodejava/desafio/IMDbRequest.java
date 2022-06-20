package br.com.alura.daysofcodejava.desafio;

import br.com.alura.daysofcodejava.desafio.model.ResultadoConsulta;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.NoSuchElementException;

public class IMDbRequest {

    public static void main(String[] args) throws Throwable {

        String key = "k_bwrgwv8i";
        URI apiIMDB = URI.create("https://imdb-api.com/en/API/Top250TVs/" + key);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(apiIMDB)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        ResultadoConsulta resultadoConsulta = new ObjectMapper().readValue(response.body(),ResultadoConsulta.class);
        System.out.println(resultadoConsulta);


    }

}
