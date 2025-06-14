
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversorMoeda {

    public Moeda ConversorMoeda(String moedaBase, String moedaAlvo, String amount ) {

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/423075ff7ee8c30a8084e000/pair/" + moedaBase + "/" + moedaAlvo + "/" + amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                    .uri(endereco)
                    .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());    
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.fromJson(response.body(), Moeda.class);


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro!");
        }


    }
}
