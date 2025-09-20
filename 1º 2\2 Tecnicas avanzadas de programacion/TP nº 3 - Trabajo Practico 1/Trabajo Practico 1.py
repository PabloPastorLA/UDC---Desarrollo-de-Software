import datetime


def main():

    cant = 100000
    arreglo5x1 = arreglo5x2= arreglo5x3= arregloRandom(cant)

    print("Arreglo de " + str(cant) + " elementos creado!\nComienzo a computar el tiempo\n")

    tiempoInicio=datetime.datetime.now()
    ordenamientoPorInsercion(arreglo5x1)
    print ("Terminé ordenamientoPorInsercion(arreglo5x)")
    mostrarTiempos(tiempoInicio)


    tiempoInicio=datetime.datetime.now()
    ordenamientoBurbuja(arreglo5x2)
    print ("Terminé ordenamientoBurbuja(arreglo5x)")
    mostrarTiempos(tiempoInicio)


    tiempoInicio=datetime.datetime.now()
    ordenamientoPorSeleccion(arreglo5x3)
    print ("Terminé ordenamientoPorSeleccion(arreglo5x)")
    mostrarTiempos(tiempoInicio)


    print("\nAhora vamos a comparar tiempos de las busquedas\n")
    buscar=1000    
    arreglo5x = arregloRandom(cant)
    arreglo5xOrdenado= ordenamientoPorInsercion(arreglo5x)
    print("Arreglo de " + str(cant) + " elementos creado y ordenado!\nComienzo a computar el tiempo\n")


    tiempoInicio=datetime.datetime.now()
    pos=busquedaLineal(arreglo5xOrdenado, buscar)
    print("En posicion: " + str(pos)) if pos >=0 else print("No se encontró")
    print ("Terminé busquedaLineal(arreglo5xOrdenado)")
    mostrarTiempos(tiempoInicio)
    

    tiempoInicio=datetime.datetime.now()
    pos= busquedaBinaria(arreglo5xOrdenado, buscar)
    print("En posicion: " + str(pos)) if pos >=0 else print("No se encontró")
    print ("Terminé busquedaLineal(arreglo5xOrdenado)")
    mostrarTiempos(tiempoInicio)

    # arreglo=[1, 2, 3, 4, 6, 7]

    # print(busquedaBinaria(arreglo, 0))
    # print(busquedaBinaria(arreglo, 1))
    # print(busquedaBinaria(arreglo, 2))
    # print(busquedaBinaria(arreglo, 3))
    # print(busquedaBinaria(arreglo, 4))
    # print(busquedaBinaria(arreglo, 5))
    # print(busquedaBinaria(arreglo, 6))
    # print(busquedaBinaria(arreglo, 7))
    # print(busquedaBinaria(arreglo, 8))
    # print(busquedaBinaria(arreglo, 9))

    # arreglo=[1,9,2,8,3,7,6,15,438,222,1946,5,7]
    # print(arreglo)
    # print(ordenamientoPorSeleccion(arreglo))
    
    # arreglo500 = arregloRandom(500000)
    # print(arreglo20)
    # print(ordenamientoPorInsercion(arreglo20))

    # arreglo=[1, 2, 3, 4, 5]
    # print(arreglo)
    # print(ordenamientoBurbuja(arreglo))
    
    # arreglo20 = arregloRandom(20)
    # print(arreglo20)
    # print(busquedaLineal(arreglo20, 9))



#-----------------------------------------------------------------------------
# Definimos el punto medio correspondiente al arreglo en el cual buscar.
# Loopeamos hasta encontrar el elemento buscado o que no podamos redefinir
# un rango distinto. En caso de que el elemeno a buscar se escuentre en una
# posicion superior o inferior a dicho pto medio, el rango se va ajustando.
# Repetimos hasta alcanzar un retorno 
                                                        # tiempo | espacio
def busquedaBinaria(arreglo, elementoABuscar):          #              n
    min=0                                                             
    max=len(arreglo)                                                                                                               
    medUlt=med=int(max/2)                                                                                                               
    while True:                                         # log₂n               
        if elementoABuscar == arreglo[med]:                                         
            return med                                                
        elif elementoABuscar > arreglo[med]:                                         
            min=med                                                   
        elif elementoABuscar < arreglo[med]:                                         
            max=med                                                   
        
        med=int((max-min)/2+min)                                                
        if med == medUlt: return -1                                                
        medUlt=med                                                        
                                                        #--------    |------------------                  
                                                        # O(log₂n)   |   O(n)             
                                                        #            | si bien el arreglo se definió en el main() 
                                                        #            | el analisis de espacio lo realizamos en cada funcion      

#  Analisis temporales:
#  Mejor caso: O(1) (lo encuentra a la primera).
#  Peor caso: las veces a buscar son igual a log₂n.
#  Caso médio: sigue siendo log₂n, solo que menos veces 

#  Dureza al tipearlo de cero: 3/3
#  Conveniencia: cuando hay tiempo tiempo para tipear y con arreglos grandes
#-----------------------------------------------------------------------------

# Recorremos el arreglo comparando los valores hasta encontrar el elemento
# buscado o alcanzar el final del ciclo de iteración. Si lo encuentra retorna la
# posición, sino, -1.
                                                        # tiempo | espacio
def busquedaLineal(arreglo, elementoABuscar):           #        |      n                             
    for pos in range(len(arreglo)):                     # n      |                              
        if arreglo[pos] == elementoABuscar:             
            return pos                                  
    return -1                                                                               
                                                        #--------|------------------                  
                                                        # O(n)   |   O(n)
                                                        #        | si bien el arreglo se definió en el main() 
                                                        #        | el analisis de espacio lo realizamos en cada funcion      
#  Analisis temporales:
#  En todos los casos el orden es O(n), 
#  salvo el mejor que lo encuentra de una y sin bucle es O(1)

#  Dureza al tipearlo de cero: 1/3
#  Conveniencia: con falta de tiempo para tipear y si o si arreglos chicos(en caso de
#  no tener miles de años para poder correrlo, ya que tarda mucho comparada a la binaria)
#-----------------------------------------------------------------------------

# Recorremos el arreglo almacenando el menor valor y su posición. Luego lo posiciona
# en la ubicacion inicial. Repite este proceso "quitando" valores del rango de los desordenados
# y agregandolos al de los ordenados hasta terminar. 
                                                        # tiempo | espacio
def ordenamientoPorSeleccion(arreglo):                  #             n
    for h in range(0,len(arreglo)):                                          
        minValor=arreglo[h]                                   
        posicion=h                                      
                                                        
        for i in range(h+1,len(arreglo)):               # n²     |                           
            if minValor > arreglo[i]:                                          
                minValor = arreglo[i]                                          
                posicion = i                                                
        aux=arreglo[h]                                   
        arreglo[h]=arreglo[posicion]                                          
        arreglo[posicion]=aux                                          
    return arreglo                                      
                                                        #--------|------------------                  
                                                        #  O(n²) |   O(n)
                                                        #        | si bien el arreglo se definió en el main() 
                                                        #        | el analisis de espacio lo realizamos en cada funcion      
#  Analisis temporales:
#  En todos los casos el orden es O(n²), ya que si o si recorrre los 2 bucles 

#  Dureza al tipearlo de cero: 2/3
#  Conveniencia: con falta de tiempo para tipear, si o si entrada chica y solo si se
#  tiene el tiempo para correrlo (siempre hay 2 bucles anidados).
#-----------------------------------------------------------------------------


# Parte con el primer elemento como ordenado y compara el sgte. A medida que los encuentra
# desordenados comienza a iterar desde esa posicion hacia "atras" (con paso -1) hasta ubicar
# la posicion en la que debe estar. Lo coloca y continua hasta terminar las iteraciones.

                                                        # tiempo | espacio
def ordenamientoPorInsercion(arreglo):                  #        |    n        
    for i in range(0, len(arreglo)-1):                  # n     -->            mejor caso                         
        if arreglo[i]>arreglo[i+1]:                                                                     
            for j in range(i+1, 0, -1):                 # n²     |                              
                if arreglo[j-1]>arreglo[j]:                                         
                    swapear(arreglo, j-1, j)            # 3n²    |                                           
    return arreglo                                      
                                                        #---------------------------------------                  
                                                        #  O(n²) |   O(n)
                                                        #        | si bien el arreglo se definió en el main() 
                                                        #        | el analisis de espacio lo realizamos en cada funcion      
#  Analisis temporales:
#  Mejor caso: O(n) si o si recorre una vez al arreglo.
#  Peor caso: O(n²) al recorrer de forma inversa para ordenar.
#  Caso médio: O(n²) ya sea por ordenar solo algunos elementos
#  o por recorrer pocas posiciones de forma inversa ya es de orden O(n²)  

#  Dureza al tipearlo de cero: 3/3
#  Conveniencia: el mas duro al tipear pero mas efectivo ya que a pesar de ser O(n²) en
#  el promedio, swapea sololos valores necesarios a su posicion final (menos movimientos)
#-----------------------------------------------------------------------------

# Fuerza 2 bucles de iteracion para dar si o si todas las vueltas necesarias que puede
# demandar el swappear en el peor de los casos todos los elementos, (por eso el primer for
# no posee variable de iteracion, y posee un ' _ '). Es una especie de fuerza bruta. puede
# optimizarse con un flag sentinela. 
                                                        # tiempo | espacio
def ordenamientoBurbuja(arreglo):                       #             n                         
    for _ in range(len(arreglo)-1):
        salir=True              #Flag sentinela                                                        
        for j in range(len(arreglo)-1):                 #   n²   |                                  
            if arreglo[j]>arreglo[j+1]:                                                         
                swapear(arreglo, j+1, j)
                salir=False     #Flag sentinela
        if salir: break         #Flag sentinela                                                
    return arreglo                                                                              
                                                        #----------------------------------                          
                                                        # O(n²)  |   O(n)                        
                                                        #        | si bien el arreglo se definió en el main() 
                                                        #        | el analisis de espacio lo realizamos en cada funcion      
#  Analisis temporales:
#  O(n²) debido a que en todos los casos debe aplicar 2 bucles anidados
#  la diferencia de swapear o no los valores del arreglo tanto en tiempo como en espacio
#  es despreciable ya que se invierten solo vaores, no el arreglo completo. La ventaja la
#  la obtiene al incluir el flag sentinela en los mejores casos (lista poco desordenada)
#  Dureza al tipearlo de cero: 1/3
#  Conveniencia: con falta de tiempo para tipear, entrada poco desordenada, sinó usar insercion
#-----------------------------------------------------------------------------

# Genera un arreglo de enteros aleatorio. El tamaño y rango de generacion son iguales pero
# dinámicos, para pruebas.

def arregloRandom(tamanioYRango):                       # tiempo | espacio                                                       
    import random
    arregloARetornar=[]                                                       
    for i in range(tamanioYRango):                      #   n    |
        agregar=random.randint(1, tamanioYRango)                                                                                         
        arregloARetornar.append(agregar)                #        |    n                                  
    return arregloARetornar                                                          
                                                        #----------------------------------                          
                                                        #  O(n)  |   O(n)                        
                                                        #        | si bien la complejidad espacial de esta funcion es O(n), 
                                                        #        | Se realizó el analisis parcial en C/U de las funciones que lo utilizan      
#  Analisis temporales:
#  la complejidad es del orden O(n) tanto en temporal como espacial, ya que
#  se crea un arreglo dependiendo del parámetro recibido
#-----------------------------------------------------------------------------

# Una funcion para intercalar valores entre elementos de un arreglo.
# Para brindar algo de modularidad.
                                                        # tiempo |  espacio
def swapear(arr, indice1, indice2):                     #        |     1
    aux=arr[indice1]                                    #   1    |     1                      
    arr[indice1]=arr[indice2]                           #   1    |     1                              
    arr[indice2]=aux                                    #   1    |     1                      
    return arr                                          #   1    |     1                                            
                                                        #----------------------------------                          
                                                        #  O(1)  |    O(1)
                                                        #                         
#  Analisis temporales:
#  O(1) ya que las operaciones son del orden constantes.
#-----------------------------------------------------------------------------

def mostrarTiempos(tiempoInicio):
    print("-----------------------------------------------------------")
    print("t Inicio: " + str( tiempoInicio))
    print("t Fin:    " + str(datetime.datetime.now()))
    print("-----------------------------------------------------------")

main()
