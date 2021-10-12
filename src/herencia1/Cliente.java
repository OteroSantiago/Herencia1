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
public class Cliente extends Persona {
    //atributos
    private int idCliente;
    private String fechaRegistro;
    private boolean vip;
    private static int contCliente;
    //constructor
    public Cliente(String fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        this.idCliente = ++Cliente.contCliente;//Hacemos referenci a la clase no al objeto
    }
    //getters and setters
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public boolean isVip() {
        return vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }
    public static int getContCliente() {
        return contCliente;
    }
    public static void setContCliente(int contCliente) {
        Cliente.contCliente = contCliente;
    }
    //toString con StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(',').append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
