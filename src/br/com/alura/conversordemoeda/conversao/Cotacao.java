package br.com.alura.conversordemoeda.conversao;

import br.com.alura.conversordemoeda.modelos.Nomeclatura;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Cotacao {

    public String obterEndereco(String endereco) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body();
        Moedas minhasMoedas = gson.fromJson(json, Moedas.class);
        Nomeclatura minhaNomeclatura = new Nomeclatura(minhasMoedas);
        System.out.println(minhaNomeclatura);
        return json;
    }
}