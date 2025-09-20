# Búsqueda Lineal
# 1. Escribir el algoritmo en pseudocódigo (PSeInt).
# 2. Explicar brevemente cómo funciona.
# 3. Implementar la función busqueda_lineal(arreglo, valor) en Python
# que devuelva la posición del valor si está, o -1 si no está.
# 4. Probar con varios ejemplos y analizar cuántas comparaciones realiza
# (comentarlo).

import random

def rellenarAzar():
    for _ in range(tamanio):
        arr.append(random.randint(0,tamanio))

def mostrarArr():
    print('-----------')
    for ele in arr:
        print (ele)
    print('-----------')

def ordenamientoBurbuja():
    for _ in range (len(arr)-1):
        for i in range(len(arr)-1):
            # print('actual: ' + str(i))
            if arr[i] > arr[i+1]:
                aux=arr[i]
                arr[i]=arr[i+1]
                arr[i+1]=aux


# def ordenamientoBurbuja():
#     for i in range(arr):
#         print('actual: ' + str(arr[i]) + 'sgte: ' + str(arr[i+1]))



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
# buscar = int(input ('Ahora ingrese ele elemento a buscar.\n'))
arr=[]







rellenarAzar()
# arr[1] = 9
# print(arr)
# print(arr[1])

# exit(0)
# mostrarArr()
print(arr)
ordenamientoBurbuja()
print(arr)
# ret= int (busquedaLin(arr, buscar))
# mostrarArr()

# if ret == -1:
#     print("El elemento no se encuentra...\n")
# else:
#     print('El elemento se encuentra en ' + str(ret) + '\n')