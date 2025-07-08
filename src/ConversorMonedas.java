import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.Scanner;


public class ConversorMonedas {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/b1c4cc5a0b77a579ef0f7931/latest/USD";
    private static final Scanner scanner = new Scanner(System.in);
    private static final Gson gson = new Gson();
    private static Map<String, Double> rates;

    public static void main(String[] args) {
        // Obtener tasas de cambio
        if (!obtenerTasasCambio()) {
            System.out.println("Error al conectar con la API. Verifique su conexión.");
            return;
        }

        // Mostrar menú
        mostrarMenu();
    }

    private static boolean obtenerTasasCambio() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .build();

            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);
                rates = apiResponse.conversion_rates();
                return true;
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    private static void mostrarMenu() {
        System.out.println("*".repeat(70));
        System.out.println("Sea bienvenido/a al Conversor de Monedas =]");
        System.out.println();

        while (true) {
            System.out.println("1) Dólar >>> Peso argentino");
            System.out.println("2) Peso argentino >>> Dólar");
            System.out.println("3) Dólar >>> Real brasileño");
            System.out.println("4) Real brasileño >>> Dólar");
            System.out.println("5) Dólar >>> Peso colombiano");
            System.out.println("6) Peso colombiano >>> Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida:");
            System.out.println("*".repeat(70));

            int opcion = leerOpcion();

            if (opcion == 7) {
                System.out.println("¡Gracias por usar el conversor de monedas!");
                break;
            }

            procesarOpcion(opcion);
        }
    }

    private static int leerOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static void procesarOpcion(int opcion) {
        String desde, hacia;
        double tasa;

        switch (opcion) {
            case 1 -> { desde = "USD"; hacia = "ARS"; tasa = rates.get("ARS"); }
            case 2 -> { desde = "ARS"; hacia = "USD"; tasa = 1.0 / rates.get("ARS"); }
            case 3 -> { desde = "USD"; hacia = "BRL"; tasa = rates.get("BRL"); }
            case 4 -> { desde = "BRL"; hacia = "USD"; tasa = 1.0 / rates.get("BRL"); }
            case 5 -> { desde = "USD"; hacia = "COP"; tasa = rates.get("COP"); }
            case 6 -> { desde = "COP"; hacia = "USD"; tasa = 1.0 / rates.get("COP"); }
            default -> {
                System.out.println("Opción no válida. Intente nuevamente.\n");
                return;
            }
        }

        realizarConversion(desde, hacia, tasa);
    }

    private static void realizarConversion(String desde, String hacia, double tasa) {
        System.out.printf("Ingrese el valor que desea convertir de %s a %s: ", desde, hacia);

        try {
            double cantidad = Double.parseDouble(scanner.nextLine());

            if (cantidad < 0) {
                System.out.println("El valor debe ser positivo.\n");
                return;
            }

            double resultado = cantidad * tasa;
            ConversionResult conversion = new ConversionResult(cantidad, desde, resultado, hacia);

            System.out.println(conversion);
            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.\n");
        }
    }
}