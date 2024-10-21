import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorMonedas {
    private static final Scanner escaner = new Scanner(System.in);
    private static final DecimalFormat formatoDecimal = new DecimalFormat("#.00");

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            try {
                int opcion = Integer.parseInt(escaner.nextLine());
                if (opcion == 7) break;
                manejarOpcion(opcion);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese una opción válida.");
            }
        }
        System.out.println("Gracias por usar el Conversor de Monedas.");
    }

    //muestra el menú principal
    private static void mostrarMenu() {
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("===== Sea bievenido/a al Conversor de Monedas ======");
        System.out.println("1) Dolar —> Peso Argentino");
        System.out.println("2) Peso Argentino —> Dolar");
        System.out.println("3) Dolar —> Real Brasileno");
        System.out.println("4) Real Brasileno —> Dolar");
        System.out.println("5) Dolar —> Peso Colombiano");
        System.out.println("6) Peso Colombiano —> Dolar");
        System.out.println("7) Salir");
        System.out.println("==> Elija una Opción Válida:");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }

    //maneja la opción seleccionada por el usuario
    private static void manejarOpcion(int opcion) {
        String monedaOrigen = null, monedaDestino = null;
        switch (opcion) {
            case 1:
                monedaOrigen = "USD";
                monedaDestino = "ARS";
                break;
            case 2:
                monedaOrigen = "ARS";
                monedaDestino = "USD";
                break;
            case 3:
                monedaOrigen = "USD";
                monedaDestino = "BRL";
                break;
            case 4:
                monedaOrigen = "BRL";
                monedaDestino = "USD";
                break;
            case 5:
                monedaOrigen = "USD";
                monedaDestino = "COP";
                break;
            case 6:
                monedaOrigen = "COP";
                monedaDestino = "USD";
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
                return;
        }

        System.out.print("Ingrese la cantidad a convertir: ");
        try {
            double cantidad = Double.parseDouble(escaner.nextLine());
            double tasaCambio = ConversorAPI.obtenerTasaCambio(monedaOrigen, monedaDestino);
            double resultado = cantidad * tasaCambio;
            System.out.println("Resultado: " + formatoDecimal.format(resultado) + " " + monedaDestino);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.");
        }
    }
}
