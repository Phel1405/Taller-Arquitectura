package com.phel.architectureauth.repository

import com.phel.architectureauth.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

interface UserRepository: JpaRepository<UserEntity, Long> {
    fun findByEmailContainsIgnoreCase(query: String): List<UserEntity>
}