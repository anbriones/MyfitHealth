package com.example.ana.myfithealth;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface DaoAlimentos {
    @Insert
    public void addalimento(Alimento alim);
}
