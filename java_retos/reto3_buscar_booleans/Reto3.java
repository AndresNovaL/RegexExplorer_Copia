// Reto 3: Buscar valores booleanos en un texto usando regex en Java
// Paso a paso:
// 1. Leer el texto de entrada.
// 2. Definir una expresión regular para encontrar valores booleanos (True/False).
// 3. Buscar todos los booleanos en el texto.
// 4. Imprimir los resultados.

import java.util.regex.*;

public class Reto3 {
    public static void main(String[] args) {
        String texto = "En el examen de lógica respondí True en la primera pregunta, luego marqué False en la segunda. Mi amigo puso True en casi todas, pero al final la última era False.";
        // Expresión regular para booleanos (True o False, case-insensitive)
        // Patrón Sugerido = "\\b(False|True)\\b"
        String patron = "\\b(True|False)\\b";
        Pattern pattern = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(texto);
        System.out.print("Booleanos encontrados: ");
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
