#include <stdio.h>
#include <stdlib.h>
#include <math.h>
//#include <stdbool.h> //bool no funcionaba (? creo que es por la version de C -> **cambiado por un int 0 y 1**
#include "Animal.h"

void iteracion_temp(Animal** Mundo){
    for (int a = 0; a < n; a++){
        for (int b = 0; b < n; b++){
            if (mundo[a][b].fuerza != NULL){
                int random = rand();

                if (random%4 == 0){ //up
                    if (mundo[a][b+1].fuerza == NULL){
                        Intercambiar(&(mundo[a][b]),&(mundo[a][b+1]));
                    }else{
                        int p = 0;
                        Animal* temp = SeleccionarEspacio(&(mundo[a][b]), &p);
                        if (p != 0){
                            Reproducir(&(mundo[a][b]),&(mundo[a][b+1]), temp);
                        }
                        ComerOHuir(&(mundo[a][b]),&(mundo[a][b+1]));
                    }
                }
                if (random%4 == 1){ //right
                    if (mundo[a][b+1].fuerza == NULL){
                        Intercambiar(&(mundo[a][b]),&(mundo[a+1][b]));
                    }else{
                        int p = 0;
                        Animal* temp = SeleccionarEspacio(&(mundo[a][b]), &p);
                        if (p != 0){
                            Reproducir(&(mundo[a][b]),&(mundo[a+1][b]), temp);
                        }
                        ComerOHuir(&(mundo[a][b]),&(mundo[a+1][b]));
                    }
                }
                if (random%4 == 2){ //down
                    if (mundo[a][b+1].fuerza == NULL){
                        Intercambiar(&(mundo[a][b]),&(mundo[a][b-1]));
                    }else{
                        int p = 0;
                        Animal* temp = SeleccionarEspacio(&(mundo[a][b]), &p);
                        if (p != 0){
                            Reproducir(&(mundo[a][b]),&(mundo[a][b-1]), temp);
                        }
                        ComerOHuir(&(mundo[a][b]),&(mundo[a][b-1]));
                    }
                }
                if (random%4 == 3){ //left
                    if (mundo[a][b+1].fuerza == NULL){
                        Intercambiar(&(mundo[a][b]),&(mundo[a-1][b]));
                    }else{
                        int p = 0;
                        Animal* temp = SeleccionarEspacio(&(mundo[a][b]), &p);
                        if (p != 0){
                            Reproducir(&(mundo[a][b]),&(mundo[a-1][b]), temp);
                        }
                        ComerOHuir(&(mundo[a][b]),&(mundo[a-1][b]));
                    }
                }
            }
        }
    }
}


int n = 10;  //cambiar dsps
Animal** mundo; //matriz global


int main(){
    int programa = 1; //ex bool
    int i;
    mundo = (Animal**)malloc(sizeof(Animal*) * n);
    for(i = 0; i < n; i++){
        mundo[i] = (Animal*)malloc(sizeof(Animal) * n);
    }
    srand(20788120);  //seed del rand()

    //menu
    while (programa == 1){
        int input;
        printf("\n");
        printf("------Menú------\n");
        printf("1.- Crear animal\n");
        printf("2.- Avanzar una iteración en el tiempo\n");
        printf("3.- Mostrar el mundo\n");
        printf("4.- Terminar el programa\n");
        printf("----------------\n");
        printf("\n");
        printf("Ingrese una opcion del menu: ");
        scanf(" %d", &input);
        if (input == 1){
            int x, y;
            printf("Ingrese coordenada x (0-999): ");
            scanf(" %d", &x);
            printf("Ingrese coordenada y (0-999): ");
            scanf(" %d", &y);
            mundo[x][y].coord1 = x;
            mundo[x][y].coord2 = y;
            CrearAnimal(&(mundo[x][y]));
            continue;
        }
        if (input == 2){
            iteracion_temp(mundo);
            continue;
        }
        if (input == 3){
            MostrarMundo(mundo);
            continue;
        }
        if (input == 4){
            programa = 0;
            BorrarMundo(mundo);
            break;
        }
    }
    
    //for (i = 0; i < n; i++){  //ya no necesario, se ejecuta
    //    free(mundo[i]);       //en BorrarMundo()
    //}
    //free(mundo);
    return 0;
}