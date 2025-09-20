#include<stdio.h>
#include<stdlib.h>

int main () {
/*
    3) Realice un programa que pida ingresar un planeta y dado el mismo informe su gravedad según la siguiente tabla:
    #	Planeta	Gravedad
    1	Mercury	0.38
    2	Venus		0.91
    3	Mars		0.38
    4	Jupiter	2.34
    5	Saturn		1.06
    6	Uranus	0.92
    7	Neptune	1.19
    Mostrar la tabla anterior como output en el inicio del programa
*/   

    int nroPlaneta[] = {1, 2, 3, 4, 5, 6, 7};
    char nombrePlaneta[7][10] = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
//    char lectura[10];
    int lectura;
    float gravedadPlaneta[] = {0.38, 0.91, 0.38, 2.34, 1.06, 0.92, 1.19};



    printf("-----------------------\n");
    printf("Nro -  g   - Nombre\n");

    for (int i=0;i<7;i++){
        printf(" %d  - %.2f - %s\n", nroPlaneta[i], gravedadPlaneta[i], nombrePlaneta[i]);
    }
    printf("-----------------------\n");

    // printf("Ingrese el nombre del planeta a consultar.\n");
    // scanf("%s", lectura);
    // printf("\n\nlectura: %s\n\n", lectura);

    printf("Ingrese el nro del planeta a consultar.\n");
    scanf("%d", &lectura);

    for (int i=0; i<7; i++) {
        if (lectura == nroPlaneta[i]) {printf("La gravedad de %s es %.2f\n", nombrePlaneta[i], gravedadPlaneta[i]);}
    }
}
//OK