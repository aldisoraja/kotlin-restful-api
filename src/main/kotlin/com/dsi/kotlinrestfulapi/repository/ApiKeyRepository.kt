package com.dsi.kotlinrestfulapi.repository

import com.dsi.kotlinrestfulapi.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository:JpaRepository<ApiKey, String>{
}