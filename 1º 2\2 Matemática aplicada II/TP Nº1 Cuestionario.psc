Proceso TP1_cuestionario
	definir vVer, vMed Como Real;
	errores(5.000, 4.875);
	errores(0.00456, 0.0045);
	errores(120, 119.8);	
FinProceso

funcion errores(vVer, vMed)
escribir "De" vVer " y " vMed ": el error absoluto es: " vVer - vMed ", y el relativo[%]: " (vVer - vMed) / vVer * 100 "% (redondeado: " redon((vVer - vMed) / vVer * 100) " )";
FinFuncion
