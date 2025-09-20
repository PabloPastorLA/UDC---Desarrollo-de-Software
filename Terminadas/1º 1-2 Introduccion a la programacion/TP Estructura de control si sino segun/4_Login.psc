Algoritmo Login
	definir USER_ALMACENADO, PASS_ALMACENADO Como caracter 
	USER_ALMACENADO = "Luis" 		//Constante, no modificar
	PASS_ALMACENADO = "Lu1ST0rr3s"	//Constante, no modificar
	
	definir user, pass Como Caracter
	
	mostrar "Ingrese Usuario"
	leer user
	mostrar "Ingrese Password"
	leer pass
	
	si (USER_ALMACENADO = user ) y (PASS_ALMACENADO = pass) Entonces
		mostrar "Bienvenido al sistema"
	sino
		mostrar "Lo siento las credenciales son inválidas"
	FinSi
	

FinAlgoritmo
