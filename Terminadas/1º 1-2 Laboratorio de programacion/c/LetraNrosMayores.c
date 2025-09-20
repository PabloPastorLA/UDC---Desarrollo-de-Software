#include<stdio.h>
#include<stdlib.h>

int main () {
    system("clear && echo");
    int n1, n2;
    char l1, l2;


    printf("Ingrese 2 nros uno seguido de otro\n");
    scanf("%i%i", &n1, &n2);


    if (n1>n2) {
        printf("El nro mayor es %i\n", n1);

    } else if (n2> n1){
        printf("El nro mayor es %i\n", n2);
    } else {
        printf("O los nros son iguales o hay algo mal que no está bien\n");
    }


    printf("Ingrese 2 letras, ambas mayusculas o ambas minusculas. Una seguida de otra\n");
    scanf("%s %s", &l1, &l2);

    if (l1 > l2){
        printf("La letra mayor es %c\n", l1);
    } else if (n2> n1){
        printf("La letra mayor es %c\n", l2);
    } else {
        printf("O las letras son iguales o hay algo mal que no está bien\n");
    }


}