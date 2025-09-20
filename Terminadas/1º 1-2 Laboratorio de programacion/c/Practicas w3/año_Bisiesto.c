#include<stdio.h>
#include<stdlib.h>

int main () {
    int año;

    printf("Ingrese año\n");
    scanf("%i", &año);

int aleatorio;
rand(aleatorio);

printf("%i", aleatorio);
    if ( año % 4 == 0 ) {
        printf("es Bisieesto");
    } else {
        printf("no es Bisieesto");
    }

    
}