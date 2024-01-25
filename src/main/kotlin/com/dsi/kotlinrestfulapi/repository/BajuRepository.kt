package com.dsi.kotlinrestfulapi.repository

import com.dsi.kotlinrestfulapi.entity.Baju
import org.springframework.data.jpa.repository.JpaRepository

interface BajuRepository : JpaRepository<Baju, String> {

}