#include <stdio.h>
#include <stdlib.h>


int func1() {
    printf("Funcion1\n");
    return 0;
}

int func2() {
    return 1;
}

int func3(int argum) {
    printf("%i\n", argum);
}

int func4(int argum1, int argum2){
    return argum1 + argum2;
}
int main () {
    system("clear && echo");


    int h=0;
    
    for (int i = 0; i < 5; i++){printf("for i: %i\n", i);}

    do{printf("do\n"); } while (h);
    
    h++;
    while (h) { h--;printf("while\n") ;}

    func1();
    printf("%i\n", func2());
    func3(5);
    printf("%i\n", func4(4, 5));


    if (0) { printf("If\n");} else if (1) {printf("Elif\n");} else {printf("else\n");}
    (0) ? printf("Tern 1\n") : printf("Tern 2\n")  ;

    printf("\n");
    return 0;
}




