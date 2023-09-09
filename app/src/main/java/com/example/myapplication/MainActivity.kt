package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi komponen
        val edTglLahir = findViewById<EditText>(R.id.ed_tanggal_lahir)
        val btnClick = findViewById<Button>(R.id.btn_click)
        val tvHasil = findViewById<TextView>(R.id.tv_hasil)

        btnClick.setOnClickListener {
            val input = edTglLahir.text.toString()
            val hasil = when(input.toInt()) {
                in 1946..1964 -> "Baby Boomers"
                in 1965..1980 -> "X"
                in 1981..1995 -> "Millenials"
                in 1996..2010 -> "Z"
                else -> "Gatau mas"
            }
            tvHasil.text = "Kamu generasi $hasil"
        }
    }
}