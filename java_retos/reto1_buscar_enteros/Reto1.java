// Reto 1: Buscar enteros en un texto usando regex en Java
// Paso a paso:
// 1. Leer el texto de entrada.
// 2. Definir una expresión regular para encontrar números enteros.
// 3. Buscar todos los enteros en el texto.
// 4. Imprimir los resultados.

import java.util.regex.*;

public class Reto1 {
    public static void main(String[] args) {
        String texto = "En la tienda compré 2 manzanas, -5 naranjas y 10 plátanos. El cajero me dijo que debía pagar -7500 pesos, pero yo solo tenía 5000. Al final, mi primo me prestó -2500 y quedamos a mano después de 3 días.";
        // Expresión regular para enteros (positivos y negativos)
        // Patrón sugerido: "-?\\b\\d+\\b"
        String patron = "-?\\b\\d+\\b";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        System.out.print("Enteros encontrados: ");
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
