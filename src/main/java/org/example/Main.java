package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int candidato1 = 0, candidato2 = 0, candidato3 = 0, opcion = 0, voto = 0, influencia = 0;
        int inter1=0 , tv1=0 , radio1=0  ,inter2 = 0, tv2 = 0, radio2 = 0,inter3 = 0, tv3 = 0, radio3 = 0;
        int candidato=0;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. VOTAR");
            System.out.println("2. CONOCER EL COSTO DE  CAMPAÑAS");
            System.out.println("3. RESULTADOS VOTACIONES");
            System.out.println("4. TOTAL VOTANTES");
            System.out.println("5. PORCENTAJES POR CANDIDATO");
            System.out.println("6. COSTO PROMEDIO CAMPAÑAS");
            System.out.println("7. VACIAR URNAS");
            System.out.println("8. TERMINAR OPCION ");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:
                    do {
                        System.out.println("\nSeleccione una opción:");
                        System.out.println("1. CANDIDATO 1");
                        System.out.println("2. CANDIDATO 2");
                        System.out.println("3. CANDIDATO 3");
                        System.out.println("4. TERMINAR OPCION ");
                        System.out.print("Opción: ");
                        voto = teclado.nextInt();
                        switch (voto) {
                            case 1:
                                candidato1++;
                                System.out.println("\nSu voto fue influenviado por :");
                                System.out.println("1.PUBLICIDAD EN INTERNET");
                                System.out.println("2.PUBLICIDAD EN RADIO");
                                System.out.println("3.PUBLICIDAD EN TV");
                                influencia = teclado.nextInt();
                                switch (influencia) {
                                    case 1:
                                        inter1++;
                                        break;
                                    case 2:
                                        tv1++;
                                        break;
                                    case 3:
                                        radio1++;
                                        break;
                                }break;
                            case 2:
                                candidato2++;
                                System.out.println("\nSu voto fue influenviado por :");
                                System.out.println("1.PUBLICIDAD EN INTERNET");
                                System.out.println("2.PUBLICIDAD EN RADIO");
                                System.out.println("3.PUBLICIDAD EN TV");
                                influencia = teclado.nextInt();
                                switch (influencia) {
                                    case 1:
                                        inter2++;
                                        break;
                                    case 2:
                                        tv2++;
                                        break;
                                    case 3:
                                        radio2++;
                                        break;
                                }break;
                            case 3:
                                candidato3++;
                                System.out.println("\nSu voto fue influenviado por :");
                                System.out.println("1.PUBLICIDAD EN INTERNET");
                                System.out.println("2.PUBLICIDAD EN RADIO");
                                System.out.println("3.PUBLICIDAD EN TV");
                                influencia = teclado.nextInt();
                                switch (influencia) {
                                    case 1:
                                        inter3++;
                                        break;
                                    case 2:
                                        tv3++;
                                        break;
                                    case 3:
                                        radio3++;
                                        break;
                                }break;

                            case 4:
                                System.out.println("votacion finalizada");
                                break;


                        }


                    }while (voto != 4) ;

                    break;

                case 2:
                    System.out.println("\nseleccione una opcion: :");
                    System.out.println("1.CANDIDATO 1");
                    System.out.println("2.CANDIDATO 2");
                    System.out.println("3.CANDITO 3");
                    candidato = teclado.nextInt();
                    switch (candidato) {
                        case 1:
                            System.out.println("VALOR TOTAL POR INTERNET"+inter1*700000);
                            System.out.println("VALOR TOTAL POR TELEVISION"+tv1*600000);
                            System.out.println("VALOR TOTAL POR INTERNET"+radio1*200000);
                            break;
                        case 2:
                            System.out.println("VALOR TOTAL POR INTERNET"+inter2*700000);
                            System.out.println("VALOR TOTAL POR TELEVISION"+tv2*600000);
                            System.out.println("VALOR TOTAL POR INTERNET"+radio2*200000);
                            break;
                        case 3:
                            System.out.println("VALOR TOTAL POR INTERNET"+inter3*700000);
                            System.out.println("VALOR TOTAL POR TELEVISION"+tv3*600000);
                            System.out.println("VALOR TOTAL POR INTERNET"+radio3*200000);
                            break;
                    }
                    break;
            }



        } while (opcion != 8);
    }
}

