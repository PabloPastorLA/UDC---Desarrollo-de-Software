import datetime


def ejercicio1(listaAEvaluar): #Nro mas frecuente
    #Creamos una lista a mano para evaluar y definimos otra como contador, 
    #del tamaño del elemento de valor máximo de la lista a evaluar  
    listaContador=[0] * (int((max(listaAEvaluar))) + 1)                                         # 1

    #Recorremos la lista a evaluar e incrementamos en 1 el elemento de la posicion 
    # de la lista contador que corresponde con el valor del elemento de la lista a evaluar
    for x in listaAEvaluar:                                                                     # n
        listaContador[x]= int(listaContador[x]) +1                                              # n

    #Recorremos la lista contador para obtener la posicion del elemento de valor mayor
    #Dicha posicion se corresponde con el maximo valor de los elementos de la que evaluamos
    maximo=-1                                                                                   # 1
    for x in range(len(listaContador)):                                                         # n
        if x>maximo: maximo = x                                                                 # n

    #Informamos y para la posteridad retornamos el valor.
    print('El valor mas grande de la lista es: ' + str(x))                                      # 1
    return x                                                                                    # 1
                                                                                        #-------------------
                                                                                            # 4n+5 => n
def ejercicio2(listaAEvaluar):
    #De una lista definida en el script, con un solo ciclo de iteracion comparamos
    #sus elementos desde los extremos hasta el centro de la misma. 
    for x in range(len(listaAEvaluar)):                                                         # n

        #En caso de discrepancia se informa que no es palindroma y se retorna falso.
        if listaAEvaluar[x] != listaAEvaluar[len(listaAEvaluar) - x-1]:                         # n
            print('La lista NO es palindroma')                                                  # n
            return False                                                                        # n
        #al alcanzarse el centro de la lista se rompe el loop 
        if x >= len(listaAEvaluar)-x-1: break                                                   # n
    #al finalizar el bucle se informa y se retorna verdadero
    print('La lista SI es palindroma')                                                          # 1
    return True                                                                                 # 1
                                                                                        #------------------
                                                                                            # 5n +3 -> n
def ejercicio3(listaAEvaluar):
    #Para contar unicos se realizan 2 ciclos de iteracion, para comparar c/ elemento
    #contra el resto. Se marca en verdadero un flag, el cual se niega al encontrarse una
    #igualdad de elementos. Si al terminar el ciclo interior el flag de unico
    # se encuentra en ferdadero se aumenta en 1 el contador de unicos. en caso de ser 
    # falso, no se incrementa. Al terminar se notifica y retorna la cantidad
    cantidadDeUnicos=0                                                                          # 1
    for a in range(len(listaAEvaluar)):                                                         # n
        unico = True                                                                            # n
        for b in range(len(listaAEvaluar)):                                                     # n²
            if listaAEvaluar[a] == listaAEvaluar[b] and a != b: unico = False                   # n²
        if unico: cantidadDeUnicos+=1                                                           # n
    print('La cantidad de unicos en la lista es: ' + str(cantidadDeUnicos))                     # 1
    return cantidadDeUnicos                                                                     # 1
                                                                                            #-------------
                                                                                            # 2n² + 3n + 4  -> n²
def ejercicio4(listaA, listaB):
    #Se definen 2 listas a comprar. al anidar 2 bucles vamos comparando c/elemento 
    # de una lista contra todos los de la otra. en caso de que exista coincidencia
    # se pone en true un flag y se rompe el ciclo de comparacion contra ese elemento
    # en caso de que no exista ningun elemento igual en la 2da lista se informa y
    # se retorna falso. Luego se repite el proceso con los parametros invertidos. 
    # en caso de que todos los elementos existan entre listas se
    # avisa y alcanza el return true del final.


    for a in listaA:                                                                            # n
        existe = False                                                                          # n
        for b in listaB:                                                                        # n²
            if a == b :                                                                         # n²
                existe = True                                                                   # n²
                break                                                                           # n²
        if not existe :                                                                         # n
            print('El elemento ' + str(a) + ' del 1er arg no existe en el 2do. Fin')            # n
            return False                                                                        # n
    for b in listaB:                                                                            # n
        existe = False                                                                          # n
        for a in listaA:                                                                        # n²
            if a == b :                                                                         # n²
                existe = True                                                                   # n²
                break                                                                           # n²
        if not existe :                                                                         # n
            print('El elemento ' + str(b) + ' del 2do arg no existe en el 1ro. Fin')            # n
            return False                                                                        # n
    print('Ambas listas poseen los mismos elementos')                                           # 1
    return True                                                                                 # 1
                                                                                        #------------------
                                                                                        # 8n² + 9n + 2 -> n²

def main():
    #Para verificar el tiempo de ejecucion mostramos la diff de rtc
    print(datetime.datetime.now())
    ejercicio1([4,5,9,9,9,5])
    # ejercicio1([4,3])
    # ejercicio2([4, 7, 3, 3, 7, 4])
    # ejercicio2([4, 7, 3, 3, 9, 4])
    # ejercicio3([4, 9, 5, 3,4 , 7])
    # ejercicio3([4, 7,7,7,7,7,7,7,7,7,7,7])
    # ejercicio4([4, 9, 5, 3, 4 ,7], [4, 9, 6, 3, 4 ,7])
    # ejercicio4([4, 7, 5, 3, 4 ,7], [4, 7, 5, 3, 9 ,7])
    # ejercicio4([4, 7, 5], [4, 7, 5])
    print(datetime.datetime.now())

main()


