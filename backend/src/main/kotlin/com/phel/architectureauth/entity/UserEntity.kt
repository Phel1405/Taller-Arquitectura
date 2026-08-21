package com.phel.architectureauth.entity

import com.phel.architectureauth.dto.Rol
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import java.time.Instant

@Entity
@Table(
    name = "users"
)
class UserEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(nullable = false)
    var nombre: String = "",

    @Column(nullable = false)
    var apellido: String = "",

    @Column(nullable = false, unique = true)
    var email: String = "",

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    var rol: Rol = Rol.USER,

    @Column(nullable = false)
    var password: String = "",

    @CreationTimestamp
    var createdAt: Instant = Instant.now()
)