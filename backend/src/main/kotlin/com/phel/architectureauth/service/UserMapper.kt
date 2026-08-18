package com.phel.architectureauth.service

import com.phel.architectureauth.dto.UserDto
import com.phel.architectureauth.entity.UserEntity

fun UserEntity.toDto(): UserDto {
    return UserDto(
        id = this.id,
        email = this.email,
        password = this.password
    )
}

fun UserDto.toEntity(): UserEntity {
    return UserEntity(
        id = this.id,
        email = this.email,
        password = this.password
    )
}