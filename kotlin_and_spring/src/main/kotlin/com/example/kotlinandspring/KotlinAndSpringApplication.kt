package com.example.kotlinandspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinAndSpringApplication

fun main(args: Array<String>) {
	runApplication<KotlinAndSpringApplication>(*args)
}
