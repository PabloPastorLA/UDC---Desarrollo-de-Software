#include<stdio.h>

int main () {
// 2) Realizar un programa que dado 3 números obtenga el nro que esta en medio entre el mayor y el menor.
    float n1, n2, n3;
    printf("Ingrese los 3 nros de los cuales obtener el del medio.\n");
    scanf("%f%f%f", &n1, &n2, &n3);
    if ( (n1 >= n2 & n1 <= n3) | (n1 <= n2 & n1 >= n3) ) {printf("El nro del medio es %.2f\n", n1);}
    else if ( (n2 >= n1 & n2 <= n3) | (n2 <= n1 & n2 >= n3) ) {printf("El nro del medio es %.2f\n", n2);}
    else if ( (n3 >= n2 & n3 <= n1) | (n3 <= n2 & n3 >= n1) ) {printf("El nro del medio es %.2f\n", n3);}
}
//OK