package com.example.ana.myfithealth;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;


import java.util.List;

@Dao
public interface DaoComidas {

    @Query("SELECT * from comidas")
    public List <Comidas> obtenerComidas(); //Devuelve todos los alimentos de la base de datos

    @Insert
    public void addComidas(Comidas comida);//Inserción de datos

    @Query("DELETE from comidas")
    public void eliminarComida();
    //Update no va a haber puesto que sólo se van a poder escoger los alimentos de la base de datos y tienen datos fijos

}
