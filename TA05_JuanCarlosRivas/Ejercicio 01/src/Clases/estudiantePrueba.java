/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Héctor
 */
public class estudiantePrueba {

    public static void main(String[] args) {
        
        Estudiante est1 = new Estudiante();

        System.out.println("Imprimiendo valores por default");
        est1.evaluarPromedio();
        
        //Asignando datos sin un Constructor
        
        est1.apellidos = "Torres Bellido";
        est1.codigo = 27182115;
        est1.especialidad = "Ing. de Sistemas";
        est1.nota1 = 15;
        est1.nota2 = 17;
        est1.nota3 = 12;
        est1.nota4 = 8;
        
        System.out.println("\n" + "Imprimiendo valores asignados");
        est1.evaluarPromedio();
        
        //Creando un nuevo objeto y usando el Constructor
        
        Estudiante est2 = new Estudiante(27162109,"Huamani","Medicina"
                ,12,15,7,6);
        
        System.out.println("\n" + "Imprimiendo valores con el Constructor");
        est2.evaluarPromedio();
        
        
    }
    
}
