package com.example.ana.myfithealth;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "alimento")
public class Alimento {
    @Ignore
    public final static String ID = "id";
    @Ignore
    public final static String NOMBRE = "nombre";
    @Ignore
    public final static String CALORIAS = "calorias";
    @Ignore
    public final static String GRAMOS ="gramos";

    @PrimaryKey(autoGenerate = true)
    private long id;
    @ColumnInfo(name="nombre")
    private String nombre;
    @ColumnInfo(name="calorias")
    private long calorias;
    @ColumnInfo(name="gramos")
    private long gramos;

    public long getGramos() {
        return gramos;
    }

    public void setGramos(long gramos) {
        this.gramos = gramos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCalorias() {
        return calorias;
    }

    public void setCalorias(long calorias) {
        this.calorias = calorias;
    }
}

