#include <stdio.h>
#include <stdlib.h>

int main () {
    system("clear && echo");
    int n, i = 0;

    printf("La tabla de que nro desea?\n");
    scanf("%i", &n);
    while (i < 10) {i++; printf("%i x %i = %i\n--\n", n, i, n * i);}
}