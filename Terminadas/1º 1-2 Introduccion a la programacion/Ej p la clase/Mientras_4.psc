Algoritmo Mientras_4
	
//	4. Escribí un programa que simule un login, para ello tendrás que usar solo cuatro variables 2
//		de tipo caracter (userAlmacenado, passAlmacenado, user, pass) las 2 primeras las
//	definirás por defecto con un valor de texto ej :
	
	
	
//	las dos segundas recibirán los datos ingresados por teclado, con sus correspondientes
//	mensajes. Luego deberá comparar ambos valores si user y userAlmacenado son iguales y
//		a su vez pass y passAlmacenado son iguales, entonces mostrará un mensaje diciendo
//		"Bienvenido al sistema", si al menos uno de los dos es incorrecto entonces deberá mostrar
//			un mensaje que diga "Lo siento las credenciales son inválidas, inténtelo nuevamente" y
//			solicitar por teclado nuevamente usuario y password, esta tarea se realizará 3 veces, al
//			tercer intento fallido mostrará el mensaje "lo siento, agotó sus tres intentos" y se finalizará
//			
	
	//el programa.
	
	definir salir Como entero
	Definir userAlmacenado, passAlmacenado, user, pass como caracter
	userAlmacenado = "User027"
	passAlmacenado = "Us3rost!"
	salir = 0
	
	mientras (userAlmacenado <> user o passAlmacenado <> pass) y salir < 3
		salir = salir +1
		mostrar "Ingrese usuario"
		leer user
		mostrar "Ingrese password"
		leer pass
		si ( userAlmacenado <> user o passAlmacenado <> pass ) y salir < 3 Entonces
			mostrar "Lo siento las credenciales son inválidas, inténtelo nuevamente"
		FinSi
		si userAlmacenado = user y passAlmacenado = pass Entonces
			mostrar "Bienvenido al sistema"
			salir = 3
		FinSi
		si ( userAlmacenado <> user o passAlmacenado <> pass ) y salir = 3 Entonces
			mostrar "lo siento, agotó sus tres intentos"
		FinSi
	FinMientras
	
	
	
FinAlgoritmo