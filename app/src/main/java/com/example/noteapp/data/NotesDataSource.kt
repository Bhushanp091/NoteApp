package com.example.noteapp.data

import com.example.noteapp.model.Note

class NotesDataSource {
    fun loadNotes():List<Note>{
        return listOf(
            Note(title = "A good Day", description = "A good Day  "),
            Note(title = "learn Kotlin", description = "Kotlin is awesome language "),
            Note(title = "Java sucks", description = "this is true java sucks "),
            Note(title = "flutter is good", description = "yeah "),
            Note(title = "hehe", description = " "),
            Note(title = "Android DEv", description = "become an android developer "),

        )
    }
}