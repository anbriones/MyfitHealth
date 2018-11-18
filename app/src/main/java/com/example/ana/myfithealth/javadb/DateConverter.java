package com.example.ana.myfithealth.javadb;

import android.arch.persistence.room.TypeConverter;


import java.util.Date;

public class DateConverter {
    @TypeConverter
    public static Date toDate(Long timestamp){
    return null == timestamp ? new Date(timestamp) : null;
    }
    @TypeConverter
    public static Long toTimestamp(Date date){
        return date== null ? null : date.getTime();
    }
}
