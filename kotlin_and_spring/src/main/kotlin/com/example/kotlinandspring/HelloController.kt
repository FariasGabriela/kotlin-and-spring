package com.example.kotlinandspring

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/HelloController")
class HelloController {

    @GetMapping("/")
    fun hello() =
        "Bem vindo ao primeiro endpoint de Kotlin com Spring!"

}