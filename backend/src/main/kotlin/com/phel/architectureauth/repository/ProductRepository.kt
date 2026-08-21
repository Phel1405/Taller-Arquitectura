package com.phel.architectureauth.repository

import com.phel.architectureauth.entity.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<ProductEntity, Long>{
    fun findByNombreContainsIgnoreCase(query: String): List<ProductEntity>
}