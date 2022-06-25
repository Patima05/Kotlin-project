package com.example.kotlin_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testNote: Note = Note("Заметка","Текст заметки")
        Toast.makeText(
            this,
            testNote.toString(),
            Toast.LENGTH_SHORT)
            .show()

        findViewById<Button>(R.id.test_button).setOnClickListener{ view: View ->
            Toast.makeText(
                this,
                R.string.test_toast,
                Toast.LENGTH_SHORT)
                .show()
        }

        val copyNote = testNote.copy()
        findViewById<Button>(R.id.copy_button).setOnClickListener{ view: View ->
            Toast.makeText(
                this,
                "$copyNote",
                Toast.LENGTH_SHORT)
                .show()
        }

        val daysOfWeek = listOf("Sunday", "Monday", "Tuesday", "Wednesday",
                                "Thursday", "Friday", "Saturday")
        Log.d("@@@", "-------------")
        daysOfWeek.forEach{
            Log.d("@@@", "$it")
        }

        Log.d("@@@", "-------------")
        repeat(daysOfWeek.size){
            Log.d("@@@", "${daysOfWeek[it]}")
        }

        Log.d("@@@", "-------------")
        for (i in 0 .. daysOfWeek.size - 1){
            Log.d("@@@", "${daysOfWeek[i]}")
        }

        Log.d("@@@", "-------------")
        for (element in daysOfWeek){
            Log.d("@@@", "$element")
        }

        Log.d("@@@", "-------------")
        for (i in daysOfWeek.size - 1 downTo 0 ){
            Log.d("@@@", "${daysOfWeek[i]}")
        }

    }
}