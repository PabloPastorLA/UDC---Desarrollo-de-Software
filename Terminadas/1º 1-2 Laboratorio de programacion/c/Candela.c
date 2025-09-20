#include<stdio.h>
#include<stdlib.h>

int main() {
    system("clear && echo");
// Defino variables
    int v1, v2, dummy;
    char zz3, zz4;
//Instrucciones
    printf("Ingrese una letra\n");
    scanf("%s", &zz3);
    printf("Ingrese otra letra\n");
    scanf("%s", &zz4);

    printf("Ingrese un número\n");
    scanf("%d", &v1);
    printf("Ingrese otro número\n");
    scanf("%d", &v2);
//    scanf("%i", &dummy);



printf("%i\n", v1);
printf("%i\n", v2);

printf("%c\n", zz3);
printf("%c\n", zz4);

    if (v1>v2) {
    printf("El número mayor es: %i\n", v2);
    }else{
    printf("El número mayor es: %i\n", v1);
    }

//    exit("");



    if (zz3>zz4){
    printf("La letra mayor es: %s\n", zz3);
    }else{
    printf("La letra mayor es: %s\n", zz4);
    }
    return 0;
}

