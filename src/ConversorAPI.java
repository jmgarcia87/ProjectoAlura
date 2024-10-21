import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConversorAPI {
    private static final String URL_API = "https://v6.exchangerate-api.com/v6/36f4d3446fca88835cc7e7c7/latest/";

    //metodo para obtener la tasa de cambio
    public static double obtenerTasaCambio(String monedaOrigen, String monedaDestino) {
        String respuestaJson = obtenerRespuestaApi(URL_API + monedaOrigen);
        JsonObject objetoJson = new Gson().fromJson(respuestaJson, JsonObject.class);
        return objetoJson.getAsJsonObject("conversion_rates").get(monedaDestino).getAsDouble();
    }

    //metodo para hacer la solicitud HTTP
    private static String obtenerRespuestaApi(String urlApi) {
        StringBuilder resultado = new StringBuilder();
        try {
            URL url = new URL(urlApi);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            BufferedReader lector = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String linea;
            while ((linea = lector.readLine()) != null) {
                resultado.append(linea);
            }
            lector.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado.toString();
    }
}
