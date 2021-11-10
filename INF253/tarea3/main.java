package INF253.tarea3;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        System.out.println("<===== Menú del DM =====>");
        System.out.println("Selecciona el tamaño del mundo:");
        Scanner input = new Scanner(System.in);
        int tamano = input.nextInt();
        Tierra[] mundo = new Tierra[tamano];
        for (int i = 0; i < mundo.length; i++) {
            System.out.println("Selecciona el tipo de tierra de esta casilla:");
            System.out.println("1: Montaña");
            System.out.println("2: Planicie");
            System.out.println("3: Bosque");
            int tipo = input.nextInt();
            if (tipo == 1) {
                System.out.println("¿Quieres que haya un monstruo o un Jefe final en esta casilla?");
                System.out.println("1: Monstruo");
                System.out.println("2: Jefe final");
                int mon_jefe = input.nextInt();
                if (mon_jefe == 1) {
                    System.out.println("¿Quieres un que haya un NPC en esta casilla?");
                    System.out.println("1: Si");
                    System.out.println("2: No");
                    int siono = input.nextInt();
                    if (siono == 1){
                        System.out.println("¿Cantidad de vida del monstruo?");
                        int vida_m = input.nextInt();
                        System.out.println("¿Cantidad de daño del monstruo?");
                        int dano_m = input.nextInt();
                        Monstruo temp = new Monstruo(vida_m, dano_m);
                        //NPC temp2;
                        System.out.println("¿Qué tipo de NPC quieres en esta casilla?");
                        System.out.println("1: Bueno");
                        System.out.println("2: Malo");
                        System.out.println("3: Neutro");
                        int tipoNPC = input.nextInt();
                        if (tipoNPC == 1){
                            System.out.println("¿Que nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿Qué atributo subirá este NPC?");
                            String atributoNPC = input.next();
                            System.out.println("¿En cuánto aumentará este atributo?");
                            int cantidadNPC = input.nextInt();
                            NPC temp2 = new Bueno(nameNPC, atributoNPC, cantidadNPC);
                            mundo[i] = new Montana(temp, temp2);
                        } else if (tipoNPC == 2){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿En cuánto bajará la energía este NPC?");
                            int energiaNPC = input.nextInt();
                            System.out.println("¿En cuánto bajará el maná este NPC?");
                            int manaNPC = input.nextInt();
                            NPC temp2 = new Malo(nameNPC, energiaNPC, manaNPC);
                            mundo[i] = new Montana(temp, temp2);
                        } else if (tipoNPC == 3){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿Cuál será el requisito de la misión que entregue este NPC?  (v/m)");
                            char requisitoNPC = input.next().charAt(0);
                            System.out.println("¿Cuál será el valor de este requisito?");
                            int valorNPC = input.nextInt();
                            System.out.println("¿Cuál será la cantidad de xp que se entregará como recompensa?");
                            int recomNPC = input.nextInt();
                            NPC temp2 = new Neutro(nameNPC, requisitoNPC, valorNPC, recomNPC);
                            mundo[i] = new Montana(temp, temp2);
                        }
                        //mundo[i] = new Montana(temp1, temp2);
                    } else if (siono == 2){
                        System.out.println("¿Cantidad de vida del monstruo?");
                        int vida_m = input.nextInt();
                        System.out.println("¿Cantidad de daño del monstruo?");
                        int dano_m = input.nextInt();
                        Monstruo temp = new Monstruo(vida_m, dano_m);
                        mundo[i] = new Montana(temp);
                    }
                } else if (mon_jefe == 2){
                    System.out.println("¿Quieres un que haya un NPC en esta casilla?");
                    System.out.println("1: Si");
                    System.out.println("2: No");
                    int siono = input.nextInt();
                    if (siono == 1){
                        System.out.println("¿Cuál será el nombre del Jefe Final?");
                        String nombre_j = input.next();
                        System.out.println("¿Cantidad de vida del Jefe Final?");
                        int vida_j = input.nextInt();
                        System.out.println("¿Cantidad de daño base del Jefe Final?");
                        int dano_j = input.nextInt();
                        Jefe_Final temp = new Jefe_Final(nombre_j, vida_j, dano_j);
                        //NPC temp4;
                        System.out.println("¿Qué tipo de NPC quieres en esta casilla?");
                        System.out.println("1: Bueno");
                        System.out.println("2: Malo");
                        System.out.println("3: Neutro");
                        int tipoNPC = input.nextInt();
                        if (tipoNPC == 1){
                            System.out.println("¿Que nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿Qué atributo subirá este NPC?");
                            String atributoNPC = input.next();
                            System.out.println("¿En cuánto aumentará este atributo?");
                            int cantidadNPC = input.nextInt();
                            NPC temp2 = new Bueno(nameNPC, atributoNPC, cantidadNPC);
                            mundo[i] = new Montana(temp, temp2);
                        } else if (tipoNPC == 2){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿En cuánto bajará la energía este NPC?");
                            int energiaNPC = input.nextInt();
                            System.out.println("¿En cuánto bajará el maná este NPC?");
                            int manaNPC = input.nextInt();
                            NPC temp2 = new Malo(nameNPC, energiaNPC, manaNPC);
                            mundo[i] = new Montana(temp, temp2);
                        } else if (tipoNPC == 3){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿Cuál será el requisito de la misión que entregue este NPC?  (v/m)");
                            char requisitoNPC = input.next().charAt(0);
                            System.out.println("¿Cuál será el valor de este requisito?");
                            int valorNPC = input.nextInt();
                            System.out.println("¿Cuál será la cantidad de xp que se entregará como recompensa?");
                            int recomNPC = input.nextInt();
                            NPC temp2 = new Neutro(nameNPC, requisitoNPC, valorNPC, recomNPC);
                            mundo[i] = new Montana(temp, temp2);
                        }
                        //mundo[i] = new Montana(temp3, temp4);
                    } else if (siono == 2){
                        System.out.println("¿Cuál será el nombre del Jefe Final?");
                        String nombre_j = input.next();
                        System.out.println("¿Cantidad de vida del Jefe Final?");
                        int vida_j = input.nextInt();
                        System.out.println("¿Cantidad de daño base del Jefe Final?");
                        int dano_j = input.nextInt();
                        Jefe_Final temp = new Jefe_Final(nombre_j, vida_j, dano_j);
                        mundo[i] = new Montana(temp);
                    }
                }
                
                
            } else if (tipo == 2){
                System.out.println("¿Quieres que haya un monstruo o un Jefe final en esta casilla?");
                System.out.println("1: Monstruo");
                System.out.println("2: Jefe final");
                int mon_jefe = input.nextInt();
                if (mon_jefe == 1) {
                    System.out.println("¿Quieres un que haya un NPC en esta casilla?");
                    System.out.println("1: Si");
                    System.out.println("2: No");
                    int siono = input.nextInt();
                    if (siono == 1){
                        System.out.println("¿Cantidad de vida del monstruo?");
                        int vida_m = input.nextInt();
                        System.out.println("¿Cantidad de daño del monstruo?");
                        int dano_m = input.nextInt();
                        Monstruo temp = new Monstruo(vida_m, dano_m);
                        //NPC temp6;
                        System.out.println("¿Qué tipo de NPC quieres en esta casilla?");
                        System.out.println("1: Bueno");
                        System.out.println("2: Malo");
                        System.out.println("3: Neutro");
                        int tipoNPC = input.nextInt();
                        if (tipoNPC == 1){
                            System.out.println("¿Que nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿Qué atributo subirá este NPC?");
                            String atributoNPC = input.next();
                            System.out.println("¿En cuánto aumentará este atributo?");
                            int cantidadNPC = input.nextInt();
                            NPC temp2 = new Bueno(nameNPC, atributoNPC, cantidadNPC);
                            mundo[i] = new Planicie(temp, temp2);
                        } else if (tipoNPC == 2){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿En cuánto bajará la energía este NPC?");
                            int energiaNPC = input.nextInt();
                            System.out.println("¿En cuánto bajará el maná este NPC?");
                            int manaNPC = input.nextInt();
                            NPC temp2 = new Malo(nameNPC, energiaNPC, manaNPC);
                            mundo[i] = new Planicie(temp, temp2);
                        } else if (tipoNPC == 3){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿Cuál será el requisito de la misión que entregue este NPC?  (v/m)");
                            char requisitoNPC = input.next().charAt(0);
                            System.out.println("¿Cuál será el valor de este requisito?");
                            int valorNPC = input.nextInt();
                            System.out.println("¿Cuál será la cantidad de xp que se entregará como recompensa?");
                            int recomNPC = input.nextInt();
                            NPC temp2 = new Neutro(nameNPC, requisitoNPC, valorNPC, recomNPC);
                            mundo[i] = new Planicie(temp, temp2);
                        }
                        //mundo[i] = new Planicie(temp5, temp6);
                    } else if (siono == 2){
                        System.out.println("¿Cantidad de vida del monstruo?");
                        int vida_m = input.nextInt();
                        System.out.println("¿Cantidad de daño del monstruo?");
                        int dano_m = input.nextInt();
                        Monstruo temp = new Monstruo(vida_m, dano_m);
                        mundo[i] = new Planicie(temp);
                    }
                } else if (mon_jefe == 2){
                    System.out.println("¿Quieres un que haya un NPC en esta casilla?");
                    System.out.println("1: Si");
                    System.out.println("2: No");
                    int siono = input.nextInt();
                    if (siono == 1){
                        System.out.println("¿Cuál será el nombre del Jefe Final?");
                        String nombre_j = input.next();
                        System.out.println("¿Cantidad de vida del Jefe Final?");
                        int vida_j = input.nextInt();
                        System.out.println("¿Cantidad de daño base del Jefe Final?");
                        int dano_j = input.nextInt();
                        Jefe_Final temp = new Jefe_Final(nombre_j, vida_j, dano_j);
                        //NPC temp8;
                        System.out.println("¿Qué tipo de NPC quieres en esta casilla?");
                        System.out.println("1: Bueno");
                        System.out.println("2: Malo");
                        System.out.println("3: Neutro");
                        int tipoNPC = input.nextInt();
                        if (tipoNPC == 1){
                            System.out.println("¿Que nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿Qué atributo subirá este NPC?");
                            String atributoNPC = input.next();
                            System.out.println("¿En cuánto aumentará este atributo?");
                            int cantidadNPC = input.nextInt();
                            NPC temp2 = new Bueno(nameNPC, atributoNPC, cantidadNPC);
                            mundo[i] = new Planicie(temp, temp2);
                        } else if (tipoNPC == 2){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿En cuánto bajará la energía este NPC?");
                            int energiaNPC = input.nextInt();
                            System.out.println("¿En cuánto bajará el maná este NPC?");
                            int manaNPC = input.nextInt();
                            NPC temp2 = new Malo(nameNPC, energiaNPC, manaNPC);
                            mundo[i] = new Planicie(temp, temp2);
                        } else if (tipoNPC == 3){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿Cuál será el requisito de la misión que entregue este NPC?  (v/m)");
                            char requisitoNPC = input.next().charAt(0);
                            System.out.println("¿Cuál será el valor de este requisito?");
                            int valorNPC = input.nextInt();
                            System.out.println("¿Cuál será la cantidad de xp que se entregará como recompensa?");
                            int recomNPC = input.nextInt();
                            NPC temp2 = new Neutro(nameNPC, requisitoNPC, valorNPC, recomNPC);
                            mundo[i] = new Planicie(temp, temp2);
                        }
                        //mundo[i] = new Planicie(temp7, temp8);
                    } else if (siono == 2){
                        System.out.println("¿Cuál será el nombre del Jefe Final?");
                        String nombre_j = input.next();
                        System.out.println("¿Cantidad de vida del Jefe Final?");
                        int vida_j = input.nextInt();
                        System.out.println("¿Cantidad de daño base del Jefe Final?");
                        int dano_j = input.nextInt();
                        Jefe_Final temp = new Jefe_Final(nombre_j, vida_j, dano_j);
                        mundo[i] = new Planicie(temp);
                    }
                }

            } else if (tipo == 3){
                System.out.println("¿Quieres que haya un monstruo o un Jefe final en esta casilla?");
                System.out.println("1: Monstruo");
                System.out.println("2: Jefe final");
                int mon_jefe = input.nextInt();
                if (mon_jefe == 1) {
                    System.out.println("¿Quieres un que haya un NPC en esta casilla?");
                    System.out.println("1: Si");
                    System.out.println("2: No");
                    int siono = input.nextInt();
                    if (siono == 1){
                        System.out.println("¿Cantidad de vida del monstruo?");
                        int vida_m = input.nextInt();
                        System.out.println("¿Cantidad de daño del monstruo?");
                        int dano_m = input.nextInt();
                        Monstruo temp = new Monstruo(vida_m, dano_m);
                        //NPC temp0;
                        System.out.println("¿Qué tipo de NPC quieres en esta casilla?");
                        System.out.println("1: Bueno");
                        System.out.println("2: Malo");
                        System.out.println("3: Neutro");
                        int tipoNPC = input.nextInt();
                        if (tipoNPC == 1){
                            System.out.println("¿Que nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿Qué atributo subirá este NPC?");
                            String atributoNPC = input.next();
                            System.out.println("¿En cuánto aumentará este atributo?");
                            int cantidadNPC = input.nextInt();
                            NPC temp2 = new Bueno(nameNPC, atributoNPC, cantidadNPC);
                            mundo[i] = new Bosque(temp, temp2);
                        } else if (tipoNPC == 2){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿En cuánto bajará la energía este NPC?");
                            int energiaNPC = input.nextInt();
                            System.out.println("¿En cuánto bajará el maná este NPC?");
                            int manaNPC = input.nextInt();
                            NPC temp2 = new Malo(nameNPC, energiaNPC, manaNPC);
                            mundo[i] = new Bosque(temp, temp2);
                        } else if (tipoNPC == 3){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿Cuál será el requisito de la misión que entregue este NPC?  (v/m)");
                            char requisitoNPC = input.next().charAt(0);
                            System.out.println("¿Cuál será el valor de este requisito?");
                            int valorNPC = input.nextInt();
                            System.out.println("¿Cuál será la cantidad de xp que se entregará como recompensa?");
                            int recomNPC = input.nextInt();
                            NPC temp2 = new Neutro(nameNPC, requisitoNPC, valorNPC, recomNPC);
                            mundo[i] = new Bosque(temp, temp2);
                        }
                        //mundo[i] = new Bosque(temp9, temp0);
                    } else if (siono == 2){
                        System.out.println("¿Cantidad de vida del monstruo?");
                        int vida_m = input.nextInt();
                        System.out.println("¿Cantidad de daño del monstruo?");
                        int dano_m = input.nextInt();
                        Monstruo temp = new Monstruo(vida_m, dano_m);
                        mundo[i] = new Bosque(temp);
                    }
                } else if (mon_jefe == 2){
                    System.out.println("¿Quieres un que haya un NPC en esta casilla?");
                    System.out.println("1: Si");
                    System.out.println("2: No");
                    int siono = input.nextInt();
                    if (siono == 1){
                        System.out.println("¿Cuál será el nombre del Jefe Final?");
                        String nombre_j = input.next();
                        System.out.println("¿Cantidad de vida del Jefe Final?");
                        int vida_j = input.nextInt();
                        System.out.println("¿Cantidad de daño base del Jefe Final?");
                        int dano_j = input.nextInt();
                        Jefe_Final temp = new Jefe_Final(nombre_j, vida_j, dano_j);
                        //NPC temp11;
                        System.out.println("¿Qué tipo de NPC quieres en esta casilla?");
                        System.out.println("1: Bueno");
                        System.out.println("2: Malo");
                        System.out.println("3: Neutro");
                        int tipoNPC = input.nextInt();
                        if (tipoNPC == 1){
                            System.out.println("¿Que nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿Qué atributo subirá este NPC?");
                            String atributoNPC = input.next();
                            System.out.println("¿En cuánto aumentará este atributo?");
                            int cantidadNPC = input.nextInt();
                            NPC temp2 = new Bueno(nameNPC, atributoNPC, cantidadNPC);
                            mundo[i] = new Bosque(temp, temp2);
                        } else if (tipoNPC == 2){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿En cuánto bajará la energía este NPC?");
                            int energiaNPC = input.nextInt();
                            System.out.println("¿En cuánto bajará el maná este NPC?");
                            int manaNPC = input.nextInt();
                            NPC temp2 = new Malo(nameNPC, energiaNPC, manaNPC);
                            mundo[i] = new Bosque(temp, temp2);
                        } else if (tipoNPC == 3){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.next();
                            System.out.println("¿Cuál será el requisito de la misión que entregue este NPC?  (v/m)");
                            char requisitoNPC = input.next().charAt(0);
                            System.out.println("¿Cuál será el valor de este requisito?");
                            int valorNPC = input.nextInt();
                            System.out.println("¿Cuál será la cantidad de xp que se entregará como recompensa?");
                            int recomNPC = input.nextInt();
                            NPC temp2 = new Neutro(nameNPC, requisitoNPC, valorNPC, recomNPC);
                            mundo[i] = new Bosque(temp, temp2);
                        }
                        //mundo[i] = new Bosque(temp10, temp11);
                    } else if (siono == 2){
                        System.out.println("¿Cuál será el nombre del Jefe Final?");
                        String nombre_j = input.next();
                        System.out.println("¿Cantidad de vida del Jefe Final?");
                        int vida_j = input.nextInt();
                        System.out.println("¿Cantidad de daño base del Jefe Final?");
                        int dano_j = input.nextInt();
                        Jefe_Final temp = new Jefe_Final(nombre_j, vida_j, dano_j);
                        mundo[i] = new Bosque(temp);
                    }
                }
            }
        }
        System.out.println("¿En cuál casilla empezará el jugador (0-"+Integer.toString(tamano-1)+") ?");
        int casilla_jugador = input.nextInt();
        System.out.println("<===== Fin del menú del DM =====>");

        System.out.println("<===== Menú del Jugador =====>");
        System.out.println("???: ¡Bienvenido a The Legend of Morio!");
        System.out.println("???: Antes de continuar, ¡dime tu nombre!");
        String nombre_jugador = input.next();
        System.out.println("???: ¿"+nombre_jugador+"?, lindo nombre");
        System.out.println("???: Bueno "+nombre_jugador+", no tenemos mucho tiempo, puede que aparezca un monstruo si no somos precavidos.");
        System.out.println("    *Se oyen unos gruñidos a lo lejos, ambos lo escucharon*");
        System.out.println("???: Eso no se oye muy amistoso que digamos, rápido, dime con qué eres mas diestro, ¿espada o hechizos?");
        System.out.println("    1: Creo tener más destreza con la espada...");
        System.out.println("    2: Mi mamá decia que tengo cara de hechizero...");
        System.out.println("    3: No sé, en la escuela me iba bien en tanto en esgrima como en magia...");
        int eleccion = input.nextInt();
        if (eleccion == 1){
            System.out.println("???: ¿Enserio?, ¡entonces creo que lo mejor será que seas un guerrero!");
            System.out.println("???: Bueno, ¡para eso necesitarás una espada!");
            System.out.println("???: Ah, y toma esta varita por si decides que te gustaria practicar un poco de magia");
            System.out.println("    *Se escuchan nuevamente unos gruñidos, pero esta vez más cerca que antes*");
            System.out.println("???: ¡Ah! No no no, no quiero ver a cualquiera sea esa cosa que hizo ese ruido, ¡adiós "+nombre_jugador+"!");
            System.out.println("    *El misterioso individuo se marcha*");
            System.out.println(nombre_jugador+": Bueno, creo que debo marcharme antes de que aparezca ese monstruo!");
            Jugador player = new Guerrero(nombre_jugador);
        } else if (eleccion == 2){
            System.out.println("???: ¿De verdad?, ¡entonces creo que lo mejor será que seas un mago!");
            System.out.println("???: Bueno, ¡para eso necesitarás una varita y una gorra de hechizero!");
            System.out.println("???: Ah, y toma esta navaja por si te encuentras en peligro y pierdes tu varita");
            System.out.println("    *Se escuchan nuevamente unos gruñidos, pero esta vez más cerca que antes*");
            System.out.println("???: ¡Ah! No no no, no quiero ver a cualquiera sea esa cosa que hizo ese ruido, ¡adiós "+nombre_jugador+"!");
            System.out.println("    *El misterioso individuo se marcha*");
            System.out.println(nombre_jugador+": Bueno, creo que debo marcharme antes de que aparezca ese monstruo!");
            Jugador player = new Mago(nombre_jugador);
        } else if (eleccion == 3){
            System.out.println("???: ¿Enserio?, ¡entonces creo que lo mejor será que seas un druida!");
            System.out.println("???: Bueno, para eso necesitarás... ¿Qué es lo que usan los druidas?");
            System.out.println("???: Ni idea... bueno, toma esta cuchilla y este bastón, seguro sabrás arreglartelas");
            System.out.println("    *Se escuchan nuevamente unos gruñidos, pero esta vez más cerca que antes*");
            System.out.println("???: ¡Ah! No no no, no quiero ver a cualquiera sea esa cosa que hizo ese ruido, ¡adiós "+nombre_jugador+"!");
            System.out.println("    *El misterioso individuo se marcha*");
            System.out.println(nombre_jugador+": Bueno, creo que debo marcharme antes de que aparezca ese monstruo!");
            Jugador player = new Druida(nombre_jugador);
        }

    }
}   