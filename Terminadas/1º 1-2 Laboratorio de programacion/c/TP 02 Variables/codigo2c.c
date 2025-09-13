#include <stdio.h>

int main() {
    double precio1, precio2, precio3, media;
    
    printf("Ingrese los 3 precios a promediar\n");
    scanf("%lf""%lf""%lf", &precio1, &precio2, &precio3);

//Cálculo
    media = (precio1 + precio2 + precio3) / 3;
    printf ("El precio medio del producto es de %.2lf pesos", media);
    return 0;
}
