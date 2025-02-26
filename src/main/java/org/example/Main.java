package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int moneda20 = 0, moneda50 = 0, moneda100 = 0, moneda200 = 0, moneda500 = 0;
        int opcion = 0, moneda = 0;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Ingresar monedas");
            System.out.println("2. Contar monedas");
            System.out.println("3. Total por moneda");
            System.out.println("4. Total ahorrado");
            System.out.println("5. Terminar");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("\nSeleccione la denominación de la moneda:");
                        System.out.println("1. $20");
                        System.out.println("2. $50");
                        System.out.println("3. $100");
                        System.out.println("4. $200");
                        System.out.println("5. $500");
                        System.out.println("6. Terminar");
                        System.out.print("Moneda: ");
                        moneda = teclado.nextInt();

                        switch (moneda) {
                            case 1:
                                moneda20++;
                                break;
                            case 2:
                                moneda50++;
                                break;
                            case 3:
                                moneda100++;
                                break;
                            case 4:
                                moneda200++;
                                break;
                            case 5:
                                moneda500++;
                                break;
                            case 6:
                                System.out.println("no hay mas monedas");
                                break;
                            default:
                                System.out.println("opcion no valida");
                        }
                    } while (moneda != 6);
                    break;

                case 2:
                    System.out.println("\nconteo de monedas:");
                    System.out.println("$20 = " + moneda20);
                    System.out.println("$50 = " + moneda50);
                    System.out.println("$100 = " + moneda100);
                    System.out.println("$200 = " + moneda200);
                    System.out.println("$500 = " + moneda500);
                    break;

                case 3:
                    System.out.println("\ntotal por valor:");
                    System.out.println("$20  = $" + (moneda20 * 20));
                    System.out.println("$50  = $" + (moneda50 * 50));
                    System.out.println("$100 = $" + (moneda100 * 100));
                    System.out.println("$200 = $" + (moneda200 * 200));
                    System.out.println("$500 = $" + (moneda500 * 500));
                    break;

                case 4:
                    int total = (moneda20 * 20) + (moneda50 * 50) + (moneda100 * 100) + (moneda200 * 200) + (moneda500 * 500);
                    System.out.println("\n Total ahorrado : $" + total);
                    break;

                case 5:
                    System.out.println("\n¡ahorro terminado!");
                    break;

                default:
                    System.out.println("\nopción no valida");
            }

        } while (opcion != 5);

    }
}
