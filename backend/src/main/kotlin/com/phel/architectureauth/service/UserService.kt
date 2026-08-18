package com.phel.architectureauth.service

import com.phel.architectureauth.dto.UserDto
import com.phel.architectureauth.exception.UserNotFoundException
import com.phel.architectureauth.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun getUsers(query: String?): List<UserDto> {
        return if(query != null){
            userRepository
                .findByEmailContainsIgnoreCase(query)
                .map { it.toDto() }
        }else{
            userRepository
                .findAll()
                .map { it.toDto() }
        }
    }

    fun insertUser(user: UserDto): UserDto{
        return userRepository
            .save(user.toEntity())
            .toDto()
    }
    fun updateUser(user: UserDto): UserDto {
        return userRepository
            .save(user.toEntity())
            .toDto()
    }

    fun deleteUser(userId: Long) {
        userRepository
            .deleteById(userId)
    }
}