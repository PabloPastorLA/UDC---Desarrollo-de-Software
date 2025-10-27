import time
import os




def main():
    # Crea listas y muestra la pantalla por unica vez
    nombreApellido = []
    edad = []
    dni = []
    telefono = []
    pantallaBienvenida()

    # Loopea hasta la condicion de salir
    loopear= True
    while loopear:
        os.system("clear")
        pantallaOpciones()
        entrada=lecturaOpcion()
        if entrada ==1:create(nombreApellido, edad, dni, telefono)    #crea/agrega  
        if entrada ==2:read(nombreApellido, edad, dni, telefono)      #lee
        if entrada ==3: update(nombreApellido, edad, dni, telefono)   #muestra
        if entrada ==4: delete(nombreApellido, edad, dni, telefono)   #borra
        if entrada ==9:
            salir(loopear)

def pantallaBienvenida():
    # Limpia y muestra la pantalla de bienvenida 
    os.system("clear")
    print("Bienvenido!")
    time.sleep(2)

def pantallaOpciones():
    # Pantalla de opciones
    print("1 - Create - Crear/Agregar")
    print("2 - Read   - Buscar si Existe")
    print("3 - Update - Mostrar nombreApellido Completa")
    print("4 - Delete - Eliminar de la nombreApellido\n")
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

def salir(loopear):
    # Simulamos una salida
    os.system("clear")
    print("Saliendo.")
    time.sleep(1)
    print("Saliendo..")
    time.sleep(1)
    print("Saliendo...")
    time.sleep(1)
    os.system("clear")
    loopear=False
    exit

def create(nombreApellido, edad, dni, telefono):
    # Agregamos valores a las listas 
    os.system("clear")
    print("Ingrese apellido y nombre a cargar")
    nombreApellido.append(str(input()))
    print("Ahora ingrese Edad")
    edad.append(int(input()))
    print("Sigue DNI")
    dni.append(int(input()))
    print("Por ultimo el nro de telefono")
    telefono.append(int(input()))
    print("Agregado...")
    #time.sleep(1)
    esperarEntrada()

def delete(nombreApellido, edad, dni, telefono):
    # Pide el valor a borrar.
    # Si encuentra borra
    # Si no encuentra hace catch del error y da aviso
    if len(nombreApellido)==0:
        print("No hay datos cargados")
    else:
        os.system("clear")
        print("Ingrese apellido y nombre a borrar")
        inp=str(input())
        try:
            indice=nombreApellido.index(inp)
            nombreApellido.pop(indice)
            edad.pop(indice)
            dni.pop(indice)
            telefono.pop(indice)
            print("Borrado...")
        except: 
            print("ERROR: no se encuentra: " + inp)
    esperarEntrada()

def esperarEntrada():
    input("\nPresione [ENTER] para continuar.")

def read(nombreApellido, edad, dni, telefono):
    # Lee el valor, itera y da aviso si encuentra o no
    if len(nombreApellido)==0:
        print("No hay datos cargados")
    else:
        os.system("clear")
        print("Ingrese apellido y nombre a buscar")
        buscar = (str(input()))
        print("buscar: " + buscar)
        time.sleep(1)

        for x in range(len(nombreApellido)):
            if nombreApellido[x] == buscar:
                print("\nEncontrado:\n-----------\n" + str(nombreApellido[x]) + ", " + str(edad[x]) + ", " + str(dni[x]) + ", " + str(telefono[x]) + "\n-----------")
                esperarEntrada()
                return
        print("No encontrado...")
    esperarEntrada()

def update(nombreApellido, edad, dni, telefono):
    # Muestra el contenido de las listas
    os.system("clear")
    if len(nombreApellido)==0:
        print("No hay datos cargados")
    else:
        print("Contenido:\n-----------")
        for nombreApellido, edad, dni, telefono in zip(nombreApellido, edad, dni, telefono):
            print(nombreApellido, edad, dni, telefono)
        print("-----------")
    esperarEntrada()

main()



