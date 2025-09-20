Proceso InvertirCadena
	definir chain, ret Como cadena;
	
	
	Mostrar "ingrese Cadena";
	Leer chain;
//	Mostrar "ingrese Cadena " Subcadena(chain,Longitud(chain)-1,Longitud(chain)-1);
	
	
	
	ret = invertir(chain,  Longitud(chain));
	
	mostrar "La cadena invertida es: " ret;
FinProceso

Funcion niach=invertir(chain por referencia, largo)
	//mostrar "asdasd" Subcadena(chain,largo - 1,largo - 1);
	definir niahc como cadena;
	si largo <> 0 entonces
		niach = Subcadena(chain,largo-1,largo-1) + invertir(chain, largo -1);		
	FinSi

	
FinFuncion
	