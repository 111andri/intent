package com.yr.belajarintent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahDataActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TEXT = "extra text"
    }

    private lateinit var tvPenerima : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_data)

        tvPenerima = findViewById(R.id.tv_terimaData)

        val tvReceived =  intent.getStringArrayExtra(EXTRA_TEXT)
        val text = "Text yang dikirim : $tvReceived"

        tvPenerima.text = text
    }
}