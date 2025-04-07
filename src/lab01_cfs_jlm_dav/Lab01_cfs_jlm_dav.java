package lab01_cfs_jlm_dav;

import java.util.Scanner;

/**
 * @author forerocatalina
 * @author ddarjona
 * @author jaleguizamo
 */
public class Lab01_cfs_jlm_dav {

    public static void main(String[] args) {
        String nombre, pFranja, eNombreDia = "", eNombreMes = "", direccion;
        int id, categoria, stock_producto1 = 0, stock_producto2 = 0,
                stock_producto3 = 0, stock_producto4 = 0, cantidad_producto1 = 0,
                cantidad_producto2 = 0, cantidad_producto3 = 0,
                cantidad_producto4 = 0, sumatoria_productos = 0,
                precio_producto1 = 0, precio_producto2 = 0,
                precio_producto3 = 0, precio_producto4 = 0, pDiaSemana, pDiaMes,
                pMes, pAño, pHora, pMins, pSeg, eDiaSemana = 0, eDiaMes = 0,
                eMes = 0, eAño = 0, eHora = 0, eMins = 0, eSeg = 0,
                pHoraMilitar = 0, eAñoLargo = 0, eMaxDiasMes = 31;
        float montoTotal = 0;

        Scanner read = new Scanner(System.in);

        System.out.println("888b    888                    .d8888b.");
        System.out.println("8888b   888                   d88P  Y88b");
        System.out.println("88888b  888                   888    888");
        System.out.println("888Y88b 888  .d88b.  888  888 888         .d88b.  88888b.");
        System.out.println("888 Y88b888 d8P  Y8b `Y8bd8P' 888  88888 d8P  Y8b 888 \"88b");
        System.out.println("888  Y88888 88888888   X88K   888    888 88888888 888  888");
        System.out.println("888   Y8888 Y8b.     .d8\"\"8b. Y88b  d88P Y8b.     888  888");
        System.out.println("888    Y888  \"Y8888  888  888  \"Y8888P88  \"Y8888  888  888\n");
        System.out.println(" .d8888b.                    888                                       8888888b.     d8888 ");
        System.out.println("d88P  Y88b                   888                                       888   Y88b   d8P888");
        System.out.println(" \"Y888b.   888  888 .d8888b  888888 .d88b.  88888b.d88b.  .d8888b      888   d88P d8P  888 ");
        System.out.println("    \"Y88b. 888  888 88K      888   d8P  Y8b 888 \"888 \"88b 88K          8888888P\" d88   888 ");
        System.out.println("      \"888 888  888 \"Y8888b. 888   88888888 888  888  888 \"Y8888b.     888 T88b  8888888888  ");
        System.out.println("Y88b  d88P Y88b 888      X88 Y88b. Y8b.     888  888  888      X88     888  T88b       888 ");
        System.out.println(" \"Y8888P\"   \"Y88888  88888P'  \"Y888 \"Y8888  888  888  888  88888P'     888   T88b      888   ");
        System.out.println("                888     ");
        System.out.println("           Y8b d88P  ");
        System.out.println("            \"Y88P\"\n");

        System.out.println("Bienvenido a la tienda NexGen Systems R4");
        System.out.print("Digite su nombre: ");
        nombre = read.nextLine();

        System.out.print("Digite su direccion: ");
        direccion = read.nextLine();

        System.out.println("Categorias de nuestros productos");
        System.out.println("  1- Laptops");
        System.out.println("  2- Smartphones");
        System.out.println("  3- Accesorios");
        System.out.println("  4- Componentes de PC");
        System.out.print("Digite el numero de la categoria: ");
        categoria = read.nextInt();

        // Switch Catergorias
        switch (categoria) {
            // Categoria #1 'Laptops'
            case 1:
                // Se le asigna el stock a cada producto
                stock_producto1 = 5;
                stock_producto2 = 10;
                stock_producto3 = 3;
                stock_producto4 = 12;

                // Se le asigna el precio a cada producto
                precio_producto1 = 233000;
                precio_producto2 = 52000;
                precio_producto3 = 123000;
                precio_producto4 = 215000;

                System.out.println("\nDigite la cantidad que quiere comprar de cada producto");
                System.out.printf("Ultrabook X      - %d (Stock disponible %d)%n", precio_producto1, stock_producto1);
                cantidad_producto1 = read.nextInt();
                System.out.printf("Gaming Z         - %d (Stock disponible %d)%n", precio_producto2, stock_producto2);
                cantidad_producto2 = read.nextInt();
                System.out.printf("Workstation Pro  - %d (Stock disponible %d)%n", precio_producto3, stock_producto3);
                cantidad_producto3 = read.nextInt();
                System.out.printf("Chromebook Y     - %d (Stock disponible %d)%n", precio_producto4, stock_producto4);
                cantidad_producto4 = read.nextInt();
                break;

            // Categoria #2 'Smartphones'
            case 2:
                // Se le asigna el stock a cada producto
                stock_producto1 = 30;
                stock_producto2 = 15;
                stock_producto3 = 13;
                stock_producto4 = 6;

                // Se le asigna el precio a cada producto
                precio_producto1 = 333000;
                precio_producto2 = 350000;
                precio_producto3 = 284490;
                precio_producto4 = 104830;

                System.out.println("\nDigite la cantidad que quiere comprar de cada producto");
                System.out.printf("Galaxy Ultra   - %d (Stock disponible %d)%n", precio_producto1, stock_producto1);
                cantidad_producto1 = read.nextInt();
                System.out.printf("Iphone Pro     - %d (Stock disponible %d)%n", precio_producto2, stock_producto2);
                cantidad_producto2 = read.nextInt();
                System.out.printf("Pixel Max      - %d (Stock disponible %d)%n", precio_producto3, stock_producto3);
                cantidad_producto3 = read.nextInt();
                System.out.printf("OnePlus Speed  - %d (Stock disponible %d)%n", precio_producto4, stock_producto4);
                cantidad_producto4 = read.nextInt();
                break;

            // Categoria #3 'Accesorios'
            case 3:
                // Se le asigna el stock a cada producto
                stock_producto1 = 8;
                stock_producto2 = 2;
                stock_producto3 = 7;
                stock_producto4 = 9;

                // Se le asigna el precio a cada producto
                precio_producto1 = 50293;
                precio_producto2 = 150830;
                precio_producto3 = 230490;
                precio_producto4 = 59999;

                System.out.println("\nDigite la cantidad que quiere comprar de cada producto");
                System.out.printf("Audifonos Inalambricos  - %d (Stock disponible %d)%n", precio_producto1, stock_producto1);
                cantidad_producto1 = read.nextInt();
                System.out.printf("Teclado Mecanico        - %d (Stock disponible %d)%n", precio_producto2, stock_producto2);
                cantidad_producto2 = read.nextInt();
                System.out.printf("Mouse Gamer             - %d (Stock disponible %d)%n", precio_producto3, stock_producto3);
                cantidad_producto3 = read.nextInt();
                System.out.printf("Cargador Rapido         - %d (Stock disponible %d)%n", precio_producto4, stock_producto4);
                cantidad_producto4 = read.nextInt();
                break;

            // Categoria #4 'Componentes de PC'
            case 4:
                // Se le asigna el stock a cada producto
                stock_producto1 = 14;
                stock_producto2 = 20;
                stock_producto3 = 23;
                stock_producto4 = 25;

                // Se le asigna el precio a cada producto
                precio_producto1 = 399990;
                precio_producto2 = 370849;
                precio_producto3 = 284930;
                precio_producto4 = 83490;

                System.out.println("\nDigite la cantidad que quiere comprar de cada producto");
                System.out.printf("Tarjeta Grafica RTX  - %d (Stock disponible %d)%n", precio_producto1, stock_producto1);
                cantidad_producto1 = read.nextInt();
                System.out.printf("Procesador i9        - %d (Stock disponible %d)%n", precio_producto2, stock_producto2);
                cantidad_producto2 = read.nextInt();
                System.out.printf("SSD NVMe             - %d (Stock disponible %d)%n", precio_producto3, stock_producto3);
                cantidad_producto3 = read.nextInt();
                System.out.printf("Fuente de poder      - %d (Stock disponible %d)%n", precio_producto4, stock_producto4);
                cantidad_producto4 = read.nextInt();
                break;

            default:
                System.out.println("Error. Eligio una categoria equivocada");
                System.out.println("Por favor intente de nuevo");
                return;
        }

        if (cantidad_producto1 < 0) {
            System.out.println("La cantidad solicitada del 1er producto es invalida");
        } else if (cantidad_producto1 > stock_producto1) {
            System.out.println("La cantidad solicitada del 1er producto no esta disponible");
        } else {
            sumatoria_productos += cantidad_producto1;
            montoTotal = cantidad_producto1 * precio_producto1;
            stock_producto1 -= cantidad_producto1;
        }

        if (cantidad_producto2 < 0) {
            System.out.println("La cantidad solicitada del 2do producto es invalida");
        } else if (cantidad_producto2 > stock_producto2) {
            System.out.println("La cantidad solicitada del 2do producto no esta disponible");
        } else {
            sumatoria_productos += cantidad_producto2;
            montoTotal = montoTotal + (cantidad_producto2 * precio_producto2);
            stock_producto2 -= cantidad_producto2;
        }

        if (cantidad_producto3 < 0) {
            System.out.println("La cantidad solicitada del 3er producto es invalida");
        } else if (cantidad_producto3 > stock_producto3) {
            System.out.println("La cantidad solicitada del 3er producto no esta disponible");
        } else {
            sumatoria_productos += cantidad_producto3;
            montoTotal = montoTotal + (cantidad_producto3 * precio_producto3);
            stock_producto3 -= cantidad_producto3;
        }

        if (cantidad_producto4 < 0) {
            System.out.println("La cantidad solicitada del 4to producto es invalida");
        } else if (cantidad_producto4 > stock_producto4) {
            System.out.println("La cantidad solicitada del 4to producto no esta disponible");
        } else {
            sumatoria_productos += cantidad_producto4;
            montoTotal = montoTotal + (cantidad_producto4 * precio_producto4);
            stock_producto4 -= cantidad_producto4;
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
                pHoraMilitar = pHora;
                if (pHora == 12 && pFranja.equals("a.m.")) {
                    pHoraMilitar = 0;
                } else if (pFranja.equals("p.m.")) {
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
        System.out.print("Digite su ID: ");
        id = read.nextInt();

        if (id < 10000 || id > 99999) {
            System.out.println("Error. El ID debe tener exactamente 5 digitos numericos");
            System.out.println("Por favor intente de nuevo");
            return;
        } else {
            // Se verifica si el cliente cuenta con los requisitos para el descuento
            // Descuento #1
            if (id % 3 == 0) {
                if (sumatoria_productos >= 5 && sumatoria_productos <= 10) {
                    montoTotal *= .95; // 5%
                }

                if (sumatoria_productos > 10 && montoTotal > 500000) {
                    montoTotal *= .90; // 10%
                }
            }

            // Descuento #2
            // Se decompone el numero para conseguir cada digito
            int sumatoria = 0;
            int temp = id;
            sumatoria += temp % 10;
            temp /= 10;
            sumatoria += temp % 10;
            temp /= 10;
            sumatoria += temp % 10;
            temp /= 10;
            sumatoria += temp % 10;
            temp /= 10;
            sumatoria += temp % 10;

            if (sumatoria % 2 != 0) {
                if (sumatoria_productos >= 8 && sumatoria_productos <= 15) {
                    montoTotal *= .93; // 7%
                }

                if (sumatoria_productos > 20 && montoTotal > 1000000) {
                    montoTotal *= .85; // 15%
                }
            }
        }

        montoTotal *= 1.19;

        System.out.println("\nConfirmacion de pedido ------");
        System.out.printf("%s (#%s) \n%s \n", nombre, id, direccion);
        System.out.println("Fecha de entrega");
        System.out.printf("%s, %d de %s del %d \n", eNombreDia, eDiaMes, eNombreMes, eAñoLargo, eHora, eMins, eSeg);
        System.out.println("Hora maxima de entrega");
        System.out.printf("%02d:%02d:%02d horas \n", eHora, eMins, eSeg);
        System.out.printf("Valor de la compra incluido el IVA es de: %.2f \n", montoTotal);
    }
}
