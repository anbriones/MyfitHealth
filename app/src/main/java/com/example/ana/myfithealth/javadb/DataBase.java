package com.example.ana.myfithealth.javadb;



import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.ana.myfithealth.Alimento;
import com.example.ana.myfithealth.Comidas;
import com.example.ana.myfithealth.DaoAlimentos;
import com.example.ana.myfithealth.DaoComidas;


@Database(entities = {Alimento.class, Comidas.class}, version=1)
public abstract class DataBase extends RoomDatabase {

    public  abstract  DaoAlimentos daoAlim();
    public abstract DaoComidas daoCom();


}
