package com.example.kotlin_project

data class Note (val title: String, val note: String){
    override fun toString(): String {
        return "$title: $note."
    }
}