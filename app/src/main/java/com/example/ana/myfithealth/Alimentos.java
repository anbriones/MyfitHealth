package com.example.ana.myfithealth;

public class Alimentos {

    public String nombre;
    public Integer calorias;


    public Alimentos(String nombre, Integer calorias) {
        this.nombre = nombre;
        this.calorias = calorias;

    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCalorias() {
        return calorias;
    }


}