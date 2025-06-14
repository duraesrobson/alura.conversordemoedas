
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConversorMoeda {

    public ConversorMoeda(String moedaBase, String moedaAlvo, String amount ) throws IOException, InterruptedException{

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/423075ff7ee8c30a8084e000/pair/" + moedaBase + "/" + moedaAlvo + "/" + amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                    .uri(endereco)
                    .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);
    }
}
