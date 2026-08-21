package com.phel.architectureauth.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(
    name = "products"
)
class ProductEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(nullable = false)
    var nombre: String = "",

    @Column
    var descripcion: String,

    @Column(nullable = false)
    var precio: Float,

    @Column(nullable = false)
    var cantidad: Int,
)