package com.dsi.kotlinrestfulapi.service

import com.dsi.kotlinrestfulapi.model.*

interface BajuService {

    fun list(listBajuRequest: ListBajuRequest): List<BajuResponse>
    fun get(id: String): BajuResponse
    fun create(createBajuRequest: CreateBajuRequest): BajuResponse
    fun update(id: String, updateBajuRequest: UpdateBajuRequest): BajuResponse
    fun delete(id: String)
}