#include<stdio.h>
#include<stdlib.h>

int main () {
    //system("clear && echo");
    int edad;
    double ingresos;
    printf("Ingrese su edad:\n");
    scanf("%i", &edad);
    //El sgte bloque de código debe ser activado en caso de desear que el programa
    //no continue ni bien el comparador sea falso
    /*if (edad <= 18 ) {
        printf("No es necesario que tribute\n");
        exit(0);
    }*/

    printf("Ahora proporcione sus ingresos (en dolares):\n");
    scanf("%lf", &ingresos);

    if (edad > 18 && ingresos >= 100.00 ) {printf("Usted debe tributar\n");}
    else {printf("No es necesario que tribute\n");}
}