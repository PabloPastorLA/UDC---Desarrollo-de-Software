#include <stdio.h>

int main (){

    //usar \b	\t	\v	\\	\f	\'	\"	\0
    /*
    \b  back al cursor
    \t  inserta tab
    \v  salto de linea y ubica el cursor sgte a la posicion anterior
    \\  inserta \
    \f  similar a \v
    \'  inserta '
    \"  inserta "
    \0  null character. usado para terminar un array (preguntar)
    */  
    printf("\n");
    printf("El caracter \\b permite regresar la posición del cursor. Ejemplo: \"hola\" muestra \"hola|\", pero \"hola\\b\" muestra \"hol|a\"\n");
    printf("El caracter \\t permite insertar tabulador. Ejemplo: \"hol\\ta\" muestra \"hol\ta\"\n");
    printf("El caracter \\v permite insertar un 'tab vertical'. Ejemplo: \n\n\"hol\\va\" \n\nmuestra \n\n\"hol\va\"\n");
    printf("El caracter \\\\ permite insertar backslash. Ejemplo: \"C:\\\\Windows\" muestra \"C:\\Windows\"\n");
    printf("El caracter \\f permite posicionar el cursor en una nueva pagina. Ejemplo: \"hol\\fa\" muestra \"hol\fa\"\n");
    printf("El caracter \\' permite insertar el simbolo '. Ejemplo: \"hol\\'ta\" muestra \"hol\'a\". Es util cuando escribimos texto con '\n");
    printf("El caracter \\\" permite insertar el simbolo \". Ejemplo: \"hol\\\"ta\" muestra \"hol\"a\". Es util cuando escribimos texto con \"\n"); 

}

