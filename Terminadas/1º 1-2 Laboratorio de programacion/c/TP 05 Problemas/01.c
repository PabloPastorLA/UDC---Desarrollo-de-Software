#include<stdio.h>
#include<stdlib.h>

int main () {
/*
    1) Realizar un programa que dado el ph de un líquido ingresado por teclado imprima:
    Si el ph es mayor a 7 imprimir "Normal"
    Si el ph es menor a 7 imprimir "Acido"
    De lo contrario debe imprimir "Neutral"  
 */   
//    system("clear && echo");
    float ph;

    printf("Ingrese el nivel de ph a comparar.\n");
    scanf("%f", &ph);

    if ( ph == 7 ) { printf("El nivel ingresado es totalmente Neutro\n");}
    else if (ph < 7 ) {printf("El nivel ingresado es ácido\n");}
    else {printf("El valor es normal (básico)\n");}
}
//OK
