package com.example.notas;

public class usuario {
    public String nombre;
    public String apellido;
    public String usuario;
    public String contrasena;
    public String Direccion;
    public String MovilNro;

    public usuario(String nombre, String apellido, String usuario, String direccion, String contrasena, String movilNro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        Direccion = direccion;
        this.contrasena = contrasena;
        MovilNro = movilNro;
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

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getMovilNro() {
        return MovilNro;
    }

    public void setMovilNro(String movilNro) {
        MovilNro = movilNro;
    }
}
