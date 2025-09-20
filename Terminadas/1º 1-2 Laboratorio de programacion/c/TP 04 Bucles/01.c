#include<stdio.h>
#include<stdlib.h>

int main () {
//Del apunte “Introducción a Loops” realice el Ejercicio 1 de la página 8
/*Realice un programa que conceda acceso al sistema cuando se ingrese el nro correcto.*/
//    system("clear && echo");
    int respuesta = 0;

    printf("Ingrese nro de acceso ");
    scanf("%i", &respuesta);
    
    while (respuesta != 8){
        printf("Respuesta erronea, intenta de nuevo: ");
        scanf("%i", &respuesta);
    }
    
    printf("ACCESO CONSEGUIDO\n");
    return 0;
}