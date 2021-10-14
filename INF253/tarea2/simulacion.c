#include <stdio.h>
#include <stdlib.h>
#include "Animal.h"

int main(){
    int n = 1000;
    Animal** mundo;
    mundo = malloc(n*sizeof(Animal*));
    for (int i = 0; i < n; i++){
        mundo[i] = malloc(n*sizeof(Animal));
    }
    
    return 0;
}