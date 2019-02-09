package com.rafael.pessoa.starwars.data.local.converter

import android.arch.persistence.room.TypeConverter
import java.util.*

object DateConverter{

    @TypeConverter @JvmStatic
    fun toDate(timeStamp: Long?): Date? {
        return if(timeStamp == null) null else Date(timeStamp)
    }

    @TypeConverter @JvmStatic
    fun toTimeStamp(date: Date?): Long? {
        return date?.time
    }

}
