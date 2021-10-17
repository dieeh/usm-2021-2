#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "Animal.h"


void CrearAnimal(Animal* a){
    char tipoF;
    printf("Tipo de fuerza: ");
    scanf(" %c", &tipoF);
    a->tipo_fuerza = tipoF;
    if (tipoF == 'e'){
        int valorF;
        printf("Valor de fuerza: ");
        scanf(" %d", &valorF);
        a->fuerza = (int*)malloc(sizeof(int));
        *(int*)a->fuerza = valorF;
    }
    if (tipoF == 'c'){
        char valorF;
        printf("Valor de fuerza: ");
        scanf(" %c", &valorF);
        a->fuerza = (char*)malloc(sizeof(char));
        *(char*)a->fuerza = valorF;
    }
    if (tipoF == 'f'){
        float valorF;
        printf("Valor de fuerza: ");
        scanf(" %f", &valorF);
        a->fuerza = (float*)malloc(sizeof(float));
        *(float*)a->fuerza = valorF;
    }
    
    char tipoV;
    printf("Tipo de velocidad: ");
    scanf(" %c", &tipoV);
    a->tipo_velocidad = tipoV;
    if (tipoV == 'e'){
        int valorV;
        printf("Valor de velocidad: ");
        scanf(" %d", &valorV);
        a->velocidad = (int*)malloc(sizeof(int));
        *(int*)a->velocidad = valorV;
    }
    if (tipoV == 'c'){
        char valorV;
        printf("Valor de velocidad: ");
        scanf(" %c", &valorV);
        a->velocidad = (char*)malloc(sizeof(char));
        *(char*)a->velocidad = valorV;
    }
    if (tipoV == 'f'){
        float valorV;
        printf("Valor de velocidad: ");
        scanf(" %f", &valorV);
        a->velocidad = (float*)malloc(sizeof(float));
        *(float*)a->velocidad = valorV;
    }

    char tipoR;
    printf("Tipo de resistencia: ");
    scanf(" %c", &tipoR);
    a->tipo_resistencia = tipoR;
    if (tipoR == 'e'){
        int valorR;
        printf("Valor de resistencia: ");
        scanf(" %d", &valorR);
        a->resistencia = (int*)malloc(sizeof(int));
        *(int*)a->resistencia = valorR;
    }
    if (tipoR == 'c'){
        char valorR;
        printf("Valor de resistencia: ");
        scanf(" %c", &valorR);
        a->resistencia = (char*)malloc(sizeof(char));
        *(char*)a->resistencia = valorR;
    }
    if (tipoR == 'f'){
        float valorR;
        printf("Valor de resistencia: ");
        scanf(" %f", &valorR);
        a->resistencia = (float*)malloc(sizeof(float));
        *(float*)a->resistencia = valorR;
    }
    int func1, func2;
    printf("Funcion reproducción: ");
    scanf(" %d", &func1);
    printf("Funcion comerHuir: ");
    scanf(" %d", &func2);

    if (func1 == 1){
        a->reproduccion = ReproduccionSimple;
    }
    if (func1 == 2){
        a->reproduccion = ReproduccionCruzada;
    }
    if (func2 == 1){
        a->comerHuir = ComerSiempre;
    }
    if (func2 == 2){
        a->comerHuir = HuirSiempre;
    }
    if (func2 == 3){
        a->comerHuir = ComerAleatorio;
    }
}

void Borrar(Animal* a){
    free(a->fuerza);
    free(a->velocidad);
    free(a->resistencia);
    //free(a);
}

void MostrarAnimal(Animal* a){
    if (a->tipo_fuerza == 'e'){
        printf("fuerza: %d\n", *(int*)a->fuerza);
    }
    if (a->tipo_fuerza == 'c'){
        printf("fuerza: %c\n", *(char*)a->fuerza);
    }
    if (a->tipo_fuerza == 'f'){
        printf("fuerza: %f\n", *(float*)a->fuerza);
    }

    if (a->tipo_velocidad == 'e'){
        printf("velocidad: %d\n", *(int*)a->velocidad);
    }
    if (a->tipo_velocidad == 'c'){
        printf("velocidad: %c\n", *(char*)a->velocidad);
    }
    if (a->tipo_velocidad == 'f'){
        printf("velocidad: %f\n", *(float*)a->velocidad);
    }

    if (a->tipo_resistencia == 'e'){
        printf("resistencia: %d\n", *(int*)a->resistencia);
    }
    if (a->tipo_resistencia == 'c'){
        printf("resistencia: %c\n", *(char*)a->resistencia);
    }
    if (a->tipo_resistencia == 'f'){
        printf("resistencia: %f\n", *(float*)a->resistencia);
    }
}

Animal* SeleccionarEspacio(Animal* a1, int* bool){
    int coord1, coord2, libre = 0 ;
    coord1 = a1->coord1;
    coord2 = a1->coord2;

    if ((mundo[coord1-1][coord2].fuerza != NULL) && (libre != 1)){ //left
        coord2 +=1;
        libre = 1;
    }
    if ((mundo[coord1][coord2+1].fuerza != NULL) && (libre != 1)){ //up
        coord2 -=1;
        libre = 1;
    }
    if ((mundo[coord1+1][coord2].fuerza != NULL) && (libre != 1)){ //right
        coord1 +=1;
        libre = 1;
    }
    if ((mundo[coord1][coord2-1].fuerza != NULL) && (libre != 1)){ //down
        coord1 -=1;
        libre = 1;
    }

    if (libre == 1){
        *bool = 1;
        mundo[coord1][coord2].coord1 = coord1;
        mundo[coord1][coord2].coord2 = coord2;
        return &(mundo[coord1][coord2]);
    }else{
        *bool = 0;
        return &(mundo[0][0]);
    }
}

void Reproducir(Animal* a1, Animal* a2, Animal* hijo){
    int vida;
    Animal* hj = SeleccionarEspacio(a1, &vida);
    if (vida == 0){
        printf("No hay espacios disponibles, el hijo muere");
        return;
    }else{
        hijo = hj;
    }

    int r = rand();
    if (r%2 == 0){
        printf("Usando funcion reproducir de a1");
        a1->reproduccion(a1, a2, hijo);
    }else{
        printf("Usando funcion reproducir de a2");
        a2->reproduccion(a2, a1, hijo);
    }
}

void ComerOHuir(Animal* a1, Animal* a2){
    int r = rand();
    if (r%2 == 0){
        printf("Usando funcion ComerOHuir de a1");
        a1->comerHuir(a1, a2);
    }else{
        printf("Usando funcion ComerOHuir de a2");
        a2->comerHuir(a2, a1);
    }
}

int Comparar(Animal* a1, Animal* a2){
    int an1 = 0, an2 = 0;
    int fuerza1, fuerza2;
    if (a1->tipo_fuerza == 'e'){
        fuerza1 = *(int*)a1->fuerza;
    }
    if (a1->tipo_fuerza == 'c'){
        char temp = *(char*)a1->fuerza;
        fuerza1 = ((int) temp)/4;
    }
    if (a1->tipo_fuerza == 'f'){
        float temp = *(float*)a1->fuerza;
        fuerza1 = (int) round(temp);
    }
    if (a2->tipo_fuerza == 'e'){
        fuerza2 = *(int*)a2->fuerza;
    }
    if (a2->tipo_fuerza == 'c'){
        char temp = *(char*)a2->fuerza;
        fuerza2 = ((int) temp)/4;
    }
    if (a2->tipo_fuerza == 'f'){
        float temp = *(float*)a2->fuerza;
        fuerza2 = (int) round(temp);
    }

    int velocidad1, velocidad2;
    if (a1->tipo_velocidad == 'e'){
        velocidad1 = *(int*)a1->velocidad;
    }
    if (a1->tipo_velocidad == 'c'){
        char temp = *(char*)a1->velocidad;
        velocidad1 = ((int) temp)/4;
    }
    if (a1->tipo_velocidad == 'f'){
        float temp = *(float*)a1->velocidad;
        velocidad1 = (int) round(temp);
    }
    if (a2->tipo_velocidad == 'e'){
        velocidad2 = *(int*)a2->velocidad;
    }
    if (a2->tipo_velocidad == 'c'){
        char temp = *(char*)a2->velocidad;
        velocidad2 = ((int) temp)/4;
    }
    if (a2->tipo_velocidad == 'f'){
        float temp = *(float*)a2->velocidad;
        velocidad2 = (int) round(temp);
    }

    int resistencia1, resistencia2;
    if (a1->tipo_resistencia == 'e'){
        resistencia1 = *(int*)a1->resistencia;
    }
    if (a1->tipo_resistencia == 'c'){
        char temp = *(char*)a1->resistencia;
        resistencia1 = ((int) temp)/4;
    }
    if (a1->tipo_resistencia == 'f'){
        float temp = *(float*)a1->resistencia;
        resistencia1 = (int) round(temp);
    }
    if (a2->tipo_resistencia == 'e'){
        resistencia2 = *(int*)a2->resistencia;
    }
    if (a2->tipo_resistencia == 'c'){
        char temp = *(char*)a2->resistencia;
        resistencia2 = ((int) temp)/4;
    }
    if (a2->tipo_resistencia == 'f'){
        float temp = *(float*)a2->resistencia;
        resistencia2 = (int) round(temp);
    }
    
    if (fuerza1 > fuerza2){
        an1 +=1;
    }
    if (fuerza1 < fuerza2){
        an2 +=1;
    }
    if (fuerza1 == fuerza2){
        an1 +=1;
        an2 +=1;
    }
    
    if (velocidad1 > velocidad2){
        an1 +=1;
    }
    if (velocidad1 < velocidad2){
        an2 +=1;
    }
    if (velocidad1 == velocidad2){
        an1 +=1;
        an2 +=1;
    }

    if (resistencia1 > resistencia2){
        an1 +=1;
    }
    if (resistencia1 < resistencia2){
        an2 +=1;
    }
    if (resistencia1 == resistencia2){
        an1 +=1;
        an2 +=1;
    }

    if (an1 > an2){
        return 1;
    }else{
        return 0;
    }
}

void BorrarMundo(Animal** Mundo){
    int i, j;
    for (i = 0; i < n; i++){
        for (j = 0; j < n; j++){
            if (Mundo[i][j].fuerza != NULL){
                Borrar(&(Mundo[i][j]));
            }
        }
        free(Mundo[i]);
    }
    free(Mundo);
}

void MostrarMundo(Animal** Mundo){
    int s, d;
    for (s = 0; s < n; s++){
        for (d = 0; d < n; d++){
            if ((Mundo[s][d].fuerza) != NULL){
                printf("Existe un animal en las coordenadas (%d, %d) con estadisticas: \n", s, d);
                MostrarAnimal(&(Mundo[s][d]));
                printf("\n");
            }
            else{
                continue;
            }
        }
    }
}

void ReproduccionSimple(Animal* a1, Animal* a2, Animal* hijo){
    int comparacion = Comparar(a1, a2);
    if (comparacion == 0){
        hijo->fuerza = a1->fuerza;
        hijo->tipo_fuerza = a1->tipo_fuerza;
        hijo->velocidad = a1->velocidad;
        hijo->tipo_velocidad = a1->tipo_velocidad;
        hijo->resistencia = a1->resistencia;
        hijo->tipo_resistencia = a1->tipo_resistencia;
        hijo->reproduccion = a1->reproduccion;
        hijo->comerHuir = a1->comerHuir;
    }else{
        hijo->fuerza = a2->fuerza;
        hijo->tipo_fuerza = a2->tipo_fuerza;
        hijo->velocidad = a2->velocidad;
        hijo->tipo_velocidad = a2->tipo_velocidad;
        hijo->resistencia = a2->resistencia;
        hijo->tipo_resistencia = a2->tipo_resistencia;
        hijo->reproduccion = a2->reproduccion;
        hijo->comerHuir = a2->comerHuir;
    }
}

void ReproduccionCruzada(Animal* a1, Animal* a2, Animal* hijo){
    int comparacion = Comparar(a1, a2);
    if (comparacion == 0){
        hijo->fuerza = a1->fuerza;
        hijo->tipo_fuerza = a1->tipo_fuerza;
        hijo->velocidad = a1->velocidad;
        hijo->tipo_velocidad = a1->tipo_velocidad;
        hijo->resistencia = a2->resistencia;
        hijo->tipo_resistencia = a2->tipo_resistencia;
        hijo->reproduccion = a1->reproduccion;
        hijo->comerHuir = a2->comerHuir;
    }else{
        hijo->fuerza = a2->fuerza;
        hijo->tipo_fuerza = a2->tipo_fuerza;
        hijo->velocidad = a2->velocidad;
        hijo->tipo_velocidad = a2->tipo_velocidad;
        hijo->resistencia = a1->resistencia;
        hijo->tipo_resistencia = a1->tipo_resistencia;
        hijo->reproduccion = a2->reproduccion;
        hijo->comerHuir = a1->comerHuir;
    }
}

void ComerSiempre(Animal* a1, Animal* a2){
    int f1, r2;
    if (a1->tipo_fuerza == 'e'){
        f1 = *(int*)a1->fuerza;
    }
    if (a1->tipo_fuerza == 'c'){
        char temp = *(char*)a1->fuerza;
        f1 = (int) temp;
    }
    if (a1->tipo_fuerza == 'f'){
        float temp = *(float*)a1->fuerza;
        f1 = (int) round(temp);
    }
    if (a2->tipo_resistencia == 'e'){
        r2 = *(int*)a1->resistencia;
    }
    if (a2->tipo_resistencia == 'c'){
        char temp = *(char*)a1->resistencia;
        r2 = (int) temp;
    }
    if (a2->tipo_resistencia == 'f'){
        float temp = *(float*)a1->resistencia;
        r2 = (int) round(temp);
    }
    if (f1 > r2){
        Borrar(a1);
        Intercambiar(a1, a2);
    }else{
        Borrar(a2);
    }
}

void Intercambiar(Animal* a1, Animal* a2){
    Animal temp1, temp2;
    
    temp1.fuerza = a1->fuerza;
    temp1.tipo_fuerza = a1->tipo_fuerza;
    temp1.velocidad = a1->velocidad;
    temp1.tipo_velocidad = a1->tipo_velocidad;
    temp1.resistencia = a1->resistencia;
    temp1.tipo_resistencia = a1->tipo_resistencia;
    temp1.reproduccion = a1->reproduccion;
    temp1.comerHuir = a1->comerHuir;
    temp1.coord1 = a1->coord1;
    temp1.coord2 = a1->coord2;

    temp2.fuerza = a2->fuerza;
    temp2.tipo_fuerza = a2->tipo_fuerza;
    temp2.velocidad = a2->velocidad;
    temp2.tipo_velocidad = a2->tipo_velocidad;
    temp2.resistencia = a2->resistencia;
    temp2.tipo_resistencia = a2->tipo_resistencia;
    temp2.reproduccion = a2->reproduccion;
    temp2.comerHuir = a2->comerHuir;
    temp2.coord1 = a2->coord1;
    temp2.coord2 = a2->coord2;

    a1->fuerza = temp2.fuerza;
    a1->tipo_fuerza = temp2.tipo_fuerza;
    a1->velocidad = temp2.velocidad;
    a1->tipo_velocidad = temp2.tipo_velocidad;
    a1->resistencia = temp2.resistencia;
    a1->tipo_resistencia = temp2.tipo_velocidad;
    a1->reproduccion = temp2.reproduccion;
    a1->comerHuir = temp2.comerHuir;
    a1->coord1 = temp2.coord1;
    a1->coord2 = temp2.coord2;

    a2->fuerza = temp1.fuerza;
    a2->tipo_fuerza = temp1.tipo_fuerza;
    a2->velocidad = temp1.velocidad;
    a2->tipo_velocidad = temp1.tipo_velocidad;
    a2->resistencia = temp1.resistencia;
    a2->tipo_resistencia = temp1.tipo_velocidad;
    a2->reproduccion = temp1.reproduccion;
    a2->comerHuir = temp1.comerHuir;
    a2->coord1 = temp1.coord1;
    a2->coord2 = temp1.coord2;
}

void HuirSiempre(Animal* a1, Animal* a2){
    int a;
    Animal* espacio = SeleccionarEspacio(a1, &a);
    if (a == 0){
        Borrar(a1);
    }
    
    int velocidad1, velocidad2;
    if (a1->tipo_velocidad == 'e'){
        velocidad1 = *(int*)a1->velocidad;
    }
    if (a1->tipo_velocidad == 'c'){
        char temp = *(char*)a1->velocidad;
        velocidad1 = ((int) temp)/4;
    }
    if (a1->tipo_velocidad == 'f'){
        float temp = *(float*)a1->velocidad;
        velocidad1 = (int) round(temp);
    }
    if (a2->tipo_velocidad == 'e'){
        velocidad2 = *(int*)a2->velocidad;
    }
    if (a2->tipo_velocidad == 'c'){
        char temp = *(char*)a2->velocidad;
        velocidad2 = ((int) temp)/4;
    }
    if (a2->tipo_velocidad == 'f'){
        float temp = *(float*)a2->velocidad;
        velocidad2 = (int) round(temp);
    }

    int an1 = 0, an2 = 0;
    if (velocidad1 > velocidad2){
        an1 +=1;
    }
    if (velocidad1 < velocidad2){
        an2 +=1;
    }
    if (velocidad1 == velocidad2){
        an1 +=1;
        an2 +=1;
    }

    if (an1 > an2){
        Intercambiar(a1, espacio);
    }else{
        Borrar(a1);
    }
}

void ComerAleatorio(Animal* a1, Animal* a2){
    int rand1, rand2, int1 = 0, int2 = 0;
    rand1 = rand();

    if (rand1%3 == 0){ //fuerza
        if (a1->tipo_fuerza == 'e'){
            int1 = *(int*)a1->fuerza;
        }
        if (a1->tipo_fuerza == 'c'){
            char temp = *(char*)a1->fuerza;
            int1 = ((int) temp)/4;
        }
        if (a1->tipo_fuerza == 'f'){
            float temp = *(float*)a1->fuerza;
            int1 = (int) round(temp);
        }
    }
    if (rand1%3 == 1){ //velocidad
        if (a1->tipo_velocidad == 'e'){
            int1 = *(int*)a1->velocidad;
        }
        if (a1->tipo_velocidad == 'c'){
            char temp = *(char*)a1->velocidad;
            int1 = ((int) temp)/4;
        }
        if (a1->tipo_velocidad == 'f'){
            float temp = *(float*)a1->velocidad;
            int1 = (int) round(temp);
        }
    }
    if (rand1%3 == 2){ //resistencia
        if (a1->tipo_resistencia == 'e'){
            int1 = *(int*)a1->resistencia;
        }
        if (a1->tipo_resistencia == 'c'){
            char temp = *(char*)a1->resistencia;
            int1 = ((int) temp)/4;
        }
        if (a1->tipo_resistencia == 'f'){
            float temp = *(float*)a1->resistencia;
            int1 = (int) round(temp);
        }
    }

    rand2 = rand();
    if (rand2%3 == 0){ //fuerza
        if (a2->tipo_fuerza == 'e'){
            int2 = *(int*)a2->fuerza;
        }
        if (a2->tipo_fuerza == 'c'){
            char temp = *(char*)a2->fuerza;
            int2 = ((int) temp)/4;
        }
        if (a2->tipo_fuerza == 'f'){
            float temp = *(float*)a2->fuerza;
            int2 = (int) round(temp);
        }
    }
    if (rand2%3 == 1){ //velocidad
        if (a2->tipo_velocidad == 'e'){
            int2 = *(int*)a2->velocidad;
        }
        if (a2->tipo_velocidad == 'c'){
            char temp = *(char*)a2->velocidad;
            int2 = ((int) temp)/4;
        }
        if (a2->tipo_velocidad == 'f'){
            float temp = *(float*)a2->velocidad;
            int2 = (int) round(temp);
        }
    }
    if (rand2%3 == 2){ //resistencia
        if (a2->tipo_resistencia == 'e'){
            int2 = *(int*)a2->resistencia;
        }
        if (a2->tipo_resistencia == 'c'){
            char temp = *(char*)a2->resistencia;
            int2 = ((int) temp)/4;
        }
        if (a2->tipo_resistencia == 'f'){
            float temp = *(float*)a2->resistencia;
            int2 = (int) round(temp);
        }
    }

    if (int1 > int2){
        Borrar(a2);
    }else{
        Borrar(a1);
        Intercambiar(a1, a2);
    }

}
