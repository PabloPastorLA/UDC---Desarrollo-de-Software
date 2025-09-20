#include<stdio.h>
#include<stdlib.h>

int main () {
    //system("clear && echo");

    int nro;
    printf("Ingrese un nro entero\n");
    scanf("%i", &nro);

    if (nro % 2 == 0) {printf("El nro ingresado es par\n");}
    else {printf("El nro es impar\n");}

}