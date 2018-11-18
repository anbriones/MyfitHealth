package com.example.ana.myfithealth.javadb;

import android.arch.persistence.room.TypeConverter;

import com.example.ana.myfithealth.Comidas;

public class tipoConverter {
    @TypeConverter
    public static Comidas.Tipo toTipo(String tipo){
        return Comidas.Tipo.valueOf(tipo);
    }

    @TypeConverter
    public static String toString(Comidas.Tipo tipo){
        return tipo.name();
    }
}
