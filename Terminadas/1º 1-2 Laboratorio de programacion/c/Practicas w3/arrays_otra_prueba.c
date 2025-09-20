#include <stdio.h>

// Array passed as an array without the size of its
// dimension
void printArr(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
        
    }
    printf("\n");
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};

    // Pass array to function
    printArr(arr, 5);
    
    return 0;
}
