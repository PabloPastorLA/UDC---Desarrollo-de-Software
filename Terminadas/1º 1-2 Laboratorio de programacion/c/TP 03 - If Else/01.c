#include <stdio.h>
#include <stdlib.h>

int main () {
    //system("clear && echo");
    int edad;
    printf("Ingrese su edad.\n");
    scanf("%i", &edad);

    if ( edad < 14 ) {printf("Usted posee un descuento del %%50\n");}
    else if (edad >= 14 & edad < 18) {printf("Usted posee un descuento del %%15\n");}     //se utilizó >= para incluir el valor 14 en el condicional
    else if (edad > 65) {printf("Usted posee un descuento del %%30\n");}
    else { printf("Lamentablemente ud no posee ningun descuento\n");}
}

