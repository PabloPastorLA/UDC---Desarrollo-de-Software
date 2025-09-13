#include<stdio.h>
#include<stdlib.h>

int main () {
    system("clear && echo");

    int n1, n2, n3, max;

    printf("Ingrese 3 nros uno seguuido al otro.\n");
    scanf("%i %i %i", &n1, &n2, &n3);

    max = n1;
    (n2 > max) ? max = n2 : NULL ;
    (n3 > max) ? max = n3 : NULL ;

    printf("El nro mayor es: %i", max);



}