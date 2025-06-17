/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.repaso;

/**
 *
 * @author DISPOSITIVO
 */     
public class For {
    /**
     * sirve para obtener los valores de la serie fibonacci hasta un limite
     * @param lim es el limite
     * @return 
     */
    public int fibonacci(int lim) {
        int num1 = 1;
        int num2 = 0;
        int fibo = 0;

        for (int i = 0; i < lim; i++) {
            fibo =num1 + num2;
            num1 = num2;
            num2 = fibo;
            System.out.println(fibo);
        }
        return fibo;
    }
    
    /**
     * es para representar un reloj desde las 00:00:00 hasta las 23:59:59
     * @return 
     */
    public String reloj (){
        String hora = "sucessful";
        for(int h =0; h<=23; h++){
            for(int m=0; m<=59;m++){
                for(int s=0; s<=59;s++){
                    System.out.println(h + ":" + m+ ":" + s);
                }
            }
        }
        return hora;
    }
     /**
      * Este metodo sirve para obtener la Raiz cuadrada de un numero sin funciones matematicas
      * @param numero
      * @return 
      */
    public int raiz(int numero) {
        int raiz = 0;
        int num;
        for (int i = 1; i <= numero; i++) {
            num = i * i;
            if (num == numero) {
                raiz = i;
                break;
            }
        }   
        return raiz;
    }
    /**
     * Sirve para determinar que numeros son divisibles para 3 y 5 dentro del rango del 1 al 100
     * @return 
     */
    public int numerodivisor() {
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
            } else {
                System.out.println("El " + i + " No es divisor de 3 ni de 5");
            }

        }
        return num;
    }

}

