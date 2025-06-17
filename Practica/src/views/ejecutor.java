/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import control.repaso.EjerciciosPropuestos;
import control.repaso.DoWhile;
import control.repaso.For;
import control.repaso.Switch;
import control.repaso.While;
import java.util.Scanner;

/**
 *
 * @author DISPOSITIVO
 */
public class ejecutor {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        For fo = new For();
        While wh = new While();
        Switch sw = new Switch();
        DoWhile dwh = new DoWhile();
        EjerciciosPropuestos Ep = new EjerciciosPropuestos();
        int eleccion = 0;
        System.out.println("1- For");
        System.out.println("2- While");
        System.out.println("3- Do While");
        System.out.println("4- Switch");
        System.out.println("5- Ejercicios Practica 2");
        eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Ejecicios For");
                System.out.println("1- Simular un reloj digital que va de 00:00:00 a 23:59:59 ");
                System.out.println("2- Determinar la raíz cuadrada entera de un número sin usar funciones matemáticas. ");
                System.out.println("3- Imprimir los primeros n términos de la sucesión de Fibonacci. ");
                System.out.println("4- Mostrar todos los números de 1 a 100 que no sean divisibles por 3 ni por 5. ");
                eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        String hora = fo.reloj();
                        break;
                    case 2:
                        System.out.println("Ingrese un numero para saber si raiz exacta");
                        int num = sc.nextInt();
                        int raiz = fo.raiz(num);
                        if (raiz != 0) {
                            System.out.println("La raiz de tu numero es: " + raiz);
                        } else {
                            System.out.println("Su numero no tiene raiz exacta");
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad de numeros de la serie que quiere representar");
                        num = sc.nextInt();
                        int serie = fo.fibonacci(num);
                        break;
                    case 4:
                        serie = fo.numerodivisor();
                        break;
                    default:
                        System.out.println("Eleccion erronea");
                }
                break;

            case 2:
                System.out.println("Ejecicios While");
                System.out.println("1- Leer enteros hasta que se ingrese un múltiplo de 7.  ");
                System.out.println("2- Encontrar la raíz cúbica entera de un número. ");
                System.out.println("3- Implementar una calculadora hasta que se ingrese salir ");
                System.out.println("4- Ingresar números hasta que la suma supere 1000. ");
                eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        boolean mul7 = false;
                        while (mul7 == false) {
                            System.out.println("Ingrese un numero");
                            int num = sc.nextInt();
                            mul7 = wh.multiplo7(num);
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese su numero");
                        int num = sc.nextInt();
                        int raiz = wh.raraizcubica(num);
                        if (raiz == 0) {
                            System.out.println("Su numero no tiene raiz cubica exacta");
                        } else {
                            System.out.println("La raiz cubica de tu numero es: " + raiz);
                        }
                        break;
                    case 3:
                        int salir = 1;
                        while (salir != 0) {
                            System.out.println("Ingrese su primer numero");
                            int num1 = sc.nextInt();
                            System.out.println("Ingrese su segundo numero");
                            int num2 = sc.nextInt();
                            System.out.println("Ingrese si operacion: * , / , + , - ");
                            char operacion = sc.next().charAt(0);
                            double respuesta = wh.calculadora(num1, num2, operacion);
                            System.out.println("Respuesta: " + respuesta);
                            System.out.println("Si quiere salir ingrese 0 caso contrario cualquier otro numero");
                            salir = sc.nextInt();
                        }
                        break;
                    case 4:
                        boolean mayor = false;
                        int suma = 0;
                        while (mayor == false) {
                            System.out.println("Ingrese su numero");
                            num = sc.nextInt();
                            suma += num;
                            mayor = wh.sumahasta1000(num, suma);
                        }
                        break;
                }
                break;

            case 3:
                System.out.println("Ejecicios Do While");
                System.out.println("1- Adivinar un numero secreto con pistas (mayor/menor)");
                System.out.println("2- Sumar números aleatorios hasta alcanzar un total mínimo ");
                System.out.println("3- Simular lanzamientos de dados hasta obtener doble 6");
                System.out.println("4- Menu hasta que se ingrese salir ");
                eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        boolean guess = false;
                        int num = ((int) (Math.random() * 100));
                        do {
                            System.out.println("Ingrese su numero");
                            int numusuario = sc.nextInt();
                            guess = dwh.adivinarnumero(num, numusuario);
                        } while (guess == false);
                        System.out.println("");
                        System.out.println("Felicidades");
                        break;
                    case 2:
                        System.out.println("Ingrese su limite de suma");
                        int limite = sc.nextInt();
                        int suma = dwh.sumalimite(limite);
                        break;
                    case 3:
                        boolean dados = dwh.dados();
                        break;
                    case 4:
                        boolean salir;
                        String opcion;
                        do {
                            System.out.println("--- Ingrese Salir o lo que desee ---");
                            System.out.println("--- Menu ---");
                            System.out.println("1- Camisas");
                            System.out.println("2- Pantalones");
                            System.out.println("3- Busos");
                            System.out.println("4- Gorras");
                            opcion = sc.nextLine();
                            salir = dwh.menu(opcion);
                        } while (salir != true);
                        break;
                }
                break;
            case 4:
                System.out.println("Ejecicios Switch");
                System.out.println("1- Determinar la estación del año según el número del mes ");
                System.out.println("2- Simular un menú de cajero automático con depósitos, retiros y consultas. ");
                System.out.println("3- Determinar número de días del mes ingresado ");
                System.out.println("4- Calcular precio de boletos según edad (niño, adulto, mayor)");
                eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        int num;
                        String estacion;
                        System.out.println("Ingrese un numero del 1 al 12");
                        num = sc.nextInt();
                        estacion = sw.estacion(num);
                        System.out.println("--- Su estación es: " +estacion);
                        break;
                    case 2:
                        System.out.println("--- Cajero ---");
                        System.out.println("1- Deposito");
                        System.out.println("2- Retiros");
                        System.out.println("3- Consultas");
                        int opcion = sc.nextInt();
                        String operacion = sw.cajeroauto(opcion);
                        if ("Deposito".equalsIgnoreCase(operacion)) {
                            int dinero = sc.nextInt();
                            System.out.println("Deposito hecho");
                            break;
                        } else if ("Retiro".equalsIgnoreCase(operacion)) {
                            int dinero = sc.nextInt();
                            System.out.println("Retiro hecho");
                            break;
                        } else if ("error".equalsIgnoreCase(operacion)) {
                            System.out.println("Eleccion erronea");
                            break;
                        }
                        break;
                    case 3:
                        int mesn;
                        System.out.println("Ingrese su mes en numeros");
                        mesn = sc.nextInt();
                        int diames = sw.diaMes(mesn);
                        System.out.println("su mes tiene " + diames + " dias");
                        break;
                    case 4:
                        System.out.println("Ingrese el rango de edad");
                        System.out.println("1- niño");
                        System.out.println("2- adulto");
                        System.out.println("3- mayor");
                        int rangoedad = sc.nextInt();
                        int precioboleto = sw.precioboleto(rangoedad);
                        System.out.println("El costo del boleto es: " + precioboleto);
                        break;
                }
                break;

            case 5:
                System.out.println("Ejecicios Practica 2");
                System.out.println("1- Llamadas telefónicas ");
                System.out.println("2- Gestión de préstamos en biblioteca ");
                System.out.println("3- Loja precio del agua potable ");
                    System.out.println("4- Análisis de datos climáticos ");
                System.out.println("5- Simulación de préstamo bancario ");
                eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        System.out.println("--- Calculadora de Costo de Llamadas Internacionales ---");
                        System.out.println("--- Ingrese la clave de la zona destino:");

                        for (EjerciciosPropuestos.ZonasTelefonia zona : EjerciciosPropuestos.ZonasTelefonia.values()) {
                            System.out.println("  " + zona.name() + ": " + zona.tenerclave());
                        }
                        System.out.print(" Clave: ");

                        int claveZona;
                        EjerciciosPropuestos.ZonasTelefonia zonaSeleccionada = null;

                        while (zonaSeleccionada == null) {
                            try {
                                claveZona = sc.nextInt();
                                zonaSeleccionada = EjerciciosPropuestos.ZonasTelefonia.buscarPorClave(claveZona);

                                if (zonaSeleccionada == null) {
                                    System.out.println("Clave de zona no es válida por favor, intente de nuevo");
                                    System.out.print("Clave: ");
                                }
                            } catch (java.util.InputMismatchException e) {
                                System.out.println("Entrada inválida por favor ingrese un valor valído para la clave");
                                sc.next();
                                System.out.print("Clave: ");
                            }
                        }

                        System.out.print("Ingrese el número de minutos hablados: ");
                        double minutosHablados = 0;
                        boolean minutosValidos = false;

                        while (!minutosValidos) {
                            try {
                                minutosHablados = sc.nextDouble();
                                if (minutosHablados <= 0) {
                                    System.out.println("Los minutos hablados deben ser un número positivo. Intente de nuevo.");
                                    System.out.print("Minutos: ");
                                } else {
                                    minutosValidos = true;
                                }
                            } catch (java.util.InputMismatchException e) {
                                System.out.println("Entrada inválida. Por favor, ingrese un número (puede ser decimal) para los minutos.");
                                sc.next();
                                System.out.print("Minutos: ");
                            }
                        }
                        double costoTotal = zonaSeleccionada.tenerprecioMinuto() * minutosHablados;

                        System.out.println(" Resumen de la Llamada ");
                        System.out.println("Zona seleccionada: " + zonaSeleccionada.name() + " (Clave: " + zonaSeleccionada.tenerclave() + ")");
                        System.out.println("Precio por minuto: $" + String.format("%.2f", zonaSeleccionada.tenerprecioMinuto()));
                        System.out.println("Minutos hablados: " + String.format("%.2f", minutosHablados));
                        System.out.println("Costo total de la llamada: $" + String.format("%.2f", costoTotal));

                        break;
                    case 2:
                        System.out.println("--- Sistema de biblioteca ---");
                        System.out.print("--- Mes de entrega del libro: ");
                        int fechaentregames = sc.nextInt();
                        System.out.print("--- Día de entrega del libro: ");
                        int fechaentregadia = sc.nextInt();
                        System.out.print("--- Mes actual: ");
                        int fechaactualmes = sc.nextInt();
                        System.out.print("--- Dia actual: ");
                        int fechaactualdia = sc.nextInt();
                        double multa = Ep.gestion(fechaentregames, fechaentregadia, fechaactualmes, fechaactualdia);
                        System.out.println("--- Informe ---");
                        if (multa > 0) {
                            System.out.println("--- La multa es: $" + multa);
                        } else if (multa <= 0) {
                            System.out.println("--- Libro entregado a tiempo");
                            System.out.println("--- Sin multa");
                        }

                        break;
                    case 3:
                        System.out.println("--- Infrome del agua ---");
                        System.out.print("--- Ingrese el consumo de agua en m3: ");
                        int consumo = sc.nextInt();
                        float cancelar = Ep.lojasistemaagua(consumo);
                        System.out.println("El costo a cancelar es: " + cancelar);
                        break;
                    case 4:
                        float promedio = Ep.clima();
                        System.out.println("Y el promedio anual de la temperatura es: " + (int) promedio);
                        break;
                    case 5:
                        System.out.println("--- Simulador de prestamos ---");
                        System.out.print("Ingrese el valor del prestamo: ");
                        int valor = sc.nextInt();
                        System.out.print("ingrese el interes anual del prestamo: ");
                        double intereses = sc.nextDouble();
                        System.out.print("Ingrese el plazo en del prestamo años: ");
                        int plazoaños = sc.nextInt();
                        double cuota = Ep.cuotames(valor, intereses, plazoaños);
                        System.out.println("Su cuota a pagar es: " + cuota);
                        double amortizacion = Ep.amortizacion(valor, intereses, plazoaños, cuota);
                        break;

                    default:
                        System.out.println("Eleccion erronea");
                        break;
                }

        }
    }
}
