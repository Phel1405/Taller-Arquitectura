package com.phel.architectureauth.service

import com.phel.architectureauth.dto.ProductDto
import com.phel.architectureauth.dto.UserDto
import com.phel.architectureauth.entity.ProductEntity
import com.phel.architectureauth.entity.UserEntity

fun ProductEntity.toDto() = ProductDto(
    id = id,
    nombre = nombre,
    descripcion = descripcion,
    precio = precio,
    cantidad = cantidad
)

fun ProductDto.toEntity() = ProductEntity(
    id = id,
    nombre = nombre,
    descripcion = descripcion,
    precio = precio,
    cantidad = cantidad
)