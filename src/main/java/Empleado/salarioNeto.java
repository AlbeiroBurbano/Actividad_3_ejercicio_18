
package Empleado;

public class salarioNeto {
    public static double Calcular_salarioNeto(double salarioB, double porcentaje){
           double salarioNeto, retencion;
    retencion = (porcentaje/100)*salarioB;
    salarioNeto = salarioB - retencion;
        return salarioNeto;
    }
}
