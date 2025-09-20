#include<stdio.h>
#include<stdlib.h>



int main(){
    system("clear && echo");    
/*
Flags:
Poder: 1, 2 y 3
Especiales: 1 corazon, 2, 3, 4 huevo teleport, 5 brujula, 6

Armas (continuidad): 
1, 2, 3, 4
5, 6, 7, 8
9, 10, 11, 12

Pantalla psw1:
0 1 2 3 4 5 6 7
8 9 B C D F G H
J K L M N P Q R
S T V W X Y Z ?

Valores asignados:
00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31    99
0  1  2  3  4  5  6  7  8  9  B  C  D  F  G  H  J  K  L  M  N  P  Q  R  S  T  V  W  X  Y  Z  ?     -


33JV333C   03 03 16 26 03 03 03 11   arma 1
esp 4:        +5+10-11 +6       +7
3CVH933N   03 11 26 15 09 03 03 20   arma 1 esp 4
esp 5:           -4            -14
3CQH9336   03 11 22 15 09 03 03 06   arma 1 esp 4 5
esp 1:        +2                +6
3FQH933D   03 13 22 15 09 03 03 12   arma 1 esp 1 4 5
esp 2:     
37QH933H   03 07 22 15 09 03 03 15   arma 1 esp 1 2 4 5

35JV333K

88QB881R   08 08 22 10 08 08 01 23   arma 1 esp 5
                        6         7       
8JFC181L
     
*/

    char psw1[] = "33JV333C";
    int psw2[8] = {03, 03, 16, 26, 03, 03, 03, 11 } , menu ;
    printf("1_ Pass 2 Numb\n2_ Num 2 Pass\n\n");
    scanf("%i", &menu);

    switch (menu) {
        case 1:
            printf("ingrese psw1 para convertir en valores (SIN ESPACIOS SIN GUIONES)\n");
            scanf("%s", psw1);
            //printf("psw1: %s\n", psw1);
            p2n(psw1, psw2);

            //printf("psw2[4]: %i %i", psw2[0], psw2[7]);
            int length = sizeof(psw2) / sizeof(psw2[0]);
            for (int i = 0; i < length ; i++ ) {
                printf("%02i ", psw2[i]);
                if (i == length - 1) { printf("\n");}
            }


            break;
        case 2:
            printf("ingrese psw2 para convertir a codigo\n");
            for (int i = 0; i < 8 ; i++){
                //printf("asdasd");
                scanf("%i", &psw2[i]);
            }             

            //printf("psw1: %s\n", psw1);
            n2p(psw2, psw1);

            printf("psw1: ");
            for (int i = 0; i < 8 ; i++ ) {
                printf("%c", psw1[i]);
            }

        break;


        default:
            break;
        }   






    
}



int n2p (int psw2[], char *psw1) {

    printf("psw2: ");
    for (int i = 0; i < 8 ; i++ ) {
        printf("%i ", psw2[i]);
    }
    printf("\n");
    
    for ( int i = 0 ; i<8; i++) {   //recorro el pass para asignar CODIGO a psw1
    
        if ( psw2[i] == 0) {psw1[i] = '0';}
        if ( psw2[i] == 1) {psw1[i] = '1';}
        if ( psw2[i] == 2) {psw1[i] = '2';}
        if ( psw2[i] == 3) {psw1[i] = '3';}
        if ( psw2[i] == 4) {psw1[i] = '4';}
        if ( psw2[i] == 5) {psw1[i] = '5';}
        if ( psw2[i] == 6) {psw1[i] = '6';}
        if ( psw2[i] == 7) {psw1[i] = '7';}
        if ( psw2[i] == 8) {psw1[i] = '8';}
        if ( psw2[i] == 9) {psw1[i] = '9';}
        if ( psw2[i] == 10) {psw1[i] = 'B';}
        if ( psw2[i] == 11) {psw1[i] = 'C';}
        if ( psw2[i] == 12) {psw1[i] = 'D';}
        if ( psw2[i] == 13) {psw1[i] = 'F';}
        if ( psw2[i] == 14) {psw1[i] = 'G';}
        if ( psw2[i] == 15) {psw1[i] = 'H';}
        if ( psw2[i] == 16) {psw1[i] = 'J';}
        if ( psw2[i] == 17) {psw1[i] = 'K';}
        if ( psw2[i] == 18) {psw1[i] = 'L';}
        if ( psw2[i] == 19) {psw1[i] = 'M';}
        if ( psw2[i] == 20) {psw1[i] = 'N';}
        if ( psw2[i] == 21) {psw1[i] = 'P';}
        if ( psw2[i] == 22) {psw1[i] = 'Q';}
        if ( psw2[i] == 23) {psw1[i] = 'R';}
        if ( psw2[i] == 24) {psw1[i] = 'S';}
        if ( psw2[i] == 25) {psw1[i] = 'T';}
        if ( psw2[i] == 26) {psw1[i] = 'V';}
        if ( psw2[i] == 27) {psw1[i] = 'W';}
        if ( psw2[i] == 28) {psw1[i] = 'X';}
        if ( psw2[i] == 29) {psw1[i] = 'Y';}
        if ( psw2[i] == 30) {psw1[i] = 'Z';}
        if ( psw2[i] == 31) {psw1[i] = '?';}
    }

    //printf("%c", psw1[5]);
    return psw1;
}



int p2n (char psw1[], int *psw2) {
    printf("Recibo psw1: %s\n", psw1);
    for ( int i = 0 ; i<8; i++) {   //recorro el pass para asignar valores numericos a psw2
    
        if ( psw1[i] == '0') {psw2[i] = 0;}
        if ( psw1[i] == '1') {psw2[i] = 1;}
        if ( psw1[i] == '2') {psw2[i] = 2;}
        if ( psw1[i] == '3') {psw2[i] = 3;}
        if ( psw1[i] == '4') {psw2[i] = 4;}
        if ( psw1[i] == '5') {psw2[i] = 5;}
        if ( psw1[i] == '6') {psw2[i] = 6;}
        if ( psw1[i] == '7') {psw2[i] = 7;}
        if ( psw1[i] == '8') {psw2[i] = 8;}
        if ( psw1[i] == '9') {psw2[i] = 9;}
        if ( psw1[i] == 'B') {psw2[i] = 10;}
        if ( psw1[i] == 'C') {psw2[i] = 11;}
        if ( psw1[i] == 'D') {psw2[i] = 12;}
        if ( psw1[i] == 'F') {psw2[i] = 13;}
        if ( psw1[i] == 'G') {psw2[i] = 14;}
        if ( psw1[i] == 'H') {psw2[i] = 15;}
        if ( psw1[i] == 'J') {psw2[i] = 16;}
        if ( psw1[i] == 'K') {psw2[i] = 17;}
        if ( psw1[i] == 'L') {psw2[i] = 18;}
        if ( psw1[i] == 'M') {psw2[i] = 19;}
        if ( psw1[i] == 'N') {psw2[i] = 20;}
        if ( psw1[i] == 'P') {psw2[i] = 21;}
        if ( psw1[i] == 'Q') {psw2[i] = 22;}
        if ( psw1[i] == 'R') {psw2[i] = 23;}
        if ( psw1[i] == 'S') {psw2[i] = 24;}
        if ( psw1[i] == 'T') {psw2[i] = 25;}
        if ( psw1[i] == 'V') {psw2[i] = 26;}
        if ( psw1[i] == 'W') {psw2[i] = 27;}
        if ( psw1[i] == 'X') {psw2[i] = 28;}
        if ( psw1[i] == 'Y') {psw2[i] = 29;}
        if ( psw1[i] == 'Z') {psw2[i] = 30;}
        if ( psw1[i] == '?') {psw2[i] = 31;}
    }

    return psw2;
}







