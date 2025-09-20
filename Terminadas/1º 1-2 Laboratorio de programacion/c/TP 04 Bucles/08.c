#include<stdio.h>
#include<stdlib.h>

int main () {



//  variable   mientras   con paso
//        |         |      | 
//        |         |      | 
  for (int i = 0; i < 10; i++)
 {
    printf("%d ", i);

    if (i == 3) {continue;}
    if (i == 6) {break;}
    
    printf("%d ", i);

 }

 //esto va a mostrar: 1 1 2 2 3 4 4 5 5 6
 //cuando llegue a 3 lo muestra al principio y va a reiniciarse en 4
 //cuando llegue a 6 lo muestra al principio y se termina el for

}


