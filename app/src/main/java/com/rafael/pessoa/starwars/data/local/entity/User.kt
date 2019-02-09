package com.rafael.pessoa.starwars.data.local.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.*

@Entity
data class User(
        @PrimaryKey
        var name: String? = "",
        var height: String? = "",
        var mass: String? = "",
        var hair_color: String? = "",
        var eye_color: String? = "",
        var gender: String? = ""


)