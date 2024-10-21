# Conversor de Monedas

Este proyecto es un conversor de monedas que utiliza una API de tipo de cambio para obtener las tasas de cambio entre diferentes monedas.

## Tabla de Contenidos
 [Descripción](#descripción)
 [Clases](#clases)
   - [ConversorAPI.java](#conversorapijava)
   - [ConversorMonedas.java](#conversormonedasjava)
   - [Moneda.java](#monedajava)
 
 [Instalación](#instalación)
 [Uso](#uso)
 [Créditos](#créditos)
 [Licencia](#licencia)

## Descripción
El proyecto consta de tres clases principales que trabajan juntas para proporcionar una funcionalidad de conversión de monedas:

- `ConversorAPI.java`: Esta clase proporciona una funcionalidad para obtener la tasa de cambio entre dos monedas utilizando una API de tipo de cambio.
- `ConversorMonedas.java`: Esta clase implementa una aplicación de consola llamada "Conversor de Monedas" que permite al usuario convertir entre diferentes monedas.
- `Moneda.java`: Esta clase define un objeto Moneda que tiene un nombre y un valor.

## Clases

### ConversorAPI.java
Esta clase proporciona dos métodos:

- `obtenerTasaCambio(String monedaOrigen, String monedaDestino)`: Este método realiza una solicitud a la API de tipo de cambio, analiza la respuesta JSON y devuelve la tasa de cambio entre las dos monedas especificadas.
- `obtenerRespuestaApi(String urlApi)`: Este método realiza una solicitud HTTP GET a la URL proporcionada, lee la respuesta y la devuelve como una cadena de texto.

La clase utiliza la biblioteca Gson para trabajar con datos JSON y las clases de Java para hacer solicitudes HTTP.

### ConversorMonedas.java
Esta clase implementa una aplicación de consola llamada "Conversor de Monedas" que permite al usuario convertir entre diferentes monedas. Específicamente, realiza lo siguiente:

- Muestra un menú con diferentes opciones de conversión de monedas (Dólar a Peso Argentino, Peso Argentino a Dólar, etc.).
- Permite al usuario seleccionar una opción del menú.
- Solicita al usuario que ingrese la cantidad a convertir.
- Utiliza la clase `ConversorAPI` para obtener la tasa de cambio entre las monedas seleccionadas.
- Calcula el resultado de la conversión y lo muestra al usuario.
- Repite el proceso hasta que el usuario decida salir de la aplicación.

La aplicación utiliza la clase `Scanner` para leer la entrada del usuario y la clase `DecimalFormat` para dar formato a los resultados de la conversión.

### Moneda.java
Esta clase define un objeto Moneda que tiene un nombre y un valor. Proporciona constructores, getters y setters para acceder y modificar estos atributos.

## Instalación
Para instalar y ejecutar el proyecto, sigue estos pasos:

1. Clona el repositorio en tu máquina local.
2. Asegúrate de tener Java instalado en tu sistema.
3. Compila y ejecuta el proyecto utilizando tu IDE o la línea de comandos.

## Uso
Una vez que hayas instalado el proyecto, puedes ejecutar la aplicación de consola "Conversor de Monedas" y seguir las instrucciones en pantalla para convertir entre diferentes monedas.

## Créditos
Este proyecto fue desarrollado por Jesús Mata García.
