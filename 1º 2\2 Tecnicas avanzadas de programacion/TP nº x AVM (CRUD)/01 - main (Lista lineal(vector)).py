import time
import os

def main():
    # Crea lista y muestra la pantalla por unica vez
    lista = []
    pantallaBienvenida()

    # Loopea hasta la condicion de salir
    while 1:
        os.system("clear")
        pantallaOpciones()
        entrada=lecturaOpcion()
        if entrada ==1:create(lista)    #crea/agrega  
        if entrada ==2:read(lista)      #lee
        if entrada ==3: update(lista)   #muestra
        if entrada ==4: delete(lista)   #borra
        if entrada ==9:salir()

def pantallaBienvenida():
    # Limpia y muestra la pantalla de bienvenida 
    os.system("clear")
    print("Bienvenido!")
    time.sleep(2)

def pantallaOpciones():
    # Pantalla de opciones
    print("1 - Create - Crear/Agregar")
    print("2 - Read   - Buscar si Existe")
    print("3 - Update - Mostrar Lista Completa")
    print("4 - Delete - Eliminar de la Lista\n")
    print("9 - SALIR\n")
    print("Elija una Opcion")
    
def lecturaOpcion():
    # Validacion de entrada
    entrada = int(input())
    while entrada < 1 or (entrada > 4 and entrada != 9):
        os.system("clear")
        print("Error, reintente")
        print("")
        entrada = int(input())
    return entrada

def salir():
    # Simulamos una salida
    os.system("clear")
    print("Saliendo.")
    time.sleep(1)
    print("Saliendo..")
    time.sleep(1)
    print("Saliendo...")
    time.sleep(1)
    os.system("clear")
    exit

def create(lista):
    # Agregamos valores a la lista 
    os.system("clear")
    print("Ingrese apellido y nombre a cargar")
    lista.append(str(input()))
    print("Agregado...")
    time.sleep(1)

def delete(lista):
    # Pide el valor a borrar.
    # Si encuentra borra
    # Si no encuentra hace catch del error y da aviso
    os.system("clear")
    print("Ingrese apellido y nombre a borrar")
    inp=str(input())
    try:
        lista.remove(inp)
        print("Borrado...")
    except: 
        print("ERROR: no es encuentra: " + inp)
    time.sleep(2)

def read(lista):
    # Lee el valor, itera y da aviso si encuentra o no
    os.system("clear")
    print("Ingrese apellido y nombre a buscar")
    buscar = (str(input()))
    print("buscar: " + buscar)
    time.sleep(1)
    for x in lista:
        if x == buscar:
            print("Encontrado!")
            time.sleep(1)
            return
    print("No encontrado...")
    time.sleep(1)

def update(lista):
    os.system("clear")
    print("Contenido:\n-----------")
    for x in lista:
        print(x)
    print("-----------")
    time.sleep(3)

main()