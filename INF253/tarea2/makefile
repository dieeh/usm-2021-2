
simulacion.out: simulacion.o animal.o
	gcc simulacion.o animal.o -o simulacion.out

animal.o: Animal.c Animal.h
	gcc -c Animal.c -o animal.o

simulacion.o: simulacion.c
	gcc -c simulacion.c -o simulacion.o

clean: 
	rm simulacion.out simulacion.o animal.o