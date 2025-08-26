// Reto 2: Buscar números flotantes en un texto usando regex en Java
// Paso a paso:
// 1. Leer el texto de entrada.
// 2. Definir una expresión regular para encontrar números flotantes.
// 3. Buscar todos los flotantes en el texto.
// 4. Imprimir los resultados.

import java.util.regex.*;

public class Reto2 {
    public static void main(String[] args) {
        String texto = "El litro de gasolina cuesta 15.75 pesos, mientras que el pasaje del bus está en -2.50. Ayer caminé 3.2 km, aunque mi app marcó solo -2.9. Al final terminé gastando 20.00 en todo el día, aunque el banco me descontó -5.50 por comisión.";
        // Expresión regular para flotantes (números con punto decimal)
        // Patrón Sugerido: patron = "-?\\b\\d+\\.\\d+\\b"
        String patron = "-?\\b\\d+\\.\\d+\\b";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        System.out.print("Flotantes encontrados: ");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();
        // Paso a paso:
        // 1. Cambia el texto de prueba.
        // 2. Modifica la expresión regular si es necesario.
        // 3. Ejecuta el programa y observa los resultados.
    }
}
