package com.example.trabajo1ud;

public class Muebles {

    String nombre;
    String Descripción;
    String Url;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String descripción) {
        Descripción = descripción;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    @Override
    public String toString() {
        return "Muebles{" +
                "nombre='" + nombre + '\'' +
                ", Descripción='" + Descripción + '\'' +
                ", Url='" + Url + '\'' +
                '}';
    }
}
