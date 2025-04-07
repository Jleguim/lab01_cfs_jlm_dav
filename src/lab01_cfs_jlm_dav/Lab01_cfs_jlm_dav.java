package lab01_cfs_jlm_dav;

import java.util.Scanner;

/**
 * @author forerocatalina
 * @author ddarjona
 * @author jaleguizamo
 */
public class Lab01_cfs_jlm_dav {

    public static void main(String[] args) {
        String name, pFranja, eNombreDia = "", eNombreMes = "", address;
        int id, op_ct, s1 = 0, s2 = 0, s3 = 0, s4 = 0,
                c1 = 0, c2 = 0, c3 = 0, c4 = 0, count_product = 0,
                p1 = 0, p2 = 0, p3 = 0, p4 = 0, d1 = 0, d2 = 0,
                d3 = 0, d4 = 0, d5 = 0, pDiaSemana, pDiaMes, pMes,
                pAño, pHora, pMins, pSeg, eDiaSemana = 0, eDiaMes = 0,
                eMes = 0, eAño = 0, eHora = 0, eMins = 0, eSeg = 0,
                pHoraMilitar = 0, eAñoLargo = 0, eMaxDiasMes = 31;
        float price = 0;

        Scanner read = new Scanner(System.in);

        System.out.println("888b    888                    .d8888b.");
        System.out.println("8888b   888                   d88P  Y88b");
        System.out.println("88888b  888                   888    888");
        System.out.println("888Y88b 888  .d88b.  888  888 888         .d88b.  88888b.");
        System.out.println("888 Y88b888 d8P  Y8b `Y8bd8P' 888  88888 d8P  Y8b 888 \"88b");
        System.out.println("888  Y88888 88888888   X88K   888    888 88888888 888  888");
        System.out.println("888   Y8888 Y8b.     .d8\"\"8b. Y88b  d88P Y8b.     888  888");
        System.out.println("888    Y888  \"Y8888  888  888  \"Y8888P88  \"Y8888  888  888 ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(" .d8888b.                    888                                       8888888b.     d8888 ");
        System.out.println("d88P  Y88b                   888                                       888   Y88b   d8P888");
        System.out.println(" \"Y888b.   888  888 .d8888b  888888 .d88b.  88888b.d88b.  .d8888b      888   d88P d8P  888 ");
        System.out.println("    \"Y88b. 888  888 88K      888   d8P  Y8b 888 \"888 \"88b 88K          8888888P\" d88   888 ");
        System.out.println("      \"888 888  888 \"Y8888b. 888   88888888 888  888  888 \"Y8888b.     888 T88b  8888888888  ");
        System.out.println("Y88b  d88P Y88b 888      X88 Y88b. Y8b.     888  888  888      X88     888  T88b       888 ");
        System.out.println(" \"Y8888P\"   \"Y88888  88888P'  \"Y888 \"Y8888  888  888  888  88888P'     888   T88b      888   ");
        System.out.println("                888     ");
        System.out.println("           Y8b d88P  ");
        System.out.println("            \"Y88P\"  ");
        System.out.println("");
        System.out.println("");

        System.out.println("Bienvenido a la tienda NexGen Systems R4");
        System.out.println("Digite su nombre");
        name = read.nextLine();
        System.out.println("Digite su direccion");
        address = read.nextLine();
        System.out.println("\nCategorias de nuestros productos");
        System.out.println("  1- Laptops");
        System.out.println("  2- Smartphones");
        System.out.println("  3- Accesorios");
        System.out.println("  4- Componentes de PC");
        System.out.println("\nDigite el numero de la caterogia");
        op_ct = read.nextInt();

        // Switch Catergorias
        switch (op_ct) {
            // Categoria #1 'Laptops'
            case 1:
                // Se le asigna el stock a cada producto
                s1 = 5;
                s2 = 10;
                s3 = 3;
                s4 = 12;

                // Se le asigna el precio a cada producto
                p1 = 233000;
                p2 = 52000;
                p3 = 123000;
                p4 = 215000;

                System.out.println("\nDigite la cantidad que quiere comprar de cada producto");
                System.out.printf("Ultrabook X      - %d (Stock disponible %d)%n", p1, s1);
                c1 = read.nextInt();
                System.out.printf("Gaming Z         - %d (Stock disponible %d)%n", p2, s2);
                c2 = read.nextInt();
                System.out.printf("Workstation Pro  - %d (Stock disponible %d)%n", p3, s3);
                c3 = read.nextInt();
                System.out.printf("Chromebook Y     - %d (Stock disponible %d)%n", p4, s4);
                c4 = read.nextInt();
                break;

            // Categoria #2 'Smartphones'
            case 2:
                // Se le asigna el stock a cada producto
                s1 = 30;
                s2 = 15;
                s3 = 13;
                s4 = 6;

                // Se le asigna el precio a cada producto
                p1 = 333000;
                p2 = 350000;
                p3 = 284490;
                p4 = 104830;

                System.out.println("\nDigite la cantidad que quiere comprar de cada producto");
                System.out.printf("Galaxy Ultra   - %d (Stock disponible %d)%n", p1, s1);
                c1 = read.nextInt();
                System.out.printf("Iphone Pro     - %d (Stock disponible %d)%n", p2, s2);
                c2 = read.nextInt();
                System.out.printf("Pixel Max      - %d (Stock disponible %d)%n", p3, s3);
                c3 = read.nextInt();
                System.out.printf("OnePlus Speed  - %d (Stock disponible %d)%n", p4, s4);
                c4 = read.nextInt();
                break;

            // Categoria #3 'Accesorios'
            case 3:
                // Se le asigna el stock a cada producto
                s1 = 8;
                s2 = 2;
                s3 = 7;
                s4 = 9;

                // Se le asigna el precio a cada producto
                p1 = 50293;
                p2 = 150830;
                p3 = 230490;
                p4 = 59999;

                System.out.println("\nDigite la cantidad que quiere comprar de cada producto");
                System.out.printf("Audifonos Inalambricos  - %d (Stock disponible %d)%n", p1, s1);
                c1 = read.nextInt();
                System.out.printf("Teclado Mecanico        - %d (Stock disponible %d)%n", p2, s2);
                c2 = read.nextInt();
                System.out.printf("Mouse Gamer             - %d (Stock disponible %d)%n", p3, s3);
                c3 = read.nextInt();
                System.out.printf("Cargador Rapido         - %d (Stock disponible %d)%n", p4, s4);
                c4 = read.nextInt();
                break;

            // Categoria #4 'Componentes de PC'
            case 4:
                // Se le asigna el stock a cada producto
                s1 = 14;
                s2 = 20;
                s3 = 23;
                s4 = 25;

                // Se le asigna el precio a cada producto
                p1 = 399990;
                p2 = 370849;
                p3 = 284930;
                p4 = 83490;

                System.out.println("\nDigite la cantidad que quiere comprar de cada producto");
                System.out.printf("Tarjeta Grafica RTX  - %d (Stock disponible %d)%n", p1, s1);
                c1 = read.nextInt();
                System.out.printf("Procesador i9        - %d (Stock disponible %d)%n", p2, s2);
                c2 = read.nextInt();
                System.out.printf("SSD NVMe             - %d (Stock disponible %d)%n", p3, s3);
                c3 = read.nextInt();
                System.out.printf("Fuente de poder      - %d (Stock disponible %d)%n", p4, s4);
                c4 = read.nextInt();
                break;

            default:
                System.out.println("Error. Eligio una categoria equivocada");
                System.out.println("Por favor intente de nuevo");
                return;
        }

        if (c1 < 0) {
            System.out.println("La cantidad solicitada del 1er producto es invalida");
        } else if (c1 > s1) {
            System.out.println("La cantidad solicitada del 1er producto no esta disponible");
        } else {
            count_product += c1;
            price = c1 * p1;
            s1 -= c1;
        }

        if (c2 < 0) {
            System.out.println("La cantidad solicitada del 2do producto es invalida");
        } else if (c2 > s2) {
            System.out.println("La cantidad solicitada del 2do producto no esta disponible");
        } else {
            count_product += c2;
            price = price + (c2 * p2);
            s2 -= c2;
        }

        if (c3 < 0) {
            System.out.println("La cantidad solicitada del 3er producto es invalida");
        } else if (c3 > s3) {
            System.out.println("La cantidad solicitada del 3er producto no esta disponible");
        } else {
            count_product += c3;
            price = price + (c3 * p3);
            s3 -= c3;
        }

        if (c4 < 0) {
            System.out.println("La cantidad solicitada del 4to producto es invalida");
        } else if (c4 > s4) {
            System.out.println("La cantidad solicitada del 4to producto no esta disponible");
        } else {
            count_product += c4;
            price = price + (c4 * p4);
            s4 -= c4;
        }

        // Solicitar fecha y hora
        System.out.print("Digite el dia de la semana (1-7): ");
        pDiaSemana = read.nextInt();

        System.out.print("Digite el dia del mes (1-31): ");
        pDiaMes = read.nextInt();

        System.out.print("Digite el mes (1-12): ");
        pMes = read.nextInt();

        System.out.print("Digite el año del siglo XXI (0-99): ");
        pAño = read.nextInt();

        System.out.print("Digite la hora (1-12): ");
        pHora = read.nextInt();

        System.out.print("Digite los minutos (0-59): ");
        pMins = read.nextInt();

        System.out.print("Digite los segundos (0-59): ");
        pSeg = read.nextInt();
        read.nextLine();

        System.out.print("Digite la franja horaria (a.m. / m / p.m.): ");
        pFranja = read.nextLine();

        if (pDiaSemana < 1 || pDiaSemana > 7) {
            System.out.println("El valor proporcionado para dia de la semana es invalido.");
        } else if (pMes < 1 || pMes > 12) {
            System.out.println("El valor proporcionado para mes es invalido.");
        } else if (pAño < 0 || pAño > 99) {
            System.out.println("El valor proporcionado para año es invalido.");
        } else if (pHora < 1 || pHora > 12) {
            System.out.println("El valor proporcionado para las horas es invalido.");
        } else if (pMins < 0 || pMins > 59) {
            System.out.println("El valor proporcionado para los minutos es invalido.");
        } else if (pSeg < 0 || pSeg > 59) {
            System.out.println("El valor proporcionado para los segundos es invalido.");
        } else if (!pFranja.equals("a.m.") && !pFranja.equals("p.m.") && !pFranja.equals("m")) {
            System.out.println("El valor proporcionado para la franja horaria es invalido.");
        } else if (pFranja.equals("m") && pHora != 12) {
            System.out.println("El valor proporcionado para la hora no conicide con la franja horaria.");
        } else {
            switch (pMes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    eMaxDiasMes = 31;
                    break;
                case 2:
                    eMaxDiasMes = (pAño % 4 == 0) ? 29 : 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    eMaxDiasMes = 30;
                    break;
            }

            if (pDiaMes < 1 || pDiaMes > eMaxDiasMes) {
                System.out.println("El valor proporcionado para dia del mes es invalido.");
            } else {
                if (pHora == 12 && pFranja.equals("a.m.")) {
                    pHoraMilitar = 0;
                } else {
                    pHoraMilitar = (pHora == 12) ? 12 : pHora + 12;
                }

                eDiaSemana = pDiaSemana;
                eDiaMes = pDiaMes;
                eMes = pMes;
                eAño = pAño;

                eSeg = pSeg + 59;
                eMins = pMins + 59;
                eHora = pHoraMilitar + 23;

                if (eSeg >= 60) {
                    eSeg -= 60;
                    eMins++;
                }

                if (eMins >= 60) {
                    eMins -= 60;
                    eHora++;
                }

                if (eHora >= 24) {
                    eHora -= 24;
                    eDiaMes++;

                    eDiaSemana = (eDiaSemana == 7) ? 1 : eDiaSemana + 1;

                    if (eDiaMes > eMaxDiasMes) {
                        if (eMes == 12) {
                            eMes = 1;
                            eDiaMes = 1;
                            eAño++;
                        } else {
                            eMes++;
                            eDiaMes = 1;
                        }
                    }
                }

                switch (eDiaSemana) {
                    case 1:
                        eNombreDia = "Lunes";
                        break;
                    case 2:
                        eNombreDia = "Martes";
                        break;
                    case 3:
                        eNombreDia = "Miercoles";
                        break;
                    case 4:
                        eNombreDia = "Jueves";
                        break;
                    case 5:
                        eNombreDia = "Viernes";
                        break;
                    case 6:
                        eNombreDia = "Sabado";
                        break;
                    case 7:
                        eNombreDia = "Domingo";
                        break;
                }

                switch (eMes) {
                    case 1:
                        eNombreMes = "Enero";
                        break;
                    case 2:
                        eNombreMes = "Febrero";
                        break;
                    case 3:
                        eNombreMes = "Marzo";
                        break;
                    case 4:
                        eNombreMes = "Abril";
                        break;
                    case 5:
                        eNombreMes = "Mayo";
                        break;
                    case 6:
                        eNombreMes = "Junio";
                        break;
                    case 7:
                        eNombreMes = "Julio";
                        break;
                    case 8:
                        eNombreMes = "Agosto";
                        break;
                    case 9:
                        eNombreMes = "Septiembre";
                        break;
                    case 10:
                        eNombreMes = "Octubre";
                        break;
                    case 11:
                        eNombreMes = "Noviembre";
                        break;
                    case 12:
                        eNombreMes = "Diciembre";
                        break;
                }

                eAñoLargo = eAño + 2000;

            }
        }

        // Solicitar y verificar id
        System.out.println("Digite su ID");
        id = read.nextInt();

        if (id < 10000 || id > 99999) {
            System.out.println("Error. El ID debe tener exactamente 5 digitos numericos");
            System.out.println("Por favor intente de nuevo");
            return;
        } else {
            // Se verifica si el cliente cuenta con los requisitos para el descuento
            // Descuento #1
            if (id % 3 == 0) {
                if (count_product > 10 && price > 500000) {
                    price *= .90; // 10%
                }

                if (count_product >= 5 && count_product <= 10) {
                    price *= .95; // 5%
                }
            }

            // Descuento #2
            // Se decompone el numero para conseguir cada digito
            int id_t = id;
            d5 = id_t % 10;
            id_t = id_t / 10;
            d4 = id_t % 10;
            id_t = id_t / 10;
            d3 = id_t % 10;
            id_t = id_t / 10;
            d2 = id_t % 10;
            id_t = id_t / 10;
            d1 = id_t % 10;

            id_t = d1 + d2 + d3 + d4 + d5;

            if (id_t % 2 != 0) {
                if (count_product >= 8 && count_product <= 15) {
                    price *= .93; // 7%
                }

                if (count_product > 20 && price > 1000000) {
                    price *= .85; // 15%
                }
            }
        }

        price *= 1.19;

        System.out.println("\n\nConfirmacion de pedido ------");
        System.out.printf("%s\n%s\n", name, address);
        System.out.println("Fecha de entrega");
        System.out.printf("%s, %d de %s del %d%n", eNombreDia, eDiaMes, eNombreMes, eAñoLargo, eHora, eMins, eSeg);
        System.out.println("Hora maxima de entrega");
        System.out.printf("%d%d horas%n", eHora, eMins);
        System.out.printf("Valor de la compra incluido el IVA es de: %.2f%n", price);
    }
}
