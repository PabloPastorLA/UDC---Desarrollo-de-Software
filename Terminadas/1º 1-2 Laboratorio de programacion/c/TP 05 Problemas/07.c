#include<stdio.h>
#include<stdlib.h>

int main () {
/*    7) Realizar un programa que informe la categoría del programador de acuerdo a los años de experiencia:
    - Menor a 1 año "Principiante"
    - Mayor a 1 año y menor a 2 "junior"
    - Entre 2 y 4 años "semi senior"
    - Mayor a 5 años "Senior"*/   
    int antiguedad, repetir=0;
    int seniority[] = {1, 2, 4, 5};
    printf("Ingrese su antiguedad (en años).\n");
    do
    {
        scanf("%d", &antiguedad);
        if (antiguedad < 0) {
            repetir = 1;
            printf("La antiguedad no puede ser negativa...");
        } else { repetir = 0 ;}    
    } while (repetir);
    
    if ( antiguedad < seniority[0] ) {printf("Principiante.\n");}
    else if ( antiguedad >= seniority[0] & antiguedad < seniority[1] ) {printf("Junior.\n");}
    else if ( antiguedad >= seniority[1] & antiguedad < seniority[2] ) {printf("SemiSenior.\n");}
    else if ( antiguedad >= seniority[2] & antiguedad <= seniority[3] ) {printf("Casi Senior.\n");}
    else if ( antiguedad > seniority[3] ) {printf("Senior.\n");}
}
//OK