#include<stdio.h>

int main () {

        char text[100];

    printf("Enter text with spaces: ");
    scanf("%[^\n]s", text);

    printf("You entered: %s\n", text);

    return 0;

}

