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
public class Alumno  {
    private int legajo;
    private String apellido;
    private String nombre;
    private Set <Materias> mat =new HashSet<Materias>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
   
    
    public void agregarMateria(Materias materia){
         mat.add(materia);
        }
    
    public int cantMaterias(Alumno alumno){
    
        System.out.println("La cantidad de materias del alumno son: "+mat.size());
        
        return 0;
    }
    
    
    
    
}
