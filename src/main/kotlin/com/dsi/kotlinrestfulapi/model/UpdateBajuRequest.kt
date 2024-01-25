package com.dsi.kotlinrestfulapi.model

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class UpdateBajuRequest(

    @field:NotBlank
    val size: String?,

    @field:NotBlank
    val warna: String?,

    @field:NotBlank
    val tipe: String?,

    @field:NotNull
    @field:Min(value = 0)
    val harga: Long?

)