package com.example.intent_dwizahran069

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampil_data)

        val etNim = findViewById<EditText>(R.id.etNIM)
        val etNama = findViewById<EditText>(R.id.etNama)
        val btnProses = findViewById<Button>(R.id.btnProses)

        btnProses.setOnClickListener {
            if("${etNim.text}".isNotEmpty()&& "${etNama.text}".isNotEmpty()){
                val i = Intent(this@MainActivity, TampilDataActivity::class.java)
                i.putExtra("NIM", "${etNim.text}")
                i.putExtra("Nama", "${etNama.text}")
                startActivity(i)
            } else
                Toast.makeText(this@MainActivity, "NIM atau nama belum diisi", Toast.LENGTH_SHORT).show()
        }
    }
}