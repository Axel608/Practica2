/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.repaso;

/**
 *
 * @author DISPOSITIVO
 */
public class While {
    /**
     * sirve para que el ususario ingrese valores y sumarlos hasta el 1000
     * @param num en valor del usuari 
     * @param suma la suma
     * @return 
     */
     public boolean sumahasta1000(int num, int suma) {
        boolean pass = false;
         System.out.println("La suma es: " +suma);
        if (suma >= 1000) {
            pass = true;
        }
        return pass;

    }
     /**
      * Sirve para detectar que numero es un mutiplo de 7
      * @param num el numero ingresado por el usuario
      * @return 
      */
     public boolean multiplo7 (int num){
         boolean mul7 = false;
         if(num % 7 == 0){
             System.out.println("Multiplo de 7");
             mul7 = true;
         }
         return mul7;
     } 
     /**
      * Te da la raiz cubica del numero ingresado
      * @param numero es el número ingresado
      * @return 
      */
         public int raraizcubica(int numero) {
        int raiz = 0;
        int i1 = 0;
        int i = 1;
        while(i<=numero){
            i1 = i * i * i;
            if (i1 == numero) {
                raiz = i;
                break;
            }
            i++;
        }
        return raiz;
    }
         /**
          * Es una calculadora hasta que se ingrese salir
          * @param n1 es el primer valor ingresado por el usuario
          * @param n2 es el segundo valor ingresado por el usuario
          * @param operacion es la operacion seleccionada por el usuario
          * @return 
          */
             public double calculadora(double n1, double n2, char operacion) {
        double respuesta = 1;

        if (operacion == '*') {
            respuesta = n1 * n2;
        } else if (operacion == '/') {
            respuesta = n1 / n2;
        } else if (operacion == '+') {
            respuesta = n1 + n2;
        } else if (operacion == '-') {
            respuesta = n1 - n2;
        }
        return respuesta;

 
             }       

    /**
     * sirve para saber si la temperatura es mayor a 0
     *
     * @param tem es la temperatura
     * @return el valor de verdad
     */
    public boolean temperaturas(double tem) {
        return tem <= 0.0;
    }
}
