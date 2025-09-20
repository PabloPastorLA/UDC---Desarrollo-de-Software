#include<stdio.h>
#include<stdlib.h>


int main() {
    //system("clear && echo");
    int edad;
    printf("Ingrese su edad.\n");
    scanf("%i", &edad);

    if (edad < 4 & edad >=0) {printf("Pase gratis!\n");}
    else if (edad > 18) {printf("Ud debe abonar $2500\n");}
    else if (edad >= 4 & edad <= 18) {printf("Ud debe abonar $1000\n");}
    else {printf("Ud todavia no nació 8o\n");}
}