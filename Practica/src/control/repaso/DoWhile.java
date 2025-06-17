/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.repaso;

/**
 *
 * @author DISPOSITIVO
 */
public class DoWhile {

    /**
     *  Sirve para generar valores randoms de dados hasta obtener doble 6
     * @return 
     */
    public boolean dados() {
        boolean igualdad = false;
        double dado1 = 0;
        double dado2 = 0;
        do {
            dado1 = Math.random() * 10;
            dado2 = Math.random() * 10;
            System.out.println("Dado 1: " + ((int) dado1) + " Dado 2: " + ((int) dado2));
        } while (((int) dado1) != 6 || ((int) dado2) != 6);
        igualdad = true;
        return igualdad;
    }
/**
 *  Sirve para sumar numeros aleatorios hasta alcanzar o superar el limite
 * @param limite es el limite impuesto
 * @return 
 */
    public int sumalimite(int limite) {
        int suma = 0;

        do {
            suma += ((int) (Math.random() * 10));
            if (suma > limite) {
               suma = suma - (suma - limite);
            }
            System.out.println(suma);
        } while (suma < limite);

        return suma;

    }
/**
 *  es un menu hasta que se ingresa salir
 * @param opcion es la opcioon de salir
 * @return 
 */
    public boolean menu(String opcion) {
        boolean salir = false;
        if ("Salir".equalsIgnoreCase(opcion)) {
            salir = true;
        }
        return salir;
    }
 /**
     * Este metodo te da un número aleatorio para adivinar
     * @param num  es el numero aleatorio
     * @param numusuario es el numero que ingresa el usuario en cada intento
     * @return
     */
    public boolean adivinarnumero(double num, int numusuario) {
        boolean guess = false;
        if (((int) num) == numusuario) {
            guess = true;
        } else if (numusuario < ((int) num)) {
            System.out.println("más");
        } else if (numusuario > ((int) num)) {
            System.out.println("menos");
        }

        return guess;
    }
}
