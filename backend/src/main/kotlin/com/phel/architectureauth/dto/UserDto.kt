package com.phel.architectureauth.dto

import com.phel.architectureauth.validation.Password
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class UserDto(
    val id: Long,

    @field:NotBlank(message = "Se requiere una dirección de email")
    @field:Email(message = "Formato incorrecto de correo")
    @field:Size(
        min = 12,
        max = 72,
        message = "El correo debe estar entre 12 y 72 caracteres"
    )
    val email: String,

    @field:NotBlank(message = "Se requiere una contraseña")
    @field:Password
    val password: String
)
