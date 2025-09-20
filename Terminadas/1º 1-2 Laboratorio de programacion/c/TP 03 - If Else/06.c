#include<stdio.h>

int main () {
    int m1, m2, m3, aux;

    printf("Ingrese 3 nros. Serán ordenados de menor a mayor.\n");
    scanf("%d%d%d", &m1, &m2, &m3);
    printf("Valores previos al orden: %d %d %d.\n", m1, m2, m3);
    if (m1 > m2) {aux = m1; m1 = m2; m2 = aux;}
    if (m2 > m3) {aux = m2; m2 = m3; m3 = aux;}
    if (m1 > m2) {aux = m1; m1 = m2; m2 = aux;}
    printf("Valores posteriores: %d %d %d.\n", m1, m2, m3);
}
