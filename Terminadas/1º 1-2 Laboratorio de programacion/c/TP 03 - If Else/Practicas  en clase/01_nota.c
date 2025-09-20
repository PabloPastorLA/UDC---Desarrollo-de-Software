#include<stdio.h>
#include<stdlib.h>

int main () {
    float nota,max, min, prom ;
    int cant;
    max =  prom = nota = cant = 0;
    min = 10;
    while (nota >= 0){// && nota =< 10){
        printf("Ingrese notas. Cuando quiera salir ingrese una nota negativa\n");
        scanf("%f", &nota);
        while (nota >10 ){
            printf("Error, la nota no debe ser mayor a 10. Reingrese");
            scanf("%f", &nota);    
        }
        if (nota >= 0) {
            cant++;
            prom += nota;
            if (nota > max) {max = nota;}
            if (nota < min) {min = nota;}
        }
    }
    printf("max: %.2f\n", max);
    printf("min: %.2f\n", min);
    printf("prom: %.2f\n", prom / cant);
    printf("cant: %i\n", cant);
}


