import re # Importamos la librería para utilizar los comandos de Regex

print("\n*** ¡Bienvenido! ***")
print("\nEste algoritmo te permite clasificar por partes un texto ingresado (int, float, boolean, str, listas).")

texto = input("\nPor favor, ingresa un texto de tu preferencia: ")

patron_enteros = r"-?\b\d+\b" # Patron para extraer números enteros
patron_flotantes = r"-?\b\d+\.\d+\b" # Patrón para extraer números flotantes
patron_booleanos = r"\b(False|True)\b" # Patrón para extraer valores booleanos
patron_string = r"\"(.*?)\"" # Patrón para extraer strings
patron_listas = r"\[[^\]]+\]" # Patrón para extraer listas

enteros = re.findall(patron_enteros, texto) 
flotantes = re.findall(patron_flotantes, texto)
booleans = re.findall(patron_booleanos, texto, re.IGNORECASE) # re.IGNORECASE ignora lo que son mayúsuculas y minúsculas
strings = re.findall(patron_string, texto)
listas = re.findall(patron_listas, texto)

print("--------------------------------------")
print("→ Enteros encontrados:", enteros)
print("Cantidad elementos encontrados: ", len(enteros))
print("--------------------------------------")
print("→ Flotantes encontrados:", flotantes)
print("Cantidad elementos encontrados: ", len(flotantes))
print("--------------------------------------")
print("→ Booleanos encontrados:", booleans)
print("Cantidad elementos encontrados: ", len(booleans))
print("--------------------------------------")
print("→ Strings encontrados:", strings)
print("Cantidad elementos encontrados: ", len(strings))
print("--------------------------------------")
print("→ Listas encontradas:", listas)
print("Cantidad elementos encontrados: ", len(listas))
print("--------------------------------------")
