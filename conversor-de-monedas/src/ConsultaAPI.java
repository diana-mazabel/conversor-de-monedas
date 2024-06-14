import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
     public Moneda consulta(String monedaBase, String monedaObjetivo){

         Moneda moneda = null;

        String userAPIKey = "0d3d15a4c3553a85dda2df1c";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+userAPIKey+"/latest/"+ monedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            JsonObject resultadoJSON = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject conversionRates = resultadoJSON.getAsJsonObject("conversion_rates");
            moneda = new Moneda(monedaBase,monedaObjetivo, conversionRates.get(monedaObjetivo).getAsDouble());

        }  catch (NumberFormatException | IOException | InterruptedException e) {
            System.out.println("Ocurrió un error");
            System.out.println(e.getMessage());
        }


        return moneda;
    }
}
