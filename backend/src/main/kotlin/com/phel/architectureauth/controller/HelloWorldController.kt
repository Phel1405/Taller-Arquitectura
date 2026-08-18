package com.phel.architectureauth.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping
    fun helloWorld() = "Hello world!"
}