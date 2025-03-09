package com.example.assigment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edHello : EditText = findViewById(R.id.edHello)
        val btnHello : Button = findViewById(R.id.btnHello)
        val tvHello : TextView = findViewById(R.id.tvHello)

        btnHello.setOnClickListener {
            var str : String = edHello.text.toString()
            tvHello.setText("hello, $str")
        }

    }
}