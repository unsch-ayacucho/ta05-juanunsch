/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Héctor
 */
public class PruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Probando la clase Empleando
        Empleado e1 = new Empleado(15145,"Mario","Sistemas",
                2500,8,false);
        
        System.out.println("Monto por horas extras: " +e1.monto_horasExtras());
        System.out.println("Monto por AFP: " + e1.montoAFP());
        System.out.println("Monto por SNP: " + e1.montoSNP());
        System.out.println("Monto por Salud: " + e1.montoSalud());
        System.out.println("Monto total de Descuento: " + 
                e1.monto_totalDescuentos());
        System.out.println("Sueldo neto: " + e1.monto_sueldoNeto());
        System.out.println("Suelto total: " + e1.monto_SueldoTotal());
        
        
        
    }
    
}
