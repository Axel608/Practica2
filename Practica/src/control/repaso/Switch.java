/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.repaso;

/**
 *
 * @author DISPOSITIVO
 */
public class Switch {
    /**
     * te da la estacion dependiendo del numero del mes
     * @param num es el numero del mes
     * @return 
     */
    public String estacion(int num) {
        String estacion;
        switch (num) {
            case 1:
                estacion = "Invierno";
                break;

            case 2:
                estacion = "Invierno";
                break;

            case 3:
                estacion = "Invierno";
                break;

            case 4:
                estacion = "Primavera";
                break;

            case 5:
                estacion = "Primavera";
                break;

            case 6:
                estacion = "Primavera";
                break;

            case 7:
                estacion = "Verano";
                break;

            case 8:
                estacion = "Verano";
                break;

            case 9:
                estacion = "Verano";
                break;

            case 10:
                estacion = "Otoño";
                break;

            case 11:
                estacion = "Otoño";
                break;

            case 12:
                estacion = "Otoño";
                break;

            default:
                estacion = "error";
                break;

        }

        return estacion;
    }
   
/**
 *  te da el numero de dias del mes ingresado segun su numero
 * @param mes es el numero ingresado
 * @return 
 */
 public int diaMes(int mes) {
        int diaMes = 0;
        switch (mes) {
            case 1:
                diaMes = 31;
                break;
            case 2:
                diaMes = 28;
                break;
            case 3:
                diaMes = 31;
                break;
            case 4:
                diaMes = 30;
                break;
            case 5:
                diaMes = 31;
                break;
            case 6:
                diaMes = 30;
                break;
            case 7:
                diaMes = 31;
                break;
            case 8:
                diaMes = 31;
                break;
            case 9:
                diaMes = 30;
                break;
            case 10:
                diaMes = 31;
                break;
            case 11:
                diaMes = 30;
                break;
            case 12:
                diaMes = 31;
                break;
            default:
                break;

        }
        return diaMes;
    }
 /**
  * es un cajero automatico con opciones
  * @param opcion es la opcion seleccionada por el usuario
  * @return 
  */
    public String cajeroauto (int opcion){
        String operacion = "";
        switch(opcion){
            case 1:
                System.out.println("--- Depositos ---");
                System.out.print("--- Saldo a depocitar: ");
                operacion = "Deposito";
                break;
            case 2:
                System.out.println("--- Retiros ---");
                System.out.print("--- Saldo a retirar:");
                operacion = "Retiro";
                break;
            case 3:
                System.out.println("--- Consultas ---");
                System.out.println("1- Saldo de cuenta");
                System.out.println("2- Soporte");
                System.out.println("3- Cambio de clave");
                operacion = "Consulta";
                break;
            default:
                System.out.println("Eleccion erronea");
                operacion = "error";
        }
        return operacion;
    }
    /**
     * te da el precio de un boleto dependiendo el rango de la edad
     * @param rangoedad es el rango de la edad
     * @return 
     */
 public int precioboleto (int rangoedad){
     int precioboleto = 0;
     switch(rangoedad){
         case 1:
             precioboleto = 5;
             break;
         case 2:
             precioboleto = 10;
             break;
         case 3:
             precioboleto = 5;
             break;
     }
     return precioboleto;
     
 }
}
