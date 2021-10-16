#include <stdio.h>
#include <stdlib.h>
#include <string.h>
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
        a->fuerza = valorF;
    }
    if (tipoF == 'c'){
        char valorF;
        printf("Valor de fuerza: ");
        scanf(" %c", &valorF);
        a->fuerza = (char*)malloc(sizeof(char));
        a->fuerza = valorF;
    }
    if (tipoF == 'f'){
        float valorF;
        printf("Valor de fuerza: ");
        scanf(" %f", &valorF);
        a->fuerza = (float*)malloc(sizeof(float));
        a->fuerza = &valorF;
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
        a->velocidad = valorV;
    }
    if (tipoV == 'c'){
        char valorV;
        printf("Valor de velocidad: ");
        scanf(" %c", &valorV);
        a->velocidad = (char*)malloc(sizeof(char));
        a->velocidad = valorV;
    }
    if (tipoV == 'f'){
        float valorV;
        printf("Valor de velocidad: ");
        scanf(" %f", &valorV);
        a->velocidad = (float*)malloc(sizeof(float));
        a->velocidad = &valorV;
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
        a->resistencia = valorR;
    }
    if (tipoR == 'c'){
        char valorR;
        printf("Valor de resistencia: ");
        scanf(" %c", &valorR);
        a->resistencia = (char*)malloc(sizeof(char));
        a->resistencia = valorR;
    }
    if (tipoR == 'f'){
        float valorR;
        printf("Valor de resistencia: ");
        scanf(" %f", &valorR);
        a->resistencia = (float*)malloc(sizeof(float));
        a->resistencia = &valorR;
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
    if (a->tipo_fuerza = 'e'){
        int fuerza = *(int*)a->fuerza;
        printf("fuerza: %d", fuerza);
    }
    if (a->tipo_fuerza = 'c'){
        char fuerza = *(char*)a->fuerza;
        printf("fuerza: %c", fuerza);
    }
    if (a->tipo_fuerza = 'f'){
        float fuerza = *(float*)a->fuerza;
        printf("fuerza: %f", fuerza);
    }

    if (a->tipo_velocidad = 'e'){
        int velocidad = *(int*)a->velocidad;
        printf("velocidad: %d", velocidad);
    }
    if (a->tipo_velocidad = 'c'){
        char velocidad = *(char*)a->velocidad;
        printf("velocidad: %c", velocidad);
    }
    if (a->tipo_velocidad = 'f'){
        float velocidad = *(float*)a->velocidad;
        printf("velocidad: %f", velocidad);
    }

    if (a->tipo_resistencia = 'e'){
        int resistencia = *(int*)a->resistencia;
        printf("resistencia: %d", resistencia);
    }
    if (a->tipo_resistencia = 'c'){
        char resistencia = *(char*)a->resistencia;
        printf("resistencia: %c", resistencia);
    }
    if (a->tipo_resistencia = 'f'){
        float resistencia = *(float*)a->resistencia;
        printf("resistencia: %f", resistencia);
    }
}

void Reproducir(Animal* a1, Animal* a2, Animal* hijo){
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
    int an1, an2;
    int fuerza1, fuerza2;
    if (a1->tipo_fuerza = 'e'){
        fuerza1 = *(int*)a1->fuerza;
    }
    if (a1->tipo_fuerza = 'c'){
        char temp = *(char*)a1->fuerza;
        fuerza1 = ((int) temp)/4;
    }
    if (a1->tipo_fuerza = 'f'){
        float temp = *(float*)a1->fuerza;
        fuerza1 = (int) round(temp);
    }
    if (a2->tipo_fuerza = 'e'){
        fuerza2 = *(int*)a2->fuerza;
    }
    if (a2->tipo_fuerza = 'c'){
        char temp = *(char*)a2->fuerza;
        fuerza2 = ((int) temp)/4;
    }
    if (a2->tipo_fuerza = 'f'){
        float temp = *(float*)a2->fuerza;
        fuerza2 = (int) round(temp);
    }

    int velocidad1, velocidad2;
    if (a1->tipo_velocidad = 'e'){
        velocidad1 = *(int*)a1->velocidad;
    }
    if (a1->tipo_velocidad = 'c'){
        char temp = *(char*)a1->velocidad;
        velocidad1 = ((int) temp)/4;
    }
    if (a1->tipo_velocidad = 'f'){
        float temp = *(float*)a1->velocidad;
        velocidad1 = (int) round(temp);
    }
    if (a2->tipo_velocidad = 'e'){
        velocidad2 = *(int*)a2->velocidad;
    }
    if (a2->tipo_velocidad = 'c'){
        char temp = *(char*)a2->velocidad;
        velocidad2 = ((int) temp)/4;
    }
    if (a2->tipo_velocidad = 'f'){
        float temp = *(float*)a2->velocidad;
        velocidad2 = (int) round(temp);
    }

    int resistencia1, resistencia2;
    if (a1->tipo_resistencia = 'e'){
        resistencia1 = *(int*)a1->resistencia;
    }
    if (a1->tipo_resistencia = 'c'){
        char temp = *(char*)a1->resistencia;
        resistencia1 = ((int) temp)/4;
    }
    if (a1->tipo_resistencia = 'f'){
        float temp = *(float*)a1->resistencia;
        resistencia1 = (int) round(temp);
    }
    if (a2->tipo_resistencia = 'e'){
        resistencia2 = *(int*)a2->resistencia;
    }
    if (a2->tipo_resistencia = 'c'){
        char temp = *(char*)a2->resistencia;
        resistencia2 = ((int) temp)/4;
    }
    if (a2->tipo_resistencia = 'f'){
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
    int i, j;
    for (i = 0; i < n; i++){
        for (j = 0; j < n; j++){
            if (Mundo[i][j].fuerza == NULL){
                printf("Existe un animal en las coordenadas (%d, %d) con estadisticas: ", i, j);
                MostrarAnimal(&(Mundo[i][j]));
            }
            else{
                printf("Existe un animal en las coordenadas (%d, %d) con estadisticas: ", i, j);
                MostrarAnimal(&(Mundo[i][j]));
            }
        }
        printf("\n");
    }
}

void ReproduccionSimple(Animal* a1, Animal* a2, Animal* hijo){}

void ReproduccionCruzada(Animal* a1, Animal* a2, Animal* hijo){}

void ComerSiempre(Animal* a1, Animal* a2){
    int f1, r2;
    if (a1->tipo_fuerza = 'e'){
        f1 = *(int*)a1->fuerza;
    }
    if (a1->tipo_fuerza = 'c'){
        char temp = *(char*)a1->fuerza;
        f1 = (int) temp;
    }
    if (a1->tipo_fuerza = 'f'){
        float temp = *(float*)a1->fuerza;
        f1 = (int) round(temp);
    }
    if (a2->tipo_resistencia = 'e'){
        r2 = *(int*)a1->resistencia;
    }
    if (a2->tipo_resistencia = 'c'){
        char temp = *(char*)a1->resistencia;
        r2 = (int) temp;
    }
    if (a2->tipo_resistencia = 'f'){
        float temp = *(float*)a1->resistencia;
        r2 = (int) round(temp);
    }
    if (f1 > r2){
        Borrar(a1);
    }else{
        Borrar(a2);
    }
}

void HuirSiempre(Animal* a1, Animal* a2){}

void ComerAleatorio(Animal* a1, Animal* a2){}