/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Alumno
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Trabajo practico N°7\n");
        
        Alumno Alum1=new Alumno(1001,"Lopez","Martin");
        Alumno Alum2=new Alumno(1002,"Martinez","Brenda");
        
        
        
        
      //Set<Materias> materiasAlumno=new HashSet<Materias> ();
                
        Materias Materia1=new Materias(01,"ingles 1ro",1);
        Materias Materia2=new Materias(02,"Matematica de 1ro",1);
        Materias Materia3=new Materias(03,"Laboratorio 1",1);
             
       
       System.out.println("El alumno "+Alum1.getApellido()+" "+Alum1.getNombre());
       Alum1.agregarMateria(Materia1);
       Alum1.agregarMateria(Materia2);
       Alum1.agregarMateria(Materia3);
       Alum1.cantMaterias(Alum2);
      
       System.out.println("El alumno "+Alum2.getApellido()+" "+Alum2.getNombre());
       Alum2.agregarMateria(Materia1);
       Alum2.agregarMateria(Materia2);
       Alum2.agregarMateria(Materia3);
       Alum2.agregarMateria(Materia3); 
       Alum2.cantMaterias(Alum2);
    }
    
}
