package com.example.kotlinandspring.model

import jakarta.persistence.*

@Entity
class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0;

    var title: String = ""

    var body: String = ""


}