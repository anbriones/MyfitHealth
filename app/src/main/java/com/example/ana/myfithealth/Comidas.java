package com.example.ana.myfithealth;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.example.ana.myfithealth.javadb.DateConverter;
import com.example.ana.myfithealth.javadb.ListasConverter;
import com.example.ana.myfithealth.javadb.tipoConverter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;


@Entity(tableName = "comidas")
public class Comidas {

    public Comidas(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public enum Tipo{Desayuno,Comida,Merienda,Cena};

    @Ignore
    public final static String ID = "id_comida";
    @Ignore
    public final static String TIPO = "tipo";
    @Ignore
    public final static String FECHA ="fecha"; //fecha en la que se realiza la comida
    @Ignore
    public final static SimpleDateFormat FORMAT= new SimpleDateFormat("yyyy-MM-dd",Locale.US);

    @PrimaryKey(autoGenerate = true)
    private long id_comida; //id de la comida que se va a hacer
    @TypeConverters(tipoConverter.class)
    private Tipo tipo; //Desayuno comida merienda cena o que se la cree el usuario
    @TypeConverters(DateConverter.class)
    private Date fecha=new Date();
    @TypeConverters(ListasConverter.class)
    private final List<Alimento> alimentos;

    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimento(Alimento alimento){
        this.alimentos.add(alimento);
    }

    public long getId_comida() {
        return id_comida;
    }

    public void setId_comida(long id_comida) {
        this.id_comida = id_comida;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


}
