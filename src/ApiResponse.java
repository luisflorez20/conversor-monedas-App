import java.util.Map;

// Record para la respuesta de la API
record ApiResponse(
        String result,
        Map<String, Double> conversion_rates
) {}

// Record para el resultado de conversión
record ConversionResult(
        double originalAmount,
        String fromCurrency,
        double convertedAmount,
        String toCurrency
) {
    @Override
    public String toString() {
        return String.format("El valor %.2f [%s] corresponde al valor final de >>> %.2f [%s]",
                originalAmount, fromCurrency, convertedAmount, toCurrency);
    }
}