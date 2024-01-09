package com.example.kotlinandspring.controller

import com.example.kotlinandspring.model.Note
import com.example.kotlinandspring.repository.NoteRepository
import org.apache.coyote.Response
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/note")
class NoteController(val noteRepository: NoteRepository) {

    @GetMapping("/")
    fun findAll() = noteRepository.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable(value = "id") id: Long): ResponseEntity<Note> {
        return noteRepository.findById(id).map { note ->
            ResponseEntity.ok(note)
        }.orElse(ResponseEntity.notFound().build())
    }

    @PostMapping("/")
    fun create(@RequestBody note: Note) =
        noteRepository.save(note)

    @PutMapping("/{id}")
    fun update(@PathVariable(value = "id") id: Long, @RequestBody noteRequest: Note): ResponseEntity<Note> {
        return noteRepository.findById(id).map { note ->
            var updated : Note = note
            updated.body = noteRequest.body
            updated.title = noteRequest.title
            ResponseEntity.ok().body(noteRepository.save(updated))
        }.orElse(ResponseEntity.notFound().build())
    }

    @DeleteMapping("/{id}")
    fun remove(@PathVariable(value = "id") id: Long) =
        noteRepository.deleteById(id)

}