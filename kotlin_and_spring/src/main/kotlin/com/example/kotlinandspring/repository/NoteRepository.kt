package com.example.kotlinandspring.repository

import com.example.kotlinandspring.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository : CrudRepository<Note, Long> {
}