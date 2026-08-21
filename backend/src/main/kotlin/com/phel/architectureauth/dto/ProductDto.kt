package com.phel.architectureauth.dto

data class ProductDto(
    val id: Long,
    val nombre: String,
    val descripcion: String,
    val precio: Float,
    val cantidad: Int
)
