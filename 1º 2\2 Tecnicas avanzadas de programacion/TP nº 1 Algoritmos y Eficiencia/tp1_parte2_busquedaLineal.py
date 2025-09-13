# Búsqueda Lineal
# 1. Escribir el algoritmo en pseudocódigo (PSeInt).
# 2. Explicar brevemente cómo funciona.
# 3. Implementar la función busqueda_lineal(arreglo, valor) en Python
# que devuelva la posición del valor si está, o -1 si no está.
# 4. Probar con varios ejemplos y analizar cuántas comparaciones realiza
# (comentarlo).

import random

def rellenarAzar(tamanio):
    for _ in range(tamanio-1):
        arr.append(random.randint(0,tamanio))



def busquedaLin(arr, buscar):
    tamanio=len(arr)
    i=0
    while(i < tamanio-1):
        if (buscar == arr[i]):
            return i
        else:
            i=i+1
    return -1



tamanio = int(input ('Ingrese tamanio del arreglo.\n'))
buscar = int(input ('Ahora ingrese ele elemento a buscar.\n'))
arr=[]

rellenarAzar(tamanio)
ret= int (busquedaLin(arr, buscar))

if ret == -1:
    print("El elemento no se encuentra...\n")
else:
    print('El elemento se encuentra en ' + str(ret) + '\n')