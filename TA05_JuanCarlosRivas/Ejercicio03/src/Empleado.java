
public class Empleado {
    
    //Atributos de la Clase Empleado
    int codigo;
    String nombre;
    String areaLaboral;
    float sueldo;
    int horasExtras;//por conveniencia las hora son enteros
    boolean AFP;
    //Atributos para almacenar los valores de los métodos
    float totalDescuento;
    float sueldoTotal;
    float sueldoNeto;
    
    //Creando Constructor Vacío
    public Empleado(){
        
    }
    
    //Creando Constructor con argumentos
    public Empleado(int codigo, String nombre, String areaLaboral,
            float sueldo, int horasExtras, boolean AFP){
        this.codigo = codigo;
        this.nombre = nombre;
        this.areaLaboral = areaLaboral;
        this.sueldo = sueldo;
        this.horasExtras = horasExtras;
        this.AFP = AFP;
        
    }
    //Métodos de para Obtener los Diferentes Descuentos
    
    //Creando Método para calcular el monto de horas extras
    public float monto_horasExtras(){
        
        return horasExtras*(this.sueldo/240);
    }
    
    //Creando Método para el monto de AFP
    public float montoAFP(){
        
        return this.sueldo*11/100;
    }
    
    //Sistema Nacional de Pensiones --- SNP
    
    //Creando Método para calcular monto SNP
    public float montoSNP(){
        return this.sueldo*13/100;
    }
    
    //Creando Método para calcular el monto por SALUD
    public float montoSalud(){
        return this.sueldo*3/100;
    }
    
    //Creando los Métodos para los Sueldos del Trabajador
    public float monto_totalDescuentos(){
        return totalDescuento = montoAFP()+montoSNP()
                +montoSalud();
    }
    
    public float monto_sueldoNeto(){
        return sueldoNeto = (sueldo- monto_totalDescuentos());
    }
    public float monto_SueldoTotal(){
        return sueldoTotal = sueldoNeto + monto_horasExtras();
    }
    

}
