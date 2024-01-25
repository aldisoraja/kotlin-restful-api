package com.dsi.kotlinrestfulapi.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "baju")
data class Baju(

    @Id
    val id: String,
    @Column(name = "size")
    var size: String,
    @Column(name = "warna")
    var warna: String,
    @Column(name = "tipe")
    var tipe: String,
    @Column(name = "harga")
    var harga: Long,
    @Column(name = "createAt")
    var createAt: Date,
    @Column(name = "updateAt")
    var updateAt: Date?
)