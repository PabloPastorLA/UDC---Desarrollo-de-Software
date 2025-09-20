# Ejercicios:

#-------------------------------------------------
# Nivel 1 – Introducción

# Factorial de un número
# Implementar una función recursiva que calcule el factorial de un número entero n .
def factorial(n):
    # input("Pausa")
    if n<=1:
        valor = 1
        return valor
    else:
        return n * factorial(n-1)
# print('Factorial: ' + str(factorial(4)))

# Suma de los primeros n números
# Implementar suma_n(n) que calcule la suma de los números de 1 hasta n recursivamente.
def suma_n(n):
    if n <= 1:
        return n
    else:
        return n + suma_n(n-1)
# print('Suma: ' + str(suma_n(4)))

# # Potencia
# # Implementar una función recursiva potencia(a, b) que calcule a^b .
def potencia(a, b):
    # input()
    if b == 0:
        return 1
    else:
        return  a * potencia (a, b -1)
# print ("Potencia: " + str(potencia(2, 3)))

# #-------------------------------------------------
# # Nivel 2 – Secuencias

# # Serie de Fibonacci
# # Implementar fibonacci(n) que calcule el n-ésimo número de la serie.
def fibonacci(n):
    # ant=0
    # sum=1
    # if n==0: return ant
    # if n==1: return sum
    
    # while n>=2:
    #     aux=ant
    #     ant=sum
    #     sum=sum + aux
    #     n=n-1
    # return sum


    input()  
    #a=0  
    if n==0:
        return 0
    elif n==1:
        return 1
    else:
        return fibonacci(n-1) + fibonacci(n-2)
#print (fibonacci(6))



# # Producto de elementos de una lista
# # Implementar una función recursiva que calcule el producto de todos los elementos de una lista
# # de enteros.
def producto_lista(lista):
    input()
    # print(lista)
    if len(lista) == 1:
        return lista[0]
    else:
        return lista[len(lista)-1] * producto_lista(lista[:-1])
# print(producto_lista([1,8,5]))












# # Suma de elementos de una lista
# # Implementar una función recursiva que devuelva la suma de una lista de enteros.
def suma_lista(lista):
    # print (lista)
    input()
    if len(lista) == 1:
        n = lista[0]
        return lista[0]
    else:
        return lista[len(lista)-1] + suma_lista(lista[:-1])

# print (suma_lista([1, 3, 2]))

# #-------------------------------------------------
# # Nivel 3 – Cadenas y números

# # Inversión de una cadena
# # Implementar una función recursiva que invierta un string.
def invertir_cadena(cadena):
    input()
    # print (cadena)
    # print (cadena[1])
    # print (cadena[:-1])
    
    if len(cadena) == 1:
        return cadena[0]
    else:
        return cadena[len(cadena)-1] + invertir_cadena(cadena[:-1])
#print(invertir_cadena("odnum aloh"))


# # Conteo de caracteres en una cadena
# # Implementar una función recursiva que cuente cuántas veces aparece un carácter dado en una
# # cadena.
def contar_caracter(cadena, caracter):
    input()
    if len(cadena)==0:
        return 0
    else:
        input()
        if cadena[len(cadena)-1]==caracter:
            print("estoy")
            return contar_caracter(cadena[:-1], caracter) + 1
        if cadena[len(cadena)-1]!=caracter:
            print("ESTOY")
            return contar_caracter(cadena[:-1], caracter) +0        
#print(contar_caracter("Hasta aca", "a"))

# # Conteo de dígitos
# # Implementar una función recursiva que devuelva el número de dígitos de un entero positivo.
def contar_digitos(n):
    input()
    if n/10 < 1:
        return 1
    else:
        return 1 + contar_digitos(int(n/10)) 
#print(contar_digitos(9159))


# # Suma de dígitos
# # Implementar una función recursiva que calcule la suma de los dígitos de un número entero
# # positivo.
def suma_digitos(n):
    input()
    # print(n%10)         #resto
    # print(int(n/10))    #cociente   
    if n/10 < 1:
        return n
    else:
        return suma_digitos(int(n/10))  + n%10

#print(suma_digitos(7125))

# #-------------------------------------------------
# # Nivel 4 – Pensamiento recursivo

# # Número binario
# # Implementar una función recursiva que reciba un número entero positivo y devuelva su
# # representación binaria como cadena.
def a_binario(n):
    input()
    if n <= 1:
        return n
    else:
        return str(a_binario(int(n/2))) + str(n % 2)  
#print(a_binario(9))

# # Palíndromo recursivo
# # Implementar una función recursiva que determine si una cadena es un palíndromo.
def es_palindromo(cadena):
    input()
    if len(cadena)<=2:
        return cadena[len(cadena)-1] == cadena[0]
    else:

        return es_palindromo(cadena[:-1][1:]) and cadena[len(cadena)-1] == cadena[0] 

        # if cadena[0] == cadena[len(cadena)-1]:
        #     return True
        # else: 
        #     return False

#print(es_palindromo("aeRouoiea"))


# # Mínimo común divisor (MCD)
# # Implementar el algoritmo de Euclides recursivo para calcular el MCD de dos números.
def mcd(a, b):
    #print("Minimo comun divisor: 1 \U0001F92F")
    input()
    if a == 1 or b == 1: return 1 
    elif a == 0 and b == 0: return 0
    elif a == 0: return b
    elif b == 0: return a
    elif a % b == 0: return b
    elif b % a == 0: return a
    
    else:
        return mcd(a, b-1)
    # if a < b: a, b = b, a
    # if a % b == 0: return b
    # for i in range(int(b/2),1,-1):
    #     if b%i ==0 and a%i == 0: return i
    
    # return mcd(a, b-1)
    

print(mcd(30,4))



