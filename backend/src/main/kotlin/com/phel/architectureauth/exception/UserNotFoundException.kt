package com.phel.architectureauth.exception

class UserNotFoundException(
    private val id: Long
): RuntimeException(
    "El usuario con id $id no se encontró"
)