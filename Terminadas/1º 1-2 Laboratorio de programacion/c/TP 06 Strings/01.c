#include<stdio.h>
#include<string.h>
#include<ctype.h>

int main(){
    // Escribir un programa que lea una frase y cuente el número de palabras que contiene. Asumir que cada palabra está separada por un solo espacio en blanco.
    int cant =0, esp=0 ;
    char frase[200];

    printf("Ingrese la frase a procesar\n");
    fgets(frase, 200, stdin);
    
    for (int i =0; i < strlen(frase) -1 ; i++){
        if (frase[i] == ' ') {esp++;}
    }

    printf("La frase posee %i espacios.\n", esp);
    return 0;
}
