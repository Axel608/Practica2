/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.repaso;

public class EjerciciosPropuestos {
    /**
     * Sirve para calcular la cuota mensual de un prestamp
     * @param prestamo es el valor del prestamo
     * @param interes es el interes del prestamo
     * @param plazoa es el plaso en años del prestamo
     * @return 
     */
    
    public double cuotames (int prestamo, double interes, int plazoa){
        double cuotamensual;
        double interesesmes = interes/12;
        interesesmes = interesesmes/100;
        double suma = interesesmes +1;
        plazoa =  plazoa * 12;
        cuotamensual = (prestamo*((interesesmes*(Math.pow((suma), plazoa)))))/((Math.pow(suma,plazoa)-1));
        
        
        return cuotamensual;
    }
    /**
     * Sirve para calcular la amortizacion de el prestamo
     * @param prestamo es el valor del prestamo
     * @param interes es el interes del prestamo
     * @param plazoa es el plazo en años del prestamo
     * @param cuotames es la cuota mensual del prestamo
     * @return 
     */
    public double amortizacion (int prestamo, double interes, int plazoa, double cuotames){
        double amortizaciona = 0;
        int año = 1;
        double interesesmes = (interes/12)/100;
        double prestamorestante = prestamo;
        double interesesg;
        double capitalrestante;
        for(int i=1; i<=12;i++){
            System.out.println(" --- Mes " + i + " (saldo $" + String.format("%.2f", prestamorestante) + ") ---");
            System.out.println("");
            System.out.println("Cuota mensual: $" + String.format("%.2f", cuotames));
            System.out.println("");
            interesesg = prestamorestante * interesesmes;
            System.out.println("Interes cobrados: $" + String.format("%.2f", interesesg));
            System.out.println("");
            capitalrestante = cuotames - interesesg;
            System.out.println("Capital amortizado: $" + String.format("%.2f", capitalrestante));
            System.out.println("");
            prestamorestante = prestamorestante - capitalrestante;
            System.out.println("Saldo restante: $" + String.format("%.2f", prestamorestante));
            System.out.println("");
            amortizaciona += capitalrestante;
            if(i==12 && año<plazoa){
                System.out.println(" --- La amortizacion anual del año " + año + " es: " + String.format("%.2f",amortizaciona) + " ---");
                System.out.println("");
                año++;
                amortizaciona = 0;
                i = 0;
            }
        }
                System.out.println("La amortizacion anual del año " + año + " es: " + String.format("%.2f",amortizaciona));

        return amortizaciona;
    }
    /**
     * Sirve para calcular el valor a pagar del agua segun su consumo
     * @param consumo es el consumo en m3
     * @return 
     */
    
        public float lojasistemaagua(int consumo) {
        float constoacancelar = 0;
        if (consumo > 60) {
            constoacancelar += (consumo - 60) * 0.35;
           constoacancelar += (20) * 0.30;
            constoacancelar += (15) * 0.20;
            constoacancelar += (10) * 0.10;
            constoacancelar += (15) * 3;
            constoacancelar += constoacancelar * 0.35;
            constoacancelar += 1.25;
        }
        if (consumo <= 60) {
            constoacancelar += (consumo - 40) * 0.30;
            constoacancelar += (15) * 0.20;
            constoacancelar += (10) * 0.10;
            constoacancelar += (15) * 3;
            constoacancelar += constoacancelar * 0.35;
            constoacancelar += 1.25;
        }
        if (consumo <= 40) {
            constoacancelar += (consumo - 25) * 0.20;
            constoacancelar += (10) * 0.10;
            constoacancelar += (15) * 3;
            constoacancelar += constoacancelar * 0.35;
            constoacancelar += 1.25;

        }
        if (consumo <= 25) {
            constoacancelar += (consumo - 15) * 0.10;
            constoacancelar += (15) * 3;
            constoacancelar += constoacancelar * 0.35;
            constoacancelar += 1.25;

        }
        if (0 < consumo && consumo <= 15) {
            constoacancelar += (consumo) * 3;
            constoacancelar += constoacancelar * 0.35;
            constoacancelar += 1.25;

        }
        return constoacancelar;

        
    }
        /**
         * Este enum sirve para buscar los datos que tenemos registrados de las lineas telefonicas con su coste x minuto y poder realizar
         * el calculo del precio de la llamada
         */
        public enum ZonasTelefonia {
    AMERICA_DEL_NORTE(12, 2.75),
    AMERICA_CENTRAL(15, 1.89),
    AMERICA_DEL_SUR(18, 1.60),
    EUROPA(19, 3.50),  
    ASIA(23, 4.50),
    AFRICA(25, 3.10),
    OCEANIA(29, 3.00),
    RESTO_DEL_MUNDO(31, 6.00);

    final int clave;
    final double precioMinuto;

    ZonasTelefonia(int clave, double precioMinuto) {
        this.clave = clave;
        this.precioMinuto = precioMinuto;
    }

    public int tenerclave() {
        return clave;
    }

    public double tenerprecioMinuto() {
        return precioMinuto;
    }

        public static ZonasTelefonia buscarPorClave(int clave) {
            for (ZonasTelefonia zona : ZonasTelefonia.values()) {
                if (zona.tenerclave() == clave) {
                    return zona;
                }
            }
            return null; 
        }
}
/**
 * sirve para simular un año en cuanto a diferentes temperaturas diarias y poder determinar el promedio y cuantas
 * olas de calor y de frio hubieron en el año
 * @return 
 */
    public float clima (){
        float promedio = 0;
        double tem;
        int olac = 0;
        int olaf = 0;
        for(int i = 1 ; i<=365 ; i++){
            tem = (Math.random()*75)-15;
            System.out.println("");
            System.out.println("--- Informe del día " + i + " ---");
            System.out.println("La temperatura del dia " + i + " es: " + (int)tem);
            promedio += tem;
            if(tem>35){
                System.out.println("--- Ola de calor ---");
                olac++;
            } if(tem<0){
                System.out.println("--- Ola de frio ---");
                olaf++;
            }
        }
        System.out.println("");
        System.out.println("--- Promerdio anual del clima ---");
        System.out.println("En el año hubieron " + olac + " olas de calor" );
        System.out.println("En el año hubieron " + olaf + " olas de frio" );
        promedio /= 365;
        return promedio;   
    }
    /**
     * Sirve para generar la multa de una biblioteca con respecto a los dias de atraso y si son mayor a 30 se imprime
     * Pendiente revision administrativa
     * @param fechaentregames es el mes de entrega
     * @param fechaentregadia es el dia de entrega
     * @param fechaactualmes es el mes actual
     * @param fechaactualdia es el dia actual
     * @return 
     */
      public double gestion (int fechaentregames, int fechaentregadia, int fechaactualmes, int fechaactualdia){
         double sumamultas =0;
         int retraso;
         if(fechaactualmes>fechaentregames){
            fechaentregadia= (fechaentregadia - 31)*-1;
             retraso = fechaactualdia + fechaentregadia; 
             sumamultas = retraso * 0.50;
             
             if((fechaactualmes-fechaentregames)>1){
             sumamultas += (((fechaactualmes-fechaentregames)-1)*31)*0.50;
             }
             if(retraso>30){
             System.out.println("--- Pendiente revision administrativa");
             }
             
         }else if (fechaactualmes==fechaentregames){
             if(fechaactualdia>fechaentregadia){
             retraso = fechaactualdia - fechaentregadia; 
             sumamultas = retraso * 0.50;
             
             if(retraso>30){
             System.out.println("--- Pendiente revision administrativa");
             }
             }
         }
         return sumamultas;
      }
    
}


    
