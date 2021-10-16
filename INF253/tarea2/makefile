
out.o: simulacion.o animal.o
	gcc  simulacion.o animal.o -o  out.o -lm

animal.o: Animal.c Animal.h
	gcc -c Animal.c -o animal.o -lm

simulacion.o: simulacion.c
	gcc -c simulacion.c -o simulacion.o -lm

clean: 
	rm out.o simulacion.o animal.o

clear:
	rm out.o simulacion.o animal.o