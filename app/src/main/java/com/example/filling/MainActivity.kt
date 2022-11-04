package com.example.filling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import java.io.PrintStream
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun read(view: View){
//        val sc = Scanner(resources.openRawResource(R.raw.input))
        val sc = Scanner(openFileInput("file.txt"))
        var text = ""
        while (sc.hasNextLine())
            text += sc.nextLine() + "\n"
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }
    fun write(view: View){
        val ps = PrintStream(openFileOutput("file.txt", MODE_PRIVATE))
        ps.println("Hello Android Development")
        ps.println("I am ARS looking ahead to teach Android basics")
        ps.close()
    }
}