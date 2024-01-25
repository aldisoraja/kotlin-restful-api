package com.dsi.kotlinrestfulapi.model

import java.util.*

data class BajuResponse (

    val id: String,

    val size: String,

    val warna: String,

    val tipe: String,

    val harga: Long,

    val createAt: Date,

    val updateAt: Date?
)