
package Clases;


public class Estudiante {
    
    //Definiendo los Atributos
 
    int codigo;
    String apellidos;
    String especialidad;
    float nota1;
    float nota2;
    float nota3;
    float nota4;
   
    //Creando el Método Constructor
    public Estudiante(){  
    }
    
    Estudiante(int codigo, String apellidos, String especialidad,
            float n1, float n2, float n3, float n4){
        
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
        this.nota4 = n4;
       
    }
    //Creando el Método para obtener promedio
    
    float promedio;
    public void evaluarPromedio(){
        
        //Evaluando las notas
        if (nota1 < nota2 & nota1 < nota3
                & nota1 < nota4) {
            
            promedio = (nota2 + nota3 + nota4)/3;

        }
        if (nota2 < nota1 & nota2 < nota3 
                & nota2 < nota4) {
            
            promedio = (nota1 + nota3 + nota4)/3;
          
        }
        if (nota3 < nota1 & nota3 < nota2
                & nota3 < nota4) {
            
            promedio = (nota1 + nota2 + nota4)/3;
          
        }
        if (nota4 < nota1 & nota4 < nota2
                & nota4 < nota3) {
            
            promedio = (nota1 + nota3 + nota3)/3;
      
        }
            
        //FALTAR SACAR PROMEDIO SIN LA NOTA MÁS BAJA}
        
        System.out.println("Estudiante: " + apellidos 
                + "\n" + "de la especialidad: " 
                + especialidad + "\n" + "Con código: " 
                + codigo + "\n" + "Su promedio es: " 
                + promedio);
    }   
    
}
