#include<stdio.h>
#include<stdlib.h>

// defina el valor del voleto en la sgte linea
    const float boleto = 100;
// fin de la configuracion

int main () {
/*
    5) Realice un programa que calcule el descuento en el precio de un boleto de $100 de transporte urbano e informar el valor final.
    Si el pasajero es estudiante se le descuenta el 50%, a jubilados 40% y a empleados administrativos 20%. Utilizar la estructura adecuada para realizar dicho cálculo.
 */   
    float desc[] = {50, 40, 20}, descuento;
    char tipo[] = {'E', 'J', 'A'}, lectura;

    printf("Ingrese el tipo de boleto:\n");
    do {
        lectura = 'w';
        printf("\"E\" -> estudiantes, \"J\" -> jubilados o \"A\" -> administrativos\n");
        scanf("%c", &lectura);
        if (lectura == 'e'){lectura = 'E';}
        else if (lectura == 'j'){lectura = 'J';}
        else if (lectura == 'a'){lectura = 'A';}

    } while (lectura != 'E' && lectura != 'J' && lectura != 'A') ;

    for (int i = 0; i < 3; i++) {
        if (tipo[i] == lectura) {printf("El valor a abonar post descuento es: %.2f\n",  boleto - boleto * desc[i] / 100);}
    }



}
//OK