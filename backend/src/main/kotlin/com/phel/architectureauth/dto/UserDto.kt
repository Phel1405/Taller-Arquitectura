package com.phel.architectureauth.dto

import com.phel.architectureauth.validation.Password
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class UserDto(
    val id: Long,

    @field:NotBlank(message = "Se requiere un nombre")
    val nombre: String,

    @field:NotBlank(message = "Se requiere un apellido")
    val apellido: String,

    @field:NotBlank(message = "Se requiere una dirección de email")
    @field:Email(message = "Formato incorrecto de correo")
    @field:Size(
        min = 12,
        max = 72,
        message = "El correo debe estar entre 12 y 72 caracteres"
    )
    val email: String,

    @Enumerated(EnumType.STRING)
    val rol: Rol,

    @field:NotBlank(message = "Se requiere una contraseña")
    @field:Password
    val password: String
)

enum class Rol{
    USER,
    ADMIN
}
