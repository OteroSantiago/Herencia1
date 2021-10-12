/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

/**
 *
 * @author Santiago
 */
public class Empleado extends Persona {
    //atributos
    private int idEmpleado;
    private double sueldo;
    private static int contEmpleado;
    //constructor vacio
    public Empleado() {
        
    }
    //constructor con nombre de la clase Padre
    public Empleado(double sueldo, String nombre) {
        super(nombre);
        this.idEmpleado = ++Empleado.contEmpleado;
        this.sueldo = sueldo;
    }
    //otra forma de hacerlo, con sobrecarga de constructores
    /*public Empleado(){
        this.idEmpleado = ++Empleado.contEmpleado;
    }
    
    public Empleado(String nombre,double sueldo){
        this();//Llamamos al constructor vacio
        this.nombre=nombre;
        this.sueldo=sueldo;
    }
    */
    //getters and setters
    public int getIdEmpleado() {
        return idEmpleado;
    }
//    public void setIdEmpleado(int idEmpleado) {
//        this.idEmpleado = idEmpleado;
//    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    //toString con StringBuilder

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
    
    
   
    
    
}
