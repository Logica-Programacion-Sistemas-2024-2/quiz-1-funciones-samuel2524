/*
 * This source file was generated by the Gradle 'init' task
 */
package quiz1sistemasg2;

public class App {
    

    public static void main(String[] args) {
        

        try {
            Scanner sc = new Scanner(System.in);

        //datos de entrada
        int tipoVehiculo = "";
        int tiempoVehiculo = "";
        int horas = 0;
        int tipoUsuario = 0;

        System.out.println("Bienvenido Usuario: ");
        tipoUsuario = sc.nextInt();
        sc.nextLine();

        System.out.println("que tipo de vehiculo ingreso (1,2,3): ");
        tipoVehiculo = sc.nextInt();
        sc.nextLine();

        System.out.println("Cuantas horas permanecio en el parqueadero: ");
        horas = sc.nextInt();
        sc.nextLine();
        
        
            
        

            
        } catch (Exception e) {
            
        }
        
       

    }

    /*  Implemente una funcion llamada calcularValorHora que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de vehiculo (C, M o B)
            - Un entero que representa la cantidad de horas de permanencia
        * Retorna:
            - Un entero representando el valor total de las boletas
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    public static int calcularValorHora(String tipoVehiculo, int cantidadHoras){
        try {
             int valorHora = 0;
             
            switch(tipoVehiculo){
                case "C":
                valorHora = (int)(cantidadHoras * 5000);
                break;

                case "M":
                valorHora = (int)(cantidadHoras * 3000);
                break;

                case "B":
                valorHora = (int)(cantidadHoras * 1000);
                break;


            }
            return valorHora;




        
        } catch (Exception e) {
            
            return -1;
        }




    }





    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuento que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor total de las horas
            - Un entero representando la si es estudiante o no
            - Un entero represenatando la cantidad de horas
        * Retorna:
            - Un entero representando el valor del descuento
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    public static int calcularDescuento(int valortotal, int estudiante, int cantidadHoras){

        double valorDescuento = 0;
        
        if(cantidadHoras > 4){

            valorDescuento = cantidadHoras * 0.33;
        }
        else{
            return 0;
        }

         if(cantidadHoras = 3000)

         valorDescuento = valortotal * 0.33;

         else {
            return 0;

         }

        
    






    }


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor total de las horas
            - Un entero representando el valor del descuento
        * Retorna:
            - Un entero representando el valor del total de la factura incluyendo el iva
    */
    //------------------------------------------------------------------
    
    public static calcularFactura(int valorTotalHoras, int valorDescuento){
        try {
            
            
               

        } catch (Exception e) {
            
        }


    }

    //------------------------------------------------------------------
}
