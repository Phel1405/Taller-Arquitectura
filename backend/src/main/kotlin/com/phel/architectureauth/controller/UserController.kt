package com.phel.architectureauth.controller

import com.phel.architectureauth.dto.UserDto
import com.phel.architectureauth.service.UserService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(
    private val userService: UserService
) {

    @GetMapping
    fun loadUsers(
        @RequestParam("q", required = false) query: String?
    ): List<UserDto> {
        return userService.getUsers(query)
    }

    @PostMapping
    fun postUser(
       @Valid @RequestBody userDto: UserDto
    ): UserDto {
        return userService.insertUser(userDto)
    }

    @PutMapping
    fun putUser(
        @Valid @RequestBody userDto: UserDto
    ): UserDto{
        return userService.updateUser(userDto)
    }

    @DeleteMapping("/{id}")
    fun deleteUser(
        @PathVariable("id") id: Long
    ) {
        return userService.deleteUser(id)
    }
}