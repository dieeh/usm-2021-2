typedef struct Animal{
    void* fuerza;
    char tipo_fuerza;
} Animal;


int main(){
//    Animal* a = (Animal*)malloc(sizeof(Animal));

    int abc = 15;
    int bde = abc%3;
    printf("%d", bde);

//    char tipoF;
//    printf("Tipo de fuerza: ");
//    scanf(" %c", &tipoF);
//    a->tipo_fuerza = tipoF;
//    if (tipoF == 'e'){
//        int valorF;
//        printf("Valor de fuerza: ");
//        scanf(" %d", &valorF);
//        a->fuerza = (int*)malloc(sizeof(int));
//        *(int*)a->fuerza = valorF;
//        printf("%d", a->fuerza);
//    }
//    if (tipoF == 'c'){
//        char valorF;
//        printf("Valor de fuerza: ");
//        scanf(" %c", &valorF);
//        a->fuerza = (char*)malloc(sizeof(char));
//        *(char*)a->fuerza = valorF;
//        printf("%c", a->fuerza);
//    }
//    if (tipoF == 'f'){
//        float valorF;
//        printf("Valor de fuerza: ");
//        scanf(" %f", &valorF);
//        a->fuerza = (float*)malloc(sizeof(float));
//        *(float*)a->fuerza = valorF;
//        printf("%f", *(float*)a->fuerza);
//    }
    

    return 0;
}