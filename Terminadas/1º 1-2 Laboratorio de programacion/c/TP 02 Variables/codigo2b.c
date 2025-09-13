#include<stdio.h>

int main() {

    double D, H, R, V;
    double Pi = 3.1415926535;

    printf("Ingrese el diametro del cilindro a cubicar:");
    scanf("%lf", &D);
    printf("Ahora ingrese la altura del cilindro a cubicar:");
    scanf("%lf", &H);
    //Cálculo
    R = D/2; 

    V = Pi * (R*2) * H;

    printf ("El volumen Calculado es de %lf metros cubicos", V);
    return 0;
}
    