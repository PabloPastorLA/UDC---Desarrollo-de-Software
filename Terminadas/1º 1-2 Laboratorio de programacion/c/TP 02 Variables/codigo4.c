#include<stdio.h>

int main()
{
    double notaParcial = 95.7;
    int displayNota = 0;
    
    displayNota = notaParcial;
    printf("Excelente trabajo! Obtuviste %d%% en tu parcial\n", displayNota);

    displayNota = (int)notaParcial;
    printf("Excelente trabajo! Obtuviste %d%% en tu parcial\n", displayNota);


}

