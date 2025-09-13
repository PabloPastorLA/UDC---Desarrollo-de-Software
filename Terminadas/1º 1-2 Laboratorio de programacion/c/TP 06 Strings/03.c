#include<stdio.h>
#include<string.h>
#include<ctype.h>

int main(){
    //Sustituir todos los espacios en blanco de
    //una frase por un asterisco.
    //int cant =0, esp=0 ;
    char frase[200], chr;

    printf("Ingrese la frase a procesar\n");
    fgets(frase, 200, stdin);
    printf("Ahora el caracter por el cual reemplazar espacios\n");
    scanf("%c", &chr);
    
    for (int i =0; i < strlen(frase) -1 ; i++){
        if (frase[i] == ' ') {frase[i] = chr;}
    }

    printf("La frase procesada es:\n%s", frase);
    return 0;
}