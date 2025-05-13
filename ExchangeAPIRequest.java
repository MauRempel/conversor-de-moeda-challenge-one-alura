import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeAPIRequest {

    public ExchangeRecord exchangeAPIRequest (String moedaOrigem, String moedaDestino, double quantidade) throws IOException, InterruptedException {

        // faz a requisição da API passando os parâmetros moedaOrigem, moedaDestino e quantidade
        String apiKey = "SUA_API_KEY";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + moedaOrigem + "/" + moedaDestino + "/" + quantidade))
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), ExchangeRecord.class); //retorna o objeto com as informações da API para a classe ExchangeRecord

    }
}
