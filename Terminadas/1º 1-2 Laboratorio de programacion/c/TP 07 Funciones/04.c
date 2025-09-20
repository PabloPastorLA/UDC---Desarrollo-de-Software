/*Crear una función calcularMax() que recibe una arreglo de enteros y devuelva el valor máximo
Crear un programa que pida números por teclado y muestre el máximo utilizando la función anterior.*/
#include <stdio.h>
const int largo = 200;  // <-- Defina el largo maximo del arreglo

int calcularMax(int arr[], int largo) {
    int max = arr[0];
    for (int i=1 ; i < largo; i++) {
        if (arr[i] > max) {max = arr[i];}
        if (arr[i] < 0) {break;}
    }
    return max;
}

int main() {
    int arr[largo];
    printf("Vaya ingresando los nros enteros de los cuales obtener el mayor.\n");
    printf("(puede ingresarlos en la misma linea separados por espacios).\n");
    printf("(la carga se detiene al ingresar un negativo).\n");
    for (int i=0; i<largo;i++){
        scanf("%d", &arr[i]);
        if ( arr[i] < 0 ){break;}
    }

    printf("De los nros:\n - ");
    for (int i = 0 ; i < largo - 1 ; i++ ){
        if (arr[i] >= 0) {printf("%d", arr[i]);}
        if (arr[i] < 0) {break;}
        printf(" - ");
    }
    printf("\nEl nro mayor es:\n%d\n", calcularMax(arr, largo));
}
