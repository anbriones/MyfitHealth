package com.example.ana.myfithealth;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities={Alimento.class},version=1)
public abstract class DataBase  extends RoomDatabase
{
    public abstract DaoAlimentos mydao();
}
