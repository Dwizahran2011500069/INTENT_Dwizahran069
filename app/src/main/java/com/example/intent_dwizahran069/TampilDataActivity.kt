package com.example.intent_dwizahran069

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class TampilDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tampil_data_activity)

        val tvData = findViewById<TextView>(R.id.tvData)

        val nim = intent.getStringExtra("NIM")
        val nama = intent.getStringExtra("Nama")

        tvData.text = """
            Data yang dimasukkan:
            NIM: $nim
            Nama: $nama
        """.trimIndent()
    }
}