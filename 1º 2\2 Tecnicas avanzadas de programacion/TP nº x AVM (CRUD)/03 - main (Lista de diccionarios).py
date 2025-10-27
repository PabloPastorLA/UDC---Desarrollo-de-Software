#  Cabecera
#solo para jupyter notebook
from IPython.display import clear_output 
# Para el script. no borrar
import time
import os
# para detectar [ESCAPE]
#import keyboard
# para usar regex
import re

def pantallaOpciones():
    # Pantalla de opciones
    print("1 - Create - Crear/Agregar")
    print("2 - Read   - Buscar si Existe")
    print("3 - Update - Mostrar lista Completa")
    print("4 - Delete - Eliminar de la lista\n")
    print("9 - SALIR\n")
    print("Elija una Opcion")

def esperarEntrada():
    input("\nPresione [ENTER] o [ESC] para continuar.")

def limpiarPantallla():
    # try:
    clear_output(wait=True)
    # except:
    os.system("clear") # TO DO: universificar tambein con cls

def pantallaBienvenida():
    # Limpia y muestra la pantalla de bienvenida 
    limpiarPantallla()
    print("Bienvenido!")
    time.sleep(2)

def salir():
    # Simulamos una salida
    limpiarPantallla()
    print("Saliendo.")
    time.sleep(1)
    print("Saliendo..")
    time.sleep(1)
    print("Saliendo...")
    
    time.sleep(1)
    limpiarPantallla()
    return False

def lecturaOpcion():
    # Validacion de entrada
    try:
        entrada = int(input())
        while entrada < 1 or (entrada > 4 and entrada != 9):
            limpiarPantallla()
            print("Error, reintente")
            print("")
            entrada = int(input())
        return entrada
    except:
        print("Error: valor de entrada")
        esperarEntrada()


def create(lista):
    # Inicializamos vacío un diccionario, lo llenamos de cositas y lo agregamos a la lista 
    diccionario={}
    limpiarPantallla()
    # print("Ingrese apellido y nombre a cargar")
    print("Procederemos a cargar el nuevo registro")
    # diccionario["nombre"] = str(input("Nombre: "))
    diccionario["nombre"] = inputString("Nombre: ")
    # print("Ahora ingrese Edad")
    # diccionario["edad"] = int(input("Edad: "))
    diccionario["edad"] = inputEntero("Edad: ", 1, 3)
    # print("Sigue DNI")
    diccionario["dni"] = inputEntero("DNI: ", 7, 8)
    # print("Por ultimo el nro de telefono")
    diccionario["tel"] = inputEntero("Telefono: ", 7, 15)
    lista.append(diccionario)
    print("Agregado...")
    #time.sleep(1)
    esperarEntrada()

def inputString(mostrar):
    # try:
    while True:
        # # entrada=""
        # #     # os.system("rm -f entrada.txt")
        # # if keyboard.is_pressed('esc'):
        # #     print("Escape pressed! Exiting...")
        # entrada=str(input(mostrar)).strip()
        # # os.system("echo " + entrada + " >> entrada.txt")
        # # print("comando ejecutado")
        # # input()
        # # handle= open("entrada.txt","r",encoding="utf-8")
        # # contenido=handle.read()
        # # handle.close()
        # # print(contenido)
        # # print(entrada)
        # # input()
        # # if entrada == "^[": print("Error de ingreso. escape"); continue
        # if entrada == "": print("Error de ingreso. Debe ingresar si o si un valor"); continue
        # if entrada == '\x1b': print("Escape detected!"); continue
        # try:
        #     float(entrada)
        #     print("Error de ingreso. No puede ingresar un valor numerico, solo testo"); continue
        # except ValueError:
        #     return entrada
        # # except ValueError:
        # #     print("errorrrr")
        # #     input()


        entrada=input(mostrar)
        if re.fullmatch(r"^[A-Za-z]+( [A-Za-z]+)*$", entrada): return entrada
        elif re.search(r".*  .*", entrada): print("Se detectaron espacios dobles. Reintente")
        elif re.search(r"^ | $", entrada): print("No puede iniciar o finalizar con espacios. Reintente")
        elif re.search(r"[ÁÉÍÓÚáéíóúÑñ]", entrada): print("Los acentos no estan permitidos. Reintente")
        elif re.search(r"\d", entrada): print("No puede contener numeros. Eintente")
        else: print("Nolo se permiten los patrones [A-Z], [a-z] y [ ](espacio)")



    # while True:
    #     entrada = input("Enter a value (type 'q' to quit): ").strip()
    
    #     if entrada.lower() == "q":  # pseudo-Escape
    #         print("Escape triggered via 'q'!")
    #         break
        
    #     if entrada == "":
    #         print("Error: must enter a value")
    #         continue

    #     print("You typed:", entrada)




def inputEntero(mostrar, min, max):
    # try:
    while True:

        entrada=input(mostrar)
        if re.fullmatch(r"^\d+$", entrada):
            if (len(entrada)>= min) and (len(entrada)<= max): return int(entrada)
            else: print("El valor ingresado está fuera del rango\nComo minimo debe tener " + str(min) + " digitos y como maximo " +str(max) + ". Reintente")
        # elif re.search(r".*  .*", entrada): print("Se detectaron espacios dobles. Reintente")
        # elif re.search(r"^ | $", entrada): print("No puede iniciar o finalizar con espacios. Reintente")
        # elif re.search(r"[ÁÉÍÓÚáéíóúÑñ]", entrada): print("Los acentos no estan permitidos. Reintente")
        # elif re.search(r"\d", entrada): print("No puede contener numeros. Eintente")
        else: print("Solo se permite el patron [0-9], nada mas. Reintente")


def read(lista):
    # Lee el valor, itera y da aviso si encuentra o no
    limpiarPantallla()

    if len(lista)==0:
        print("No hay datos cargados")
    else:
        print("Ingrese apellido y nombre a buscar")
        buscar = (str(input()))
        print("buscando: " + buscar + "\n")
        time.sleep(1)

        for x in range(len(lista)):
            # print (lista[x])
            if lista[x]["nombre"] == buscar:
                print("Encontrado:\n-----------")
                print("Apellido y/o nombre: " + lista[x]["nombre"])
                print("Edad: " + str(lista[x]["edad"]))
                print("Dni: " + str(lista[x]["dni"]))
                print("Telefono: " + str(lista[x]["tel"]))
                print("-----------")
                #  + str(lista[x]) + ", " + str(edad[x]) + ", " + str(dni[x]) + ", " + str(telefono[x]) + "\n-----------")
                esperarEntrada()
                return
        print("No encontrado...")
    esperarEntrada()

def update(lista):
    # Muestra el contenido de las listas
    limpiarPantallla()
    if len(lista)==0:
        print("No hay datos cargados")
    else:
        print("Contenido:\n-----------")
        print("    Nombre:    |     Edad:     |      dni:     |      tel:     |\n")
        for i in range(len(lista)):
        #, edad, dni, telefono in zip(lista, edad, dni, telefono):
            print(lista[i]["nombre"] + " | " + str(lista[i]["edad"]) + " | " + str(lista[i]["dni"]) + " | " + str(lista[i]["tel"]) + "\n")
        print("-----------")
    esperarEntrada()

def delete(lista):
    # Pide el valor a borrar.
    # Si encuentra borra
    # Si no encuentra hace catch del error y da aviso
    limpiarPantallla()
    if len(lista)==0:
        print("No hay datos cargados")
    else:
        print("Ingrese apellido y nombre a borrar.")
        inp=str(input())
        # try:
        for i in range(len(lista)):
            if lista[i]["nombre"] == inp:
                lista.pop(i)
        # indice=lista.index(lista["nombre:" + str(inp)])
        # print("indice" + str(indice))
            # lista.pop(indice)
            # edad.pop(indice)
            # dni.pop(indice)
            # telefono.pop(indice)
                print("Borrado...")
                esperarEntrada()
                return
            
        # except: 
        #     print("ERROR: no se encuentra: " + inp)
    print("No encontrado...")
    esperarEntrada()

def main():
    
    # Crea lista y muestra la pantalla por unica vez
    lista = []
    # edad = []
    # dni = []
    # telefono = []
    pantallaBienvenida()

    # Loopea hasta la condicion de salir
    
    loopear= True
    while loopear:
        limpiarPantallla()
        pantallaOpciones()
        entrada=lecturaOpcion()
        if entrada == 1:create(lista)    #crea/agrega  
        if entrada ==2:read(lista)      #lee
        if entrada ==3: update(lista)   #muestra
        if entrada ==4: delete(lista)   #borra
        if entrada ==9:
            # limpiarPantallla()
            # print("Saliendo.")
            # time.sleep(1)
            # print("Saliendo..")
            # time.sleep(1)
            # print("Saliendo...")
            # time.sleep(1)
            # limpiarPantallla()
            # loopear=False

            loopear = salir()

main()



