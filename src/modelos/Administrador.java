/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author PC
 */
public class Administrador {
    private String nombre;
    private String apellido;
    private int dni;
    private String clave;
    private String nombreUsuario;

    
    public Administrador(String nombre, String apellido, int dni, String clave, String nombreUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.clave = clave;
        this.nombreUsuario = nombreUsuario;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public String toString() {
        return "** Administrador **" + "\n" + "Nombre: " + this.nombre + "\n" + "Apellido: " + this.apellido + 
                "\n" + "DNI: " + this.dni + "\n" + "Nombre de Usuario: " + this.nombreUsuario + "\n" + "Clave: " + this.clave;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Administrador) {
            Administrador admin = (Administrador) o;
            if(this.nombre.equals(admin.getNombre()) && this.apellido.equals(admin.getApellido()) && this.dni == admin.getDni() && this.clave.equals(admin.getClave()) && this.nombreUsuario.equals(admin.getNombreUsuario()) ) {
                return true;
            }
        }
        
        return false;
    }
    
}
