import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;


public class SearchCep {

    public Adress searchAdress(String cep) {
        if (!cep.matches("\\d{8}")) {
            throw new IllegalArgumentException("Invalid. Make sure it contains 8 numeric digits.");
        }
        URI adress = URI.create("https://viacep.com.br/ws/" + cep + "/json");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(adress)
                .build();
        HttpResponse<String> response;
        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("There is no address available.");
        }

        String responseBody = response.body();
        JsonObject jsonResponse;
        if (response.statusCode() != 200) {
            throw new RuntimeException("Error fetching address: response code " + response.statusCode());
        }
        try {
            jsonResponse = JsonParser.parseString(responseBody).getAsJsonObject();
        } catch (JsonSyntaxException e) {
            throw new RuntimeException("Unexpected response from the server. Check and try again.");
        }

        if (jsonResponse.has("error") && jsonResponse.get("error").getAsBoolean()) {
            throw new IllegalArgumentException("Invalid.");
        }

        return new Gson().fromJson(response.body(), Adress.class);
    }
}


