
#include <stdio.h>

int IsValid(int Level, signed char a, signed char b, signed char c, signed char d);

unsigned char CodesTable[] =
{
    0xFF, 0x00, 0x01, 0x02, 0xFF, 0xFF, 0x03, 0x04, 0xFF, 0x05, 0x06, 0x07, 0x08, 0xFF, 0xFF, 0x09, 
    0x0A, 0x0B, 0xFF, 0x0C, 0xFF, 0x0D, 0xFF, 0xFF, 0x0E, 0x0F 
};

int IsValid(int Level, signed char a, signed char b, signed char c, signed char d)
{
    if ((a == -1)||(b == -1)||(c == -1)||(d == -1)) return 0;

    a <<= 4;
    a |= b;

    c <<= 4;
    c |= d;
    c -= 0x0E;
    c ^= 0xFF;

    return ((a == c)&&(a == Level));
}

int main()
{
  printf("Adventures of Lolo 1 Password Generator (by TFG)\n\n");
  
  int lev, aLev = 1, bLev = 1;
  char a, b, c, d;
  
  for(lev = 0; lev <= 50; lev++){
    for(a = 0; a <= 25; a++){
      for(b = 0; b <= 25; b++){
        for(c = 0; c <= 25; c++){
          for(d = 0; d <= 25; d++){
            if (IsValid(lev, CodesTable[a], CodesTable[b], CodesTable[c], CodesTable[d]) != 0){
                        printf("(%02d-%d):%c%c%c%c ", aLev, bLev, a + 'A', b + 'A', c + 'A', d + 'A');
                        bLev++;
            }
          }
        }
      }
    }
    
    if (bLev > 5){
        printf("\n");
        bLev = 1;
        aLev++;
    }
  } 
  
  return 0;
}