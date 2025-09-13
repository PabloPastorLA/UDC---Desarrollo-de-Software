# 1. Crear un archivo llamado tp1_basico.py.
# 2. Escribir un programa que:
#     ○ Lea n números desde teclado y los guarde en un arreglo.
#     ○ Imprima el arreglo original.
#     ○ Calcule e imprima el promedio.

# Lectura del tamaño del arreglo
n=int(input('ingrese cant de nros\n'))
arr=[]

# Cargamos valores al arreglo
for i in range(0, n):
    arr.append (int(input ('Ingrese nro\n')))

# Mostramos contenido del arreglo y el promedio
prom=0
for i in arr:
    print(i)
    prom+=i
print('Promedio: ' + str(prom / len(arr)))





