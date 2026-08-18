package com.phel.architectureauth.validation

import jakarta.validation.Constraint
import jakarta.validation.Payload
import jakarta.validation.constraints.Pattern
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [])
@Pattern(
    regexp = "^(?=.*\\d).{8,}$",
    message = "La contraseña debe ser de al menos 8 caracteres e incluir algún número"
)
annotation class Password(
    val message: String = "La contraseña debe ser de al menos 8 caracteres e incluir algún número",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)
