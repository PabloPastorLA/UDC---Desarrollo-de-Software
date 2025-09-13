#include <stdio.h>

int main()
{

    // velocidad de la lluz en kilometros
    double VELOCIDAD_LUZ = 2.99;
    int tiempoViajePorSegundo = 30;

    printf("La Luz viaja %.2f km in %d seconds\n", VELOCIDAD_LUZ * 100000 * tiempoViajePorSegundo, tiempoViajePorSegundo);
}

