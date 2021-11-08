package INF253.tarea3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
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
                        Monstruo temp1 = new Monstruo(vida_m, dano_m);
                        //NPC temp2;
                        System.out.println("¿Qué tipo de NPC quieres en esta casilla?");
                        System.out.println("1: Bueno");
                        System.out.println("2: Malo");
                        System.out.println("3: Neutro");
                        int tipoNPC = input.nextInt();
                        if (tipoNPC == 1){
                            System.out.println("¿Que nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿Qué atributo subirá este NPC?");
                            String atributoNPC = input.nextLine();
                            System.out.println("¿En cuánto aumentará este atributo?");
                            int cantidadNPC = input.nextInt();
                            NPC temp2 = new Bueno(nameNPC, atributoNPC, cantidadNPC);
                            mundo[i] = new Montana(temp1, temp2);
                        } else if (tipoNPC == 2){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿En cuánto bajará la energía este NPC?");
                            int energiaNPC = input.nextInt();
                            System.out.println("¿En cuánto bajará el maná este NPC?");
                            int manaNPC = input.nextInt();
                            NPC temp2 = new Malo(nameNPC, energiaNPC, manaNPC);
                            mundo[i] = new Montana(temp1, temp2);
                        } else if (tipoNPC == 3){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿Cuál será el requisito de la misión que entregue este NPC?  (v/m)");
                            char requisitoNPC = input.next().charAt(0);
                            System.out.println("¿Cuál será el valor de este requisito?");
                            int valorNPC = input.nextInt();
                            System.out.println("¿Cuál será la cantidad de xp que se entregará como recompensa?");
                            int recomNPC = input.nextInt();
                            NPC temp2 = new Neutro(nameNPC, requisitoNPC, valorNPC, recomNPC);
                            mundo[i] = new Montana(temp1, temp2);
                        }
                        //mundo[i] = new Montana(temp1, temp2);
                    } else if (siono == 2){
                        System.out.println("¿Cantidad de vida del monstruo?");
                        int vida_m = input.nextInt();
                        System.out.println("¿Cantidad de daño del monstruo?");
                        int dano_m = input.nextInt();
                        Monstruo temp1 = new Monstruo(vida_m, dano_m);
                        mundo[i] = new Montana(temp1);
                    }
                } else if (mon_jefe == 2){
                    System.out.println("¿Quieres un que haya un NPC en esta casilla?");
                    System.out.println("1: Si");
                    System.out.println("2: No");
                    int siono = input.nextInt();
                    if (siono == 1){
                        System.out.println("¿Cuál será el nombre del Jefe Final?");
                        String nombre_j = input.nextLine();
                        System.out.println("¿Cantidad de vida del Jefe Final?");
                        int vida_j = input.nextInt();
                        System.out.println("¿Cantidad de daño base del Jefe Final?");
                        int dano_j = input.nextInt();
                        Jefe_Final temp3 = new Jefe_Final(nombre_j, vida_j, dano_j);
                        //NPC temp4;
                        System.out.println("¿Qué tipo de NPC quieres en esta casilla?");
                        System.out.println("1: Bueno");
                        System.out.println("2: Malo");
                        System.out.println("3: Neutro");
                        int tipoNPC = input.nextInt();
                        if (tipoNPC == 1){
                            System.out.println("¿Que nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿Qué atributo subirá este NPC?");
                            String atributoNPC = input.nextLine();
                            System.out.println("¿En cuánto aumentará este atributo?");
                            int cantidadNPC = input.nextInt();
                            NPC temp4 = new Bueno(nameNPC, atributoNPC, cantidadNPC);
                            mundo[i] = new Montana(temp3, temp4);
                        } else if (tipoNPC == 2){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿En cuánto bajará la energía este NPC?");
                            int energiaNPC = input.nextInt();
                            System.out.println("¿En cuánto bajará el maná este NPC?");
                            int manaNPC = input.nextInt();
                            NPC temp4 = new Malo(nameNPC, energiaNPC, manaNPC);
                            mundo[i] = new Montana(temp3, temp4);
                        } else if (tipoNPC == 3){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿Cuál será el requisito de la misión que entregue este NPC?  (v/m)");
                            char requisitoNPC = input.next().charAt(0);
                            System.out.println("¿Cuál será el valor de este requisito?");
                            int valorNPC = input.nextInt();
                            System.out.println("¿Cuál será la cantidad de xp que se entregará como recompensa?");
                            int recomNPC = input.nextInt();
                            NPC temp4 = new Neutro(nameNPC, requisitoNPC, valorNPC, recomNPC);
                            mundo[i] = new Montana(temp3, temp4);
                        }
                        //mundo[i] = new Montana(temp3, temp4);
                    } else if (siono == 2){
                        System.out.println("¿Cuál será el nombre del Jefe Final?");
                        String nombre_j = input.nextLine();
                        System.out.println("¿Cantidad de vida del Jefe Final?");
                        int vida_j = input.nextInt();
                        System.out.println("¿Cantidad de daño base del Jefe Final?");
                        int dano_j = input.nextInt();
                        Jefe_Final temp3 = new Jefe_Final(nombre_j, vida_j, dano_j);
                        mundo[i] = new Montana(temp3);
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
                        Monstruo temp5 = new Monstruo(vida_m, dano_m);
                        //NPC temp6;
                        System.out.println("¿Qué tipo de NPC quieres en esta casilla?");
                        System.out.println("1: Bueno");
                        System.out.println("2: Malo");
                        System.out.println("3: Neutro");
                        int tipoNPC = input.nextInt();
                        if (tipoNPC == 1){
                            System.out.println("¿Que nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿Qué atributo subirá este NPC?");
                            String atributoNPC = input.nextLine();
                            System.out.println("¿En cuánto aumentará este atributo?");
                            int cantidadNPC = input.nextInt();
                            NPC temp6 = new Bueno(nameNPC, atributoNPC, cantidadNPC);
                            mundo[i] = new Planicie(temp5, temp6);
                        } else if (tipoNPC == 2){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿En cuánto bajará la energía este NPC?");
                            int energiaNPC = input.nextInt();
                            System.out.println("¿En cuánto bajará el maná este NPC?");
                            int manaNPC = input.nextInt();
                            NPC temp6 = new Malo(nameNPC, energiaNPC, manaNPC);
                            mundo[i] = new Planicie(temp5, temp6);
                        } else if (tipoNPC == 3){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿Cuál será el requisito de la misión que entregue este NPC?  (v/m)");
                            char requisitoNPC = input.next().charAt(0);
                            System.out.println("¿Cuál será el valor de este requisito?");
                            int valorNPC = input.nextInt();
                            System.out.println("¿Cuál será la cantidad de xp que se entregará como recompensa?");
                            int recomNPC = input.nextInt();
                            NPC temp6 = new Neutro(nameNPC, requisitoNPC, valorNPC, recomNPC);
                            mundo[i] = new Planicie(temp5, temp6);
                        }
                        //mundo[i] = new Planicie(temp5, temp6);
                    } else if (siono == 2){
                        System.out.println("¿Cantidad de vida del monstruo?");
                        int vida_m = input.nextInt();
                        System.out.println("¿Cantidad de daño del monstruo?");
                        int dano_m = input.nextInt();
                        Monstruo temp5 = new Monstruo(vida_m, dano_m);
                        mundo[i] = new Planicie(temp5);
                    }
                } else if (mon_jefe == 2){
                    System.out.println("¿Quieres un que haya un NPC en esta casilla?");
                    System.out.println("1: Si");
                    System.out.println("2: No");
                    int siono = input.nextInt();
                    if (siono == 1){
                        System.out.println("¿Cuál será el nombre del Jefe Final?");
                        String nombre_j = input.nextLine();
                        System.out.println("¿Cantidad de vida del Jefe Final?");
                        int vida_j = input.nextInt();
                        System.out.println("¿Cantidad de daño base del Jefe Final?");
                        int dano_j = input.nextInt();
                        Jefe_Final temp7 = new Jefe_Final(nombre_j, vida_j, dano_j);
                        //NPC temp8;
                        System.out.println("¿Qué tipo de NPC quieres en esta casilla?");
                        System.out.println("1: Bueno");
                        System.out.println("2: Malo");
                        System.out.println("3: Neutro");
                        int tipoNPC = input.nextInt();
                        if (tipoNPC == 1){
                            System.out.println("¿Que nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿Qué atributo subirá este NPC?");
                            String atributoNPC = input.nextLine();
                            System.out.println("¿En cuánto aumentará este atributo?");
                            int cantidadNPC = input.nextInt();
                            NPC temp8 = new Bueno(nameNPC, atributoNPC, cantidadNPC);
                            mundo[i] = new Planicie(temp7, temp8);
                        } else if (tipoNPC == 2){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿En cuánto bajará la energía este NPC?");
                            int energiaNPC = input.nextInt();
                            System.out.println("¿En cuánto bajará el maná este NPC?");
                            int manaNPC = input.nextInt();
                            NPC temp8 = new Malo(nameNPC, energiaNPC, manaNPC);
                            mundo[i] = new Planicie(temp7, temp8);
                        } else if (tipoNPC == 3){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿Cuál será el requisito de la misión que entregue este NPC?  (v/m)");
                            char requisitoNPC = input.next().charAt(0);
                            System.out.println("¿Cuál será el valor de este requisito?");
                            int valorNPC = input.nextInt();
                            System.out.println("¿Cuál será la cantidad de xp que se entregará como recompensa?");
                            int recomNPC = input.nextInt();
                            NPC temp8 = new Neutro(nameNPC, requisitoNPC, valorNPC, recomNPC);
                            mundo[i] = new Planicie(temp7, temp8);
                        }
                        //mundo[i] = new Planicie(temp7, temp8);
                    } else if (siono == 2){
                        System.out.println("¿Cuál será el nombre del Jefe Final?");
                        String nombre_j = input.nextLine();
                        System.out.println("¿Cantidad de vida del Jefe Final?");
                        int vida_j = input.nextInt();
                        System.out.println("¿Cantidad de daño base del Jefe Final?");
                        int dano_j = input.nextInt();
                        Jefe_Final temp7 = new Jefe_Final(nombre_j, vida_j, dano_j);
                        mundo[i] = new Planicie(temp7);
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
                        Monstruo temp9 = new Monstruo(vida_m, dano_m);
                        //NPC temp0;
                        System.out.println("¿Qué tipo de NPC quieres en esta casilla?");
                        System.out.println("1: Bueno");
                        System.out.println("2: Malo");
                        System.out.println("3: Neutro");
                        int tipoNPC = input.nextInt();
                        if (tipoNPC == 1){
                            System.out.println("¿Que nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿Qué atributo subirá este NPC?");
                            String atributoNPC = input.nextLine();
                            System.out.println("¿En cuánto aumentará este atributo?");
                            int cantidadNPC = input.nextInt();
                            NPC temp0 = new Bueno(nameNPC, atributoNPC, cantidadNPC);
                            mundo[i] = new Bosque(temp9, temp0);
                        } else if (tipoNPC == 2){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿En cuánto bajará la energía este NPC?");
                            int energiaNPC = input.nextInt();
                            System.out.println("¿En cuánto bajará el maná este NPC?");
                            int manaNPC = input.nextInt();
                            NPC temp0 = new Malo(nameNPC, energiaNPC, manaNPC);
                            mundo[i] = new Bosque(temp9, temp0);
                        } else if (tipoNPC == 3){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿Cuál será el requisito de la misión que entregue este NPC?  (v/m)");
                            char requisitoNPC = input.next().charAt(0);
                            System.out.println("¿Cuál será el valor de este requisito?");
                            int valorNPC = input.nextInt();
                            System.out.println("¿Cuál será la cantidad de xp que se entregará como recompensa?");
                            int recomNPC = input.nextInt();
                            NPC temp0 = new Neutro(nameNPC, requisitoNPC, valorNPC, recomNPC);
                            mundo[i] = new Bosque(temp9, temp0);
                        }
                        //mundo[i] = new Bosque(temp9, temp0);
                    } else if (siono == 2){
                        System.out.println("¿Cantidad de vida del monstruo?");
                        int vida_m = input.nextInt();
                        System.out.println("¿Cantidad de daño del monstruo?");
                        int dano_m = input.nextInt();
                        Monstruo temp9 = new Monstruo(vida_m, dano_m);
                        mundo[i] = new Bosque(temp9);
                    }
                } else if (mon_jefe == 2){
                    System.out.println("¿Quieres un que haya un NPC en esta casilla?");
                    System.out.println("1: Si");
                    System.out.println("2: No");
                    int siono = input.nextInt();
                    if (siono == 1){
                        System.out.println("¿Cuál será el nombre del Jefe Final?");
                        String nombre_j = input.nextLine();
                        System.out.println("¿Cantidad de vida del Jefe Final?");
                        int vida_j = input.nextInt();
                        System.out.println("¿Cantidad de daño base del Jefe Final?");
                        int dano_j = input.nextInt();
                        Jefe_Final temp10 = new Jefe_Final(nombre_j, vida_j, dano_j);
                        //NPC temp11;
                        System.out.println("¿Qué tipo de NPC quieres en esta casilla?");
                        System.out.println("1: Bueno");
                        System.out.println("2: Malo");
                        System.out.println("3: Neutro");
                        int tipoNPC = input.nextInt();
                        if (tipoNPC == 1){
                            System.out.println("¿Que nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿Qué atributo subirá este NPC?");
                            String atributoNPC = input.nextLine();
                            System.out.println("¿En cuánto aumentará este atributo?");
                            int cantidadNPC = input.nextInt();
                            NPC temp11 = new Bueno(nameNPC, atributoNPC, cantidadNPC);
                            mundo[i] = new Bosque(temp10, temp11);
                        } else if (tipoNPC == 2){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿En cuánto bajará la energía este NPC?");
                            int energiaNPC = input.nextInt();
                            System.out.println("¿En cuánto bajará el maná este NPC?");
                            int manaNPC = input.nextInt();
                            NPC temp11 = new Malo(nameNPC, energiaNPC, manaNPC);
                            mundo[i] = new Bosque(temp10, temp11);
                        } else if (tipoNPC == 3){
                            System.out.println("¿Qué nombre tendrá este NPC?");
                            String nameNPC = input.nextLine();
                            System.out.println("¿Cuál será el requisito de la misión que entregue este NPC?  (v/m)");
                            char requisitoNPC = input.next().charAt(0);
                            System.out.println("¿Cuál será el valor de este requisito?");
                            int valorNPC = input.nextInt();
                            System.out.println("¿Cuál será la cantidad de xp que se entregará como recompensa?");
                            int recomNPC = input.nextInt();
                            NPC temp11 = new Neutro(nameNPC, requisitoNPC, valorNPC, recomNPC);
                            mundo[i] = new Bosque(temp10, temp11);
                        }
                        //mundo[i] = new Bosque(temp10, temp11);
                    } else if (siono == 2){
                        System.out.println("¿Cuál será el nombre del Jefe Final?");
                        String nombre_j = input.nextLine();
                        System.out.println("¿Cantidad de vida del Jefe Final?");
                        int vida_j = input.nextInt();
                        System.out.println("¿Cantidad de daño base del Jefe Final?");
                        int dano_j = input.nextInt();
                        Jefe_Final temp10 = new Jefe_Final(nombre_j, vida_j, dano_j);
                        mundo[i] = new Bosque(temp10);
                    }
                }

            }
        }
    }
}   